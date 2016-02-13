package org.j8unit.tools.util;

import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.Spliterator.IMMUTABLE;
import static java.util.Spliterator.NONNULL;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.util.AccessLevel.PUBLIC;
import static org.j8unit.tools.util.Iterators.classHierarchy;
import static org.j8unit.tools.util.Utilities.NOOP;
import static org.j8unit.tools.util.Utilities.toStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy type analysis stuff.
 * </p>
 */
public enum TypeAnalysis {
    ;

    /**
     * <p>
     * Returns the base component type of any {@linkplain Class Java type} (that is, the base component type of any
     * multi-dimensional array type; resp. the type itself of any non-array type).
     * </p>
     *
     * <p>
     * In order to discover the base component type, this method recursively calls {@link Class#getComponentType()} as
     * often as the temporary current type is still an array. Finally, it returns the explored component type.
     * </p>
     *
     * <p>
     * If the input type is not an array, that type will be returned immediately. Thus, in opposite to
     * {@link Class#getComponentType()} this method does not return {@code null}.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return the base component type of the given Java type
     */
    public static final Class<?> baseComponentTypeOf(Class<?> type) {
        requireNonNull(type);
        Class<?> base = type;
        for (type = type.getComponentType(); type != null; type = type.getComponentType()) {
            base = type;
        }
        return base;
    }

    /**
     * <p>
     * Returns the array dimension of the given {@linkplain Class Java type}.
     *
     * If the given type is not an array type, {@code 0} will be returned.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return the array dimension of the given Java type
     */
    public static final int arrayDimensionOf(Class<?> type) {
        requireNonNull(type);
        int dimension = 0;
        for (type = type.getComponentType(); type != null; type = type.getComponentType()) {
            dimension++;
        }
        return dimension;
    }

    /**
     * <p>
     * Returns all interfaces (plus each's corresponding type) implemented by the given {@linkplain Class Java type}.
     *
     * In result, this method is a combination of {@link Class#getInterfaces()} and {@link Class#getGenericInterfaces()}
     * whereas each interface is mapped onto its corresponding interface type.
     * </p>
     *
     * @param type
     *            some Java type to analyse
     * @return all interfaces (plus each's corresponding type) implemented by the given Java type
     */
    public static final LinkedHashMap<Class<?>, Type> getInterfaces(final Class<?> type) {
        requireNonNull(type);
        final Class<?>[] interfaces = type.getInterfaces();
        final Type[] interfaceTypes = type.getGenericInterfaces();
        assert interfaces.length == interfaceTypes.length;
        final LinkedHashMap<Class<?>, Type> mapping = new LinkedHashMap<>();
        for (int i = 0; i < interfaces.length; i++) {
            mapping.put(interfaces[i], interfaceTypes[i]);
        }
        return mapping;
    }

    /**
     * <p>
     * Similar to {@link Class#getMethod(String, Class...)}, but handles missing {@linkplain Method methods}. Thus, this
     * method returns an {@link Optional} of the specified {@code public} member method whereas an
     * {@linkplain Optional#empty() empty Optional} represents the {@link NoSuchMethodException} case.
     * </p>
     *
     * @param type
     *            the Java type to query the specified {@code public} member method
     * @param name
     *            the name of the method
     * @param parameterTypes
     *            the method's parameter types
     * @return an {@code Optional} of the method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getMethod(final Class<?> type, final String name, final Class<?>... parameterTypes) {
        requireNonNull(type);
        requireNonNull(parameterTypes);
        try {
            return Optional.of(type.getMethod(name, parameterTypes));
        } catch (final NoSuchMethodException any) {
            return Optional.empty();
        }
    }

    /**
     * <p>
     * Similar to {@link #getMethod(Class, String, Class...)}, but specifies the method to query via {@link Method}
     * instance.
     * </p>
     *
     * @param type
     *            the Java type to query the specified {@code public} member method
     * @param method
     *            the method to query
     * @return an {@code Optional} of the method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getMethod(final Class<?> type, final Method method) {
        requireNonNull(type);
        requireNonNull(method);
        return getMethod(type, method.getName(), method.getParameterTypes());
    }

    /**
     * <p>
     * Similar to {@link #getMethod(Class, Method)} but filters out any method that is {@linkplain Method#isSynthetic()
     * synthetic}.
     * </p>
     *
     * @param type
     *            the Java type to query the specified {@code public} member method
     * @param method
     *            the method to query
     * @return an {@code Optional} of the non-synthetic method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getNonSyntheticMethod(final Class<?> type, final Method method) {
        requireNonNull(type);
        requireNonNull(method);
        return getMethod(type, method).filter(m -> !m.isSynthetic());
    }

    /**
     * <p>
     * Similar to {@link Class#getDeclaredMethod(String, Class...)}, but handles missing {@linkplain Method methods}.
     * Thus, this method returns an {@link Optional} of the specified declared method whereas an
     * {@linkplain Optional#empty() empty optional} represents the {@link NoSuchMethodException} case.
     * </p>
     *
     * @param type
     *            the Java type to query the specified declared method method
     * @param name
     *            the name of the method
     * @param parameterTypes
     *            the method's parameter types
     * @return an {@code Optional} of the method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getDeclaredMethod(final Class<?> type, final String name, final Class<?>... parameterTypes) {
        requireNonNull(type);
        requireNonNull(name);
        requireNonNull(parameterTypes);
        try {
            return Optional.of(type.getDeclaredMethod(name, parameterTypes));
        } catch (final NoSuchMethodException any) {
            return Optional.empty();
        }
    }

    /**
     * <p>
     * Similar to {@link #getDeclaredMethod(Class, String, Class...)}, but specifies the method to query via
     * {@link Method} instance.
     * </p>
     *
     * @param type
     *            the Java type to query the specified declared method method
     * @param method
     *            the method to query
     * @return an {@code Optional} of the method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getDeclaredMethod(final Class<?> type, final Method method) {
        requireNonNull(type);
        requireNonNull(method);
        return getDeclaredMethod(type, method.getName(), method.getParameterTypes());
    }

    /**
     * <p>
     * Similar to {@link #getDeclaredMethod(Class, Method)} but filters out any method that is
     * {@linkplain Method#isSynthetic() synthetic}.
     * </p>
     *
     * @param type
     *            the Java type to query the specified declared method method
     * @param method
     *            the method to query
     * @return an {@code Optional} of the non-synthetic method if existing; an empty {@code Optional} otherwise
     */
    public static final Optional<Method> getDeclaredNonSyntheticMethod(final Class<?> type, final Method method) {
        requireNonNull(type);
        requireNonNull(method);
        return getDeclaredMethod(type, method).filter(m -> !m.isSynthetic());
    }

    /**
     * <p>
     * Returns the nearest {@link Class class} within the given Java {@code type}'s class hierarchy that either directly
     * specifies the given {@code public} {@link Method method} or indirectly merges an ambiguous situation.
     * </p>
     *
     * <p>
     * This method returns an {@linkplain Optional#empty() empty Optional} if &hellip;
     * </p>
     * <ul>
     * <li>&hellip; the given method is not {@code public}</li>
     * <li>&hellip; the given class does not specify the given method</li>
     * </ul>
     *
     * <p>
     * This method returns an {@link Optional} of the given class if &hellip;
     * </p>
     * <ul>
     * <li>&hellip; the given class truly specifies the given method</li>
     * <li>&hellip; the given class has more than one parent (super class, interface(s)) that itself merge the given
     * method</li>
     * </ul>
     *
     * <p>
     * This method returns an {@link Optional} of a specific given class' parent class if &hellip;
     * </p>
     * <ul>
     * <li>&hellip; the given class has exactly this one parent (super class, interface(s)) that itself merge the given
     * method</li>
     * </ul>
     *
     * @param type
     *            the Java type to use
     * @param method
     *            the method to use
     * @return the nearest class within the given Java {@code type}'s class hierarchy that either directly specifies the
     *         given method or indirectly merges an ambiguous situation
     */
    public static final Optional<Class<?>> getNearestMergingClass(final Class<?> type, final Method method) {
        requireNonNull(type);
        requireNonNull(method);
        // Case A: Non-public method?
        // This is not a merge candidate!
        if (PUBLIC.mismatches(method)) {
            return Optional.empty();
        } else
        // Case B: No such public method at all within the given class?
        // There is no merge situation!
        if (!getMethod(type, method).isPresent()) {
            return Optional.empty();
        } else
        // Case C: Truly (aka. non-synthetic) overridden within the class itself?
        // Merge situation is solved already!
        if (getDeclaredNonSyntheticMethod(type, method).isPresent()) {
            return Optional.of(type);
        } else {
            // Case D: It must be somewhere else in the class hierarchy!
            final Stream<Class<?>> superClass = toStream(ofNullable(type.getSuperclass()));
            final Stream<Class<?>> superInterfaces = stream(type.getInterfaces());
            final Set<Class<?>> collect = Stream.concat(superClass, superInterfaces) //
                                                .map(c -> getNearestMergingClass(c, method)) //
                                                .flatMap(Utilities::toStream) //
                                                .collect(toSet());
            assert !collect.isEmpty() : "Method is supported, is not truly specified -- but (strangely) is not found within class hierarchie!";
            if (collect.size() == 1) {
                // Case D-1: Exactly one super type specifying the method?
                // Merge situation is solved!
                return Optional.of(collect.iterator().next());
            } else {
                // Case D-2: Multiple super types specifying the method?
                // Solve merge ambiguity!
                return Optional.of(type);
            }
        }
    }

    /**
     * <p>
     * Similar to {@link #calculateNearestMatchingParents(Class, Predicate, Consumer, Predicate, Consumer)} but (1) uses
     * the given matcher to filter the super classes and super interfaces, and (2) uses {@link Utilities#NOOP} to drop
     * potential non-matching feedback.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param matcher
     *            the predicate the returned (grand*) parent class and interfaces must match
     * @return a map of the nearest predicate-matching parent class (if existing) plus all the predicate-matching
     *         interfaces found meanwhile
     */
    public static final Map<Class<?>, ? extends Type> calculateNearestMatchingParents(final Class<?> type, final Predicate<? super Class<?>> matcher) {
        requireNonNull(type);
        requireNonNull(matcher);
        return calculateNearestMatchingParents(type, matcher, NOOP);
    }

    /**
     * <p>
     * Similar to {@link #calculateNearestMatchingParents(Class, Predicate, Consumer, Predicate, Consumer)} but (1) uses
     * the given matcher to filter both the super classes and the super interfaces, and (2) uses the given
     * {@link Consumer consumer} to get informed about both the non-matching super classes and the non-matching super
     * interfaces.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param matcher
     *            the predicate the returned (grand*) parent class and interfaces must match
     * @param nonMatchings
     *            the consumer to handle all skipped (grand*) parent classes and (grand*) parent interfaces
     * @return a map of the nearest predicate-matching parent class (if existing) plus all the predicate-matching
     *         interfaces found meanwhile
     */
    public static final Map<Class<?>, ? extends Type> calculateNearestMatchingParents(final Class<?> type, final Predicate<? super Class<?>> matcher,
                                                                                      final Consumer<? super Class<?>> nonMatchings) {
        requireNonNull(type);
        requireNonNull(matcher);
        requireNonNull(nonMatchings);
        return calculateNearestMatchingParents(type, matcher, nonMatchings, matcher, nonMatchings);
    }

    /**
     * <p>
     * Returns the nearest {@linkplain Predicate#test(Object) predicate-matching} parent {@link Class class} of the
     * given Java type (if existing) plus all the {@linkplain Predicate#test(Object) predicate-matching} interfaces
     * found meanwhile.
     *
     * The returned parent class (of present) will be mapped onto its according generic type; each returned interface
     * will be mapped onto its according generic interface type. Thus, this method actually returns a {@linkplain Map
     * map} containing each aforementioned mapping.
     * </p>
     *
     * <p>
     * In order to inform the caller of this method about any non-matching super class (resp. any non-matching super
     * interface), this method requires two according {@linkplain Consumer consumers}. If no feedback is needed, one can
     * easily use {@link Utilities#NOOP}.
     * </p>
     *
     * @see #calculateNearestMatchingParents(Class, Predicate)
     * @see #calculateNearestMatchingParents(Class, Predicate, Consumer)
     *
     * @param type
     *            the given Java type to analyse
     * @param classMatcher
     *            the predicate the returned (grand*) parent class must match
     * @param nonMatchingClasses
     *            the consumer to handle all skipped (grand*) parent classes
     * @param interfaceMatcher
     *            the predicate the returned (grand*) parent interfaces must match
     * @param nonMatchingInterfaces
     *            the consumer to handle all skipped (grand*) parent interfaces
     * @return a map of the nearest predicate-matching parent class (if existing) plus all the predicate-matching
     *         interfaces found meanwhile
     */
    public static final Map<Class<?>, Type> calculateNearestMatchingParents(final Class<?> type, final Predicate<? super Class<?>> classMatcher,
                                                                            final Consumer<? super Class<?>> nonMatchingClasses,
                                                                            final Predicate<? super Class<?>> interfaceMatcher,
                                                                            final Consumer<? super Class<?>> nonMatchingInterfaces) {
        requireNonNull(type);
        requireNonNull(classMatcher);
        requireNonNull(nonMatchingClasses);
        requireNonNull(interfaceMatcher);
        requireNonNull(nonMatchingInterfaces);
        final Map<Class<?>, Type> parents = new LinkedHashMap<>();
        StreamSupport.stream(spliteratorUnknownSize(classHierarchy(type), ORDERED & NONNULL & IMMUTABLE), false) //
                     .peek(
                           /*
                            * Block A: Processing Meanwhile Interfaces (for each current (grand*) parent class)
                            */
                           c -> getInterfaces(c).entrySet().stream() //
                                                .peek(e -> { // handle skipped interfaces
                                                    if (!interfaceMatcher.test(e.getKey())) {
                                                        nonMatchingInterfaces.accept(e.getKey());
                                                    }
                                                }) //
                                                .filter(e -> interfaceMatcher.test(e.getKey())) // store meanwhile ...
                                                .forEach(e -> parents.put(e.getKey(), e.getValue()))) // ... interfaces
                     /*
                      * Block B: First Matching (Grand*) Parent Class
                      */
                     .peek(c -> { // handle skipped super classes
                         if (!classMatcher.test(c.getSuperclass())) {
                             nonMatchingInterfaces.accept(c);
                         }
                     }) //
                     .filter(c -> classMatcher.test(c.getSuperclass())) // store ...
                     .findFirst() // ... nearest ...
                     .ifPresent(c -> parents.put(c.getSuperclass(), c.getGenericSuperclass())); // ... super class
        return parents;
    }

}
