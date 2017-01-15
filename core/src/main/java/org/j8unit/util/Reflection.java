package org.j8unit.util;

import static java.lang.String.format;
import static java.lang.invoke.MethodHandles.lookup;
import static java.lang.invoke.MethodHandles.Lookup.PACKAGE;
import static java.lang.invoke.MethodHandles.Lookup.PRIVATE;
import static java.lang.invoke.MethodHandles.Lookup.PROTECTED;
import static java.lang.invoke.MethodHandles.Lookup.PUBLIC;
import static java.lang.reflect.Modifier.isAbstract;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.empty;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.j8unit.J8UnitTest;
import org.junit.runners.model.TestClass;

public enum Reflection {

    ;

    /**
     * Returns a mutable, ordered {@link Set} of all {@code class}es the given Java {@code type} is representing.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java {@code type} is not a true {@code class} but an
     * {@code interface}.
     *
     * @param type
     *            the Java type to query its {@code class}es
     * @return all {@code class}es the given Java {@code type} is representing
     *
     * @since 4.12.2
     */
    public static final LinkedHashSet<Class<?>> allClassesOf(final Class<?> type) {
        return getClassHierarchy(type);
    }

    /**
     * Returns a mutable, ordered {@link Set} of all {@code interface}s the given Java {@code type} is representing.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if neither the given Java {@code type} nor any of its super-classes
     * implement an {@code interface}.
     *
     * @param type
     *            the Java type to query its {@code interface}s
     * @return all {@code interface}s the given Java {@code type} is representing
     *
     * @since 4.12.2
     */
    public static final LinkedHashSet<Class<?>> allInterfacesOf(final Class<?> type) {
        return getTypeHierarchyAsStream(type).filter(Class::isInterface).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete {@code class} hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java {@code type} is not a true {@code class} but an
     * {@code interface}.
     *
     * @apiNote For whatever reason, {@link TestClass} does not declare {@link TestClass#getSuperClasses(Class)} in a
     *          reusable way. Thus, we simply specify our own hierarchy exploration implementation.
     *
     *          In case the given {@code type} represents a true Java {@code class}, this method behaves
     *          <em>similar</em> to {@link TestClass#getSuperClasses(Class)}. If, otherwise, the given {@code type}
     *          represents an {@code interface}, this method behaves <em>differently</em>, because the set will be
     *          empty. In order to explore some interface's hierarchy, use {@link #getInterfaceHierarchy(Class)}
     *          instead.
     *
     * @see #getClassHierarchyAsStream(Class)
     * @see #getInterfaceHierarchy(Class)
     * @see #getTypeHierarchy(Class)
     *
     * @param type
     *            the Java {@code class} to query its class hierarchy
     * @return the class' hierarchy
     *
     * @since 4.12.2
     */
    public static final LinkedHashSet<Class<?>> getClassHierarchy(final Class<?> type) {
        return getClassHierarchyAsStream(type).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete {@code class} hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * This method also returns an empty stream if the given Java {@code type} is not a true {@code class} but an
     * {@code interface}.
     *
     * @implSpec Java does not allow cyclic type hierarchy. Thus, this recursive implementation will definitely come to
     *           an end.
     *
     * @see #getClassHierarchy(Class)
     * @see #getInterfaceHierarchyAsStream(Class)
     * @see #getTypeHierarchyAsStream(Class)
     *
     * @param type
     *            the Java {@code class} to query its class hierarchy
     * @return the class' hierarchy
     *
     * @since 4.12.2
     */
    public static final Stream<Class<?>> getClassHierarchyAsStream(final Class<?> type) {
        if (type == null) {
            return empty();
        } else if (type.isInterface()) {
            return empty();
        } else {
            return concat(Stream.of(type), getClassHierarchyAsStream(type.getSuperclass()));
        }
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete {@code interface} hierarchy of the given Java
     * {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * This method also returns an empty set if the given Java {@code type} is not a true {@code interface} but a
     * {@code class}.
     *
     * @see #getInterfaceHierarchyAsStream(Class)
     * @see #getClassHierarchy(Class)
     * @see #getTypeHierarchy(Class)
     *
     * @param type
     *            the Java {@code interface} to query its interface hierarchy
     * @return the interface's hierarchy
     *
     * @since 4.12.2
     */
    public static final LinkedHashSet<Class<?>> getInterfaceHierarchy(final Class<?> type) {
        return getInterfaceHierarchyAsStream(type).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete {@code interface} hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * This method also returns an empty stream if the given Java {@code type} is not a true {@code interface} but a
     * {@code class}.
     *
     * @implSpec Java does not allow cyclic type hierarchy. Thus, this recursive implementation will definitely come to
     *           an end.
     *
     * @see #getInterfaceHierarchy(Class)
     * @see #getClassHierarchyAsStream(Class)
     * @see #getTypeHierarchyAsStream(Class)
     *
     * @param type
     *            the Java {@code interface} to query its interface hierarchy
     * @return the interface's hierarchy
     *
     * @since 4.12.2
     */
    public static final Stream<Class<?>> getInterfaceHierarchyAsStream(final Class<?> i) {
        if (i == null) {
            return empty();
        } else if (!i.isInterface()) {
            return empty();
        } else {
            return concat(Stream.of(i), stream(i.getInterfaces()).flatMap(x -> getInterfaceHierarchyAsStream(x)));
        }
    }

    /**
     * Returns a mutable, ordered {@link Set} of the complete type hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according empty set.
     *
     * If the given {@code type} represents a true {@code interface}, this method returns the according
     * {@linkplain #getInterfaceHierarchy(Class) interface hierarchy}.
     *
     * If the given {@code type} represents a true {@code code}, this method returns the complete
     * {@linkplain #getClassHierarchy(Class) class hierarchy} whereas each class is immediately followed by
     * {@linkplain #getInterfaceHierarchy(Class) all interfaces} it represents.
     *
     * @see #getTypeHierarchyAsStream(Class)
     * @see #getClassHierarchy(Class)
     * @see #getInterfaceHierarchy(Class)
     *
     * @param type
     *            the Java type to query its type hierarchy
     * @return the type's hierarchy
     *
     * @since 4.12.2
     */
    public static final LinkedHashSet<Class<?>> getTypeHierarchy(final Class<?> type) {
        return getTypeHierarchyAsStream(type).collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns a {@link Stream} of the complete type hierarchy of the given Java {@code type}.
     *
     * This method is {@code null} safe, meaning it returns an according {@linkplain Stream#empty() empty} stream.
     *
     * If the given {@code type} represents a true {@code interface}, this method returns the according
     * {@linkplain #getInterfaceHierarchyAsStream(Class) interface hierarchy}.
     *
     * If the given {@code type} represents a true {@code code}, this method returns the complete
     * {@linkplain #getClassHierarchyAsStream(Class) class hierarchy} whereas each class is immediately followed by
     * {@linkplain #getInterfaceHierarchyAsStream(Class) all interfaces} it represents.
     *
     * @see #getTypeHierarchy(Class)
     * @see #getClassHierarchyAsStream(Class)
     * @see #getInterfaceHierarchyAsStream(Class)
     *
     * @param type
     *            the Java type to query its class hierarchy
     * @return the type's hierarchy
     *
     * @since 4.12.2
     */
    public static final Stream<Class<?>> getTypeHierarchyAsStream(final Class<?> type) {
        if (type == null) {
            return empty();
        } else if (type.isInterface()) {
            return getInterfaceHierarchyAsStream(type);
        } else {
            return getClassHierarchyAsStream(type).flatMap(t -> concat(Stream.of(t), stream(t.getInterfaces()).flatMap(x -> getInterfaceHierarchyAsStream(x))));
        }
    }

    /**
     * Returns {@code true} if the given base method is either equal to the second method or is overridden by the second
     * method.
     *
     * @param baseMethod
     *            the base method to use for calculation
     * @param overridingMethod
     *            the (potentially overriding) method to use for calculation
     * @return {@code true} iff both methods represent similar behaviour
     */
    public static final boolean isAssignableFrom(final Method baseMethod, final Method overridingMethod) {
        if (baseMethod.equals(overridingMethod)) {
            return true;
        }
        if (baseMethod.getDeclaringClass().isAssignableFrom(overridingMethod.getDeclaringClass())) {
            if (baseMethod.getName().equals(overridingMethod.getName())) {
                if (Arrays.equals(baseMethod.getParameterTypes(), overridingMethod.getParameterTypes())) {
                    if (baseMethod.getReturnType().isAssignableFrom(overridingMethod.getReturnType())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns a subset of the given set of types containing all redundant types.
     *
     * @param types
     *            the set of types to look at
     * @return a subset of the given set of types containing all redundant types
     */
    public static final Set<Class<?>> redundantTypes(final Set<Class<?>> types) {
        return types.stream()
                    .filter(candidate -> types.stream()
                                              // A {@code candidate} type is redundant in relation to a {@code
                                              // reference} type if (a) it is assignable from that {@code reference} and
                                              // (b) it is not equal to that {@code reference}. Further, (c) {@link
                                              // Object} is not redundant if the {@code reference} is an {@code
                                              // interface}.
                                              .anyMatch(reference -> candidate.isAssignableFrom(reference) //
                                                                     && !candidate.equals(reference) //
                                                                     && !(candidate.equals(Object.class) && reference.isInterface())))
                    .collect(toSet());
    }

    private static final int ALL_MODES = PUBLIC | PROTECTED | PACKAGE | PRIVATE;

    public static final Lookup vicariousLookup(final Class<?> reference, final int... requiredAccesses)
    throws SecurityException {
        // either (1) use default access or (2) join access modes and remove illegal integer bits
        final int requiredAccess = requiredAccesses.length == 0 ? ALL_MODES : stream(requiredAccesses).reduce(0, (x, y) -> x | y) & ALL_MODES;
        return modifyVicariousLookup(reference, requiredAccess);
    }

    private static final Lookup modifyVicariousLookup(final Class<?> reference, final int requiredAccess) {
        final Lookup lookup = lookup().in(reference);
        if ((lookup.lookupModes() & requiredAccess) == requiredAccess) {
            return lookup;
        } else {
            try {
                final Field field = Lookup.class.getDeclaredField("allowedModes");
                field.setAccessible(true);
                field.setInt(lookup, lookup.lookupModes() | requiredAccess);
                return lookup;
            } catch (final NoSuchFieldException missing) {
                throw new RuntimeException("Java has been refactored and, now, the invoked field is missing!", missing);
            } catch (final IllegalAccessException inaccessible) {
                throw new RuntimeException("Java has been refactored and, now, the invoked field is inaccessible!", inaccessible);
            }
        }
    }

    private static final Lookup embodyVicariousLookup(final Class<?> reference, final int requiredAccess) {
        assert reference != null;
        assert (ALL_MODES & requiredAccess) == requiredAccess;
        try {
            final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class);
            constructor.setAccessible(true);
            final Lookup lookup = constructor.newInstance(reference);
            assert lookup.lookupModes() == ALL_MODES : "Java has been refactored and, now, the invoked constructor behaves differently!";
            return lookup;
        } catch (final NoSuchMethodException missing) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is missing!", missing);
        } catch (final IllegalAccessException inaccessible) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is inaccessible!", inaccessible);
        } catch (final InstantiationException abstrct) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is part of an abstract class!", abstrct);
        } catch (final InvocationTargetException impossible) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor behaves differently!", impossible);
        }
    }

    private static final Lookup enforceVicariousLookup(final Class<?> reference, final int requiredAccess) {
        assert reference != null;
        assert (ALL_MODES & requiredAccess) == requiredAccess;
        try {
            final Constructor<Lookup> constructor = Lookup.class.getDeclaredConstructor(Class.class, int.class);
            constructor.setAccessible(true);
            final Lookup lookup = constructor.newInstance(reference, requiredAccess);
            assert lookup.lookupModes() == requiredAccess : "Java has been refactored and, now, the invoked constructor behaves differently!";
            return lookup;
        } catch (final NoSuchMethodException missing) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is missing!", missing);
        } catch (final IllegalAccessException inaccessible) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is inaccessible!", inaccessible);
        } catch (final InstantiationException abstrct) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor is part of an abstract class!", abstrct);
        } catch (final InvocationTargetException impossible) {
            throw new RuntimeException("Java has been refactored and, now, the invoked constructor behaves differently!", impossible);
        }
    }

    /**
     * Returns a wrapping {@link InvocationHandler} that determines if the invoked proxy is assignable from the
     * declaring class of the invoked method. In case determination fails, the invocation handler will throw an
     * {@link IllegalArgumentException}.
     *
     * @apiNote The failure behaviour of the invocation handler is similar to {@link Method#invoke(Object, Object...)}
     *          (and, notably, is different to {@link MethodHandle#bindTo(Object)}).
     *
     * @param nonchecking
     *            the origin invocation handler which does not include assignable checks
     * @return the wrapping invocation handler
     */
    public static final InvocationHandler checkAssignabilityFirst(final InvocationHandler nonchecking) {
        final String NOT_INSTANCE = "Object of type '%s' is not an instance of invoked method's declaring class '%s'!";
        return (proxy, method, args) -> {
            if (!method.getDeclaringClass().isInstance(proxy)) {
                throw new IllegalArgumentException(format(NOT_INSTANCE, proxy.getClass(), method.getDeclaringClass()));
            }
            return nonchecking.invoke(proxy, method, args);
        };
    }

    /**
     * Returns an {@link InvocationHandler} that immediately returns the value provided by the given {@code factory}. In
     * case of an invoked {@code void} method, the invocation handler will throw a {@link ClassCastException}. Such
     * exception is thrown similarly if the supplied value is not an instance of the invoked method's return type.
     *
     * @param factory
     *            the return value factory
     * @return the return value providing invocation handler
     */
    public static final InvocationHandler constantResult(final Supplier<?> factory) {
        final String NOT_SUITABLE = "This InvocationHandler is not suitable for invoked void method '%s'!";
        final String NOT_INSTANCE = "Supplied object of type '%s' is not an instance of invoked method's return type '%s'!";
        return (proxy, method, args) -> {
            final Class<?> returnType = method.getReturnType();
            if (Void.TYPE.equals(returnType)) {
                throw new ClassCastException(format(NOT_SUITABLE, method));
            } else {
                final Object result = factory.get();
                if ((result == null) || returnType.isInstance(result)) {
                    return result;
                } else {
                    throw new ClassCastException(format(NOT_INSTANCE, result.getClass(), returnType));
                }
            }
        };
    }

    /**
     * Returns a wrapping {@link InvocationHandler} that dispatches the invocation of a {@code specific} method onto a
     * specific invocation {@link InvocationHandler handler} and refers any other method invocations to the given
     * {@code fallback} handler.
     *
     * @apiNote The returned invocation handler is aware of sub-types' methods overriding the given method. Any
     *          invocation of such sub-method will be dispatched too.
     *
     * @param specific
     *            the method to dispatch its invocation
     * @param handler
     *            the according specific invocation handler
     * @param fallback
     *            the fall-back invocation handler
     * @return the wrapping invocation handler
     */
    public static final InvocationHandler dispatch(final Method specific, final InvocationHandler handler, final InvocationHandler fallback) {
        return (proxy, method, args) -> isAssignableFrom(specific, method) ? handler.invoke(proxy, specific, args) : fallback.invoke(proxy, specific, args);
    }

    private static final Object trySuperTypeInvocation(final Object proxy, final Method method, final Object[] args, final Iterable<Class<?>> superTypes,
                                                       final InvocationHandler fallback)
    throws IllegalAccessException, Throwable {
        for (final Class<?> superType : superTypes) {
            assert superType.isAssignableFrom(proxy.getClass()) : "Illegal Java type!";
            try {
                Method target;
                try {
                    // method either is {@code public} already or might be overridden with extended visibility
                    target = superType.getMethod(method.getName(), method.getParameterTypes());
                } catch (final NoSuchMethodException noPublicMethod) {
                    // alternatively, method may be declared
                    target = superType.getDeclaredMethod(method.getName(), method.getParameterTypes());
                }
                if (!isAbstract(target.getModifiers())) {
                    if (method.getReturnType().isAssignableFrom(target.getReturnType())) {
                        // [A] invokable and fully assignable method
                        final Lookup lookup = vicariousLookup(superType);
                        final MethodHandle handle = lookup.unreflectSpecial(target, superType);
                        return handle.bindTo(proxy).invokeWithArguments(args);
                    } else {
                        // [B] non-assignable method
                    }
                } else {
                    // [C] non-invokable method
                }
            } catch (final NoSuchMethodException noDeclaredMethod) {
                // [D] no such method at all
            }
        }
        return fallback.invoke(proxy, method, args);
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * non-{@code abstract} implementation of its super classes. In result it behaves similar to an implementation like
     * this:
     *
     * <pre class="brush:java">
     * [&hellip;]
     * public SomeReturnObject someMethod(SomeArguments args) {
     *     return super.someMethod(args);
     * }
     * [&hellip;]
     * </pre>
     *
     * @see Reflection#trySuperTypesFirst(InvocationHandler)
     * @see Reflection#trySuperInterfacesFirst(InvocationHandler)
     *
     * @param fallback
     *            the fall-back invocation handler
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperClassesFirst(final InvocationHandler fallback) {
        return (proxy, method, args) -> {
            final LinkedHashSet<Class<?>> types = Reflection.allClassesOf(proxy.getClass());
            types.remove(proxy.getClass());
            return trySuperTypeInvocation(proxy, method, args, types, fallback);
        };
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * {@code default} implementation of its super interfaces. In result it behaves similar to an implementation like
     * this:
     *
     * <pre class="brush:java">
     * [&hellip;]
     * public SomeReturnObject someMethod(SomeArguments args) {
     *     return SomeInterface.super.someMethod(args);
     * }
     * [&hellip;]
     * </pre>
     *
     * @see Reflection#trySuperTypesFirst(InvocationHandler)
     * @see trySuperClassesFirst
     *
     * @param fallback
     *            the fall-back invocation handler
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperInterfacesFirst(final InvocationHandler fallback) {
        return (proxy, method, args) -> {
            final LinkedHashSet<Class<?>> types = Reflection.allInterfacesOf(proxy.getClass());
            types.remove(proxy.getClass());
            types.removeAll(redundantTypes(types));
            return trySuperTypeInvocation(proxy, method, args, types, fallback);
        };
    }

    /**
     * Returns an {@link InvocationHandler} that tries to provide the invoked method by referring to the nearest
     * non-{@code abstract} implementation of its super types (either super classes or super interfaces).
     *
     * @see trySuperClassesFirst
     * @see trySuperInterfacesFirst
     *
     * @param fallback
     *            the fall-back invocation handler
     * @return the wrapper invocation handler
     */
    public static final InvocationHandler trySuperTypesFirst(final InvocationHandler fallback) {
        return trySuperClassesFirst(trySuperInterfacesFirst(fallback));
    }

    /**
     * Returns an {@link InvocationHandler} that immediately throws a {@link Throwable} according to the given
     * {@code constructor} function. The cause message will contain the type of the invoked object, the invoked method,
     * and the arguments passed in the method invocation.
     *
     * @param constructor
     *            the {@code Throwable} factory
     * @return the failing invocation handler
     */
    public static final InvocationHandler fail(final Function<? super String, ? extends Throwable> constructor) {
        final String FAIL_PATTERN = "Missing invocation behaviour for instance of type '%s', method '%s', and arguments '%s'!";
        return (obj, meth, args) -> {
            throw constructor.apply(format(FAIL_PATTERN, obj.getClass(), meth, Arrays.toString(args)));
        };
    }

    static final String SUT_METHOD = "createNewSUT";

    static final Method reference;

    static {
        try {
            reference = J8UnitTest.class.getMethod(SUT_METHOD);
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            throw new ExceptionInInitializerError(unexpected);
        }
    }

    public static final <SUT> InvocationHandler j8UnitTestInvocationHandler(final Supplier<SUT> factory) {
        return checkAssignabilityFirst(trySuperTypesFirst(dispatch(reference, constantResult(factory), fail(IllegalStateException::new))));
    }

    public static final <SUT> InvocationHandler j8UnitTestInvocationHandler(final Callable<SUT> factory) {
        final Supplier<SUT> sup = () -> {
            try {
                return factory.call();
            } catch (final Exception e) {
                throw new RuntimeException(e);
            }
        };
        return j8UnitTestInvocationHandler(sup);
    }

}
