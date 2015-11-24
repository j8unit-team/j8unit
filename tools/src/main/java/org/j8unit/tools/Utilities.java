package org.j8unit.tools;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.String.join;
import static java.util.Arrays.stream;
import static java.util.Collections.nCopies;
import static java.util.Collections.singleton;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.StreamSupport.stream;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject;

public enum Utilities {
    ;

    public static final String capFirst(final String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    @FunctionalInterface
    public static interface CheckedFunction<T, R>
    extends Function<T, R> {

        public abstract R checkedApply(T t)
        throws Exception;

        @Override
        public default R apply(final T t) {
            try {
                return checkedApply(t);
            } catch (final RuntimeException any) {
                throw any;
            } catch (final Exception any) {
                throw new RuntimeException(any);
            }
        }

    }

    public static final <T, R> Function<T, R> runtimify(final CheckedFunction<T, R> func) {
        return func;
    }

    public static final <R> Supplier<R> runtimify(final Callable<R> call) {
        return () -> {
            try {
                return call.call();
            } catch (final RuntimeException any) {
                throw any;
            } catch (final Exception any) {
                throw new RuntimeException(any);
            }
        };
    }

    public static final <R> Optional<R> optionalise(final Callable<R> call, final Consumer<? super Exception> handler) {
        try {
            return Optional.ofNullable(call.call());
        } catch (final Exception any) {
            handler.accept(any);
            return Optional.empty();
        }
    }

    /**
     * @deprecated If Java 9 is released, replace this helper method by
     *             <a href="http://download.java.net/jdk9/docs/api/java/util/Optional.html#stream--">Optional#stream()
     *             </a>
     */
    @Deprecated
    public static final <T> Stream<T> toStream(final Optional<T> opt) {
        return opt.map(Stream::of).orElse(Stream.empty());
    }

    public static final Optional<Class<?>> tryLoadClass(final String name) {
        return Utilities.optionalise(() -> getSystemClassLoader().loadClass(name), e -> e.printStackTrace(System.err));
    }

    /**
     * http://stackoverflow.com/questions/1713941/is-javax-tools-depends-on-jdk
     */
    public static final Set<Class<?>> listAllClasses(final Location loc, final String pck)
    throws IOException {
        final JavaFileManager manager = getSystemJavaCompiler().getStandardFileManager(null, null, null);
        final Iterable<JavaFileObject> files = manager.list(loc, pck, singleton(CLASS), true);
        final Stream<String> names = stream(files.spliterator(), false).map(file -> manager.inferBinaryName(loc, file));
        final Stream<Class<?>> classes = names.map(Utilities::tryLoadClass).flatMap(Utilities::toStream);
        return classes.collect(toSet());
    }

    public static final boolean isReallyDeclared(final Class<?> clazz, final Method method) {
        return method.getDeclaringClass().equals(clazz) && !method.isBridge();
    }

    public static final boolean supportsSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            clazz.getMethod(method.getName(), method.getParameterTypes());
            return true;
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    public static final boolean specifiesSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            final Method m = clazz.getMethod(method.getName(), method.getParameterTypes());
            return isReallyDeclared(clazz, m);
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    public static Optional<Class<?>> getNearestMergingClass(final Class<?> clazz, final Method method) {
        // no such method at all?
        if (!supportsSuchPublicMethod(clazz, method)) {
            return Optional.empty();
        }
        // override within the class itself?
        if (specifiesSuchPublicMethod(clazz, method)) {
            return Optional.of(clazz);
        }
        // inspect super classes/interfaces
        final Stream<Class<?>> superClass = toStream(ofNullable(clazz.getSuperclass()));
        final Stream<Class<?>> superInterfaces = stream(clazz.getInterfaces());
        final Set<Class<?>> collect = Stream.concat(superClass, superInterfaces) //
                                            .map(c -> getNearestMergingClass(c, method)) //
                                            .flatMap(Utilities::toStream) //
                                            .collect(toSet());
        assert !collect.isEmpty() : "Method is supported, is not specified immediately, but (strangely) is not found within class hierarchie!";
        if (collect.size() == 1) {
            // exactly one super specifying class/interface
            return Optional.of(collect.iterator().next());
        } else {
            // more than one super specifying class/interface causes this class to effectively specify the method (aka.
            // merge ambiguity)
            return Optional.of(clazz);
        }
    }

    public static final Class<?> getBaseComponentType(final Class<?> clazz) {
        Class<?> baseCT = clazz;
        for (Class<?> ct = clazz.getComponentType(); ct != null; ct = ct.getComponentType()) {
            baseCT = ct;
        }
        return baseCT;
    }

    public static final String getJavadocName(final Class<?> clazz) {
        if (clazz.isArray()) {
            return getJavadocName(getBaseComponentType(clazz)) + join("", nCopies(clazz.getName().lastIndexOf("[") + 1, "[]"));
        } else if (ClassKind.TOP_LEVEL.matches(clazz)) {
            return clazz.getName();
        } else {
            return getJavadocName(clazz.getEnclosingClass()) + "." + clazz.getSimpleName();
        }
    }

    public static String getJavaDocName(final Executable executable) {
        final String jdClass = getJavadocName(executable.getDeclaringClass());
        final String jdMethod = executable instanceof Constructor ? executable.getDeclaringClass().getSimpleName() : executable.getName();
        final String jdParameters = stream(executable.getParameterTypes()).map(Utilities::getJavadocName).collect(joining(","));
        return jdClass + "#" + jdMethod + "(" + (executable.isVarArgs() ? toVararg(jdParameters) : jdParameters) + ")";

    }

    public static final String toVararg(final String signature) {
        if (signature.contains("[]")) {
            return signature.substring(0, signature.lastIndexOf("[]")) + "..." + signature.substring(signature.lastIndexOf("[]") + 2, signature.length());
        } else {
            return signature;
        }
    }

    public static final String toVarArgAwareString(final Executable executable) {
        return executable.isVarArgs() ? toVararg(executable.toString()) : executable.toString();
    }

    static LinkedHashMap<Class<?>, Type> getInterfaces(final Class<?> clazz) {
        final LinkedHashMap<Class<?>, Type> interfaces = new LinkedHashMap<>();
        for (int i = 0; i < clazz.getInterfaces().length; i++) {
            interfaces.put(clazz.getInterfaces()[i], clazz.getGenericInterfaces()[i]);
        }
        return interfaces;
    }

}
