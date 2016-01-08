package org.j8unit.tools.util;

import static java.lang.String.format;
import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.Spliterator.IMMUTABLE;
import static java.util.Spliterator.NONNULL;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.logging.Logger.getLogger;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.GeneratorLogMessages.SKIP_SUPER_CLASS;
import static org.j8unit.tools.GeneratorLogMessages.SKIP_SUPER_INTERFACE;
import static org.j8unit.tools.util.Iterators.classHierarchy;
import static org.j8unit.tools.util.Utilities.toStream;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public enum TypeAnalysis {
    ;

    private static final Logger LOG = getLogger(TypeAnalysis.class.getName());

    /**
     * Recursively calls {@link Class#getComponentType()} as often as the temporary current class is still an array.
     * Returns the finally explored component type.
     *
     * In other words, this method returns the basic component type of any multi-dimensional array. If the input class
     * is not an array, this class will be returned immediately.
     *
     * @param clazz
     *            some {@link Class} to analyse
     * @return the base component type of the given {@link Class}
     */
    public static Class<?> baseComponentTypeOf(Class<?> clazz) {
        Class<?> baseCT = requireNonNull(clazz);
        for (clazz = clazz.getComponentType(); clazz != null; clazz = clazz.getComponentType()) {
            baseCT = clazz;
        }
        return baseCT;
    }

    /**
     * Returns the array dimension of the given {@link Class}.
     *
     * @param clazz
     *            some {@link Class} to analyse
     * @return the array dimension of the given {@link Class}
     */
    public static int arrayDimensionOf(final Class<?> clazz) {
        int dim = 0;
        for (Class<?> ct = requireNonNull(clazz).getComponentType(); ct != null; ct = ct.getComponentType()) {
            dim++;
        }
        return dim;
    }

    public static LinkedHashMap<Class<?>, Type> getInterfaces(final Class<?> clazz) {
        final LinkedHashMap<Class<?>, Type> interfaces = new LinkedHashMap<>();
        for (int i = 0; i < clazz.getInterfaces().length; i++) {
            interfaces.put(clazz.getInterfaces()[i], clazz.getGenericInterfaces()[i]);
        }
        return interfaces;
    }

    public static final boolean isReallyDeclared(final Class<?> clazz, final Executable executable) {
        return executable.getDeclaringClass().equals(clazz) && !executable.isSynthetic();
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

    public static final boolean specifiesSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            final Method m = clazz.getMethod(method.getName(), method.getParameterTypes());
            return isReallyDeclared(clazz, m);
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    public static final boolean supportsSuchPublicMethod(final Class<?> clazz, final Method method) {
        try {
            clazz.getMethod(method.getName(), method.getParameterTypes());
            return true;
        } catch (final NoSuchMethodException any) {
            return false;
        }
    }

    /**
     * Calculate hierarchically closest class node with a usable super class; store interfaces found meanwhile.
     *
     * @param clazz
     * @param predicate
     * @param nonMatchings
     * @return
     */
    public static Map<Class<?>, ? extends Type> calculateNearestParents(final Class<?> clazz, final Predicate<? super Class<?>> predicate,
                                                                        final Consumer<? super Class<?>> nonMatchings) {
        return calculateNearestParents(clazz, predicate, nonMatchings, predicate, nonMatchings);
    }

    public static Map<Class<?>, Type> calculateNearestParents(final Class<?> clazz, final Predicate<? super Class<?>> classPredicate,
                                                              final Consumer<? super Class<?>> nonMatchingClasses,
                                                              final Predicate<? super Class<?>> interfacePredicate,
                                                              final Consumer<? super Class<?>> nonMatchingInterfaces) {
        final Map<Class<?>, Type> parents = new LinkedHashMap<>();
        StreamSupport.stream(spliteratorUnknownSize(classHierarchy(clazz), ORDERED & NONNULL & IMMUTABLE), false) //
                     .peek(c -> getInterfaces(c).entrySet().stream() //
                                                .peek(e -> { // handle skipped interfaces
                                                    if (!interfacePredicate.test(e.getKey())) {
                                                        LOG.warning(format(SKIP_SUPER_INTERFACE, clazz, c));
                                                        nonMatchingInterfaces.accept(e.getKey());
                                                    }
                                                }) //
                                                .filter(e -> interfacePredicate.test(e.getKey())) // store meanwhile ...
                                                .forEach(e -> parents.put(e.getKey(), e.getValue()))) // ... interfaces
                     .peek(c -> { // handle skipped super classes
                         if (!classPredicate.test(c.getSuperclass())) {
                             LOG.warning(format(SKIP_SUPER_CLASS, clazz, c));
                             nonMatchingInterfaces.accept(c);
                         }
                     }) //
                     .filter(c -> classPredicate.test(c.getSuperclass())) // store ...
                     .findFirst() // ... nearest ...
                     .ifPresent(c -> parents.put(c.getSuperclass(), c.getGenericSuperclass())); // ... super class
        return parents;
    }

}
