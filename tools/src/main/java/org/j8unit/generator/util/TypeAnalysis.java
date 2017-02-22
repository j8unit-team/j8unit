package org.j8unit.generator.util;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.util.Arrays.stream;
import static java.util.Collections.singleton;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static java.util.Spliterator.IMMUTABLE;
import static java.util.Spliterator.NONNULL;
import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.concat;
import static org.j8unit.generator.analysis.AccessModifier.PUBLIC;
import static org.j8unit.generator.util.Consumers.NOOP;
import static org.j8unit.generator.util.Iterators.iterate;
import static org.j8unit.generator.util.Maps.entry;
import static org.j8unit.generator.util.Optionals.toStream;
import static org.j8unit.util.Reflection.redundantTypes;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
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
     * Tries to load a class by its name. If for any exceptional reason the class cannot be loaded, the thrown
     * {@link Exception} will print its stack trace to {@link System#err}.
     *
     * @see Optionals#optionalise(java.util.concurrent.Callable, Consumer)
     * @param name
     *            the name of the {@link Class} to load
     * @return the loaded {@link Class}, enveloped into an {@link Optional}
     */
    public static final Optional<Class<?>> tryLoadClass(final String name) {
        return Optionals.optionalise(() -> getSystemClassLoader().loadClass(name), Throwable::printStackTrace);
    }

    /**
     * <p>
     * Returns an {@linkplain Iterator iterator} that represents the given {@link Class entity}'s class hierarchy. In
     * detail, there are <strong>five cases</strong> to distinguish:
     * </p>
     *
     * <dl>
     * <dt>Case A: Class</dt>
     * <dd>If the given {@code entity} represents a class, the iterator provides the following elements: the class
     * itself, its super class, its super super class, its super super super class, and so on.
     *
     * If, finally, {@link Object} is reached, there will be no further super class and, thus, any execution of
     * {@link Iterator#hasNext()} will return {@code false} and any execution of {@link Iterator#next()} will cause a
     * {@link NoSuchElementException}.</dd>
     *
     * <dt>Case B: Interface</dt>
     * <dd>If the given {@code entity} {@linkplain Class#isInterface() represents an interface}, the iterator will
     * return the interface class itself and does not hold any further element.
     *
     * That is because even if interfaces extend other interfaces these super interfaces do not represent
     * {@linkplain Class#getSuperclass() super classes}.</dd>
     *
     * <dt>Cases C, D: Primitive, Void</dt>
     * <dd>Similar, any primitive type or {@code void} will have no other hierarchy element but itself.</dd>
     *
     * <dt>Case E: Array</dt>
     * <dd>Further, any array type will provide {@link Object} as its immediate super class.</dd>
     * </dl>
     *
     * <p>
     * Note, this method is {@code null} safe, though the returned iterator will provide no element at all.
     * </p>
     *
     * @see Class#getSuperclass()
     *
     * @param entity
     *            the entity to query its class hierarchy
     * @return an iterator of the given {@code entity}'s class hierarchy
     *
     * @deprecated Use {@link org.j8unit.util.Reflection#allClassesOf(Class)} or any of the similar methods. Note, this
     *             method returns a singleton Iterator for any interface, whereas
     *             {@link org.j8unit.util.Reflection#allClassesOf(Class)} returns an empty set!
     */
    @Deprecated
    public static final Iterator<Class<?>> classHierarchy(final Class<?> entity) {
        return iterate(entity, Class::getSuperclass, Objects::nonNull);
    }

    /**
     * TODO (Issue #38): JavaDoc!
     */
    public static final Stream<Class<?>> scopedTypes(final Class<?> entity) {
        return concat(Stream.of(entity), stream(entity.getDeclaredClasses()).flatMap(TypeAnalysis::scopedTypes));
    }

    /**
     * TODO: JavaDoc!
     */
    public static final Stream<Class<?>> scopedTypes(final Set<Class<?>> entities) {
        return entities.stream().flatMap(TypeAnalysis::scopedTypes);
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
     * Similar to {@link #getMethod(Class, String, Class...)}, but specifies the method to query via blueprint
     * {@link Method} instance.
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
     * Similar to {@link #getDeclaredMethod(Class, String, Class...)}, but specifies the method to query via blueprint
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
                                                .flatMap(Optionals::toStream) //
                                                .collect(toSet());
            assert !collect.isEmpty() : "Method (a) is supported, (b) is not truly specified -- but, weirdly, (c) is not found within class hierarchy!";
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
     * Similar to {@link #calculateNearestMatchingParents(Class, Predicate, Consumer)} with using {@link Consumers#NOOP}
     * to drop potential non-matching feedback.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param matcher
     *            the predicate the returned (grand*) parent class and interfaces must match
     * @return a map of the nearest predicate-matching parent class (if existing) plus all the predicate-matching
     *         interfaces found meanwhile (but without redundancy)
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
     *         interfaces found meanwhile (but without redundancy)
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
     * The returned parent class (if present) will be mapped onto its according generic type; each returned interface
     * will be mapped onto its according generic interface type. Thus, this method actually returns a {@linkplain Map
     * map} containing each aforementioned mapping.
     * </p>
     *
     * <p>
     * In order to inform the caller of this method about any non-matching super class (resp. any non-matching super
     * interface), this method requires two according {@linkplain Consumer consumers}. If no feedback is needed, one can
     * easily use {@link Consumers#NOOP}.
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
     *         interfaces found meanwhile (but without redundancy)
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
                     /*
                      * Part A: Processing Meanwhile Interfaces (for each current (grand*) parent class)
                      */
                     .peek(c -> getInterfaces(c).entrySet().stream() //
                                                .peek(e -> { // handle skipped interfaces
                                                    // TODO (Issue #42): If an interface is skipped, its super
                                                    // interfaces should be considered instead. Just similar to any
                                                    // non-matching super class.
                                                    if (!interfaceMatcher.test(e.getKey())) {
                                                        nonMatchingInterfaces.accept(e.getKey());
                                                    }
                                                }) //
                                                .filter(e -> interfaceMatcher.test(e.getKey())) // store meanwhile ...
                                                .forEach(e -> parents.put(e.getKey(), e.getValue()))) // ... interfaces
                     /*
                      * Part B: First Matching (Grand*) Parent Class
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

    /**
     * <p>
     * Similar to {@link #calculateNearestDeclaringParents(Class, Method, Predicate, Consumer)} with using
     * {@link Consumers#NOOP} to drop potential non-matching feedback.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param method
     *            the method to look for
     * @param matcher
     *            the predicate the considered (grand*) parent classes and interfaces must match
     * @return a map of the nearest predicate-matching, method-declaring (grand*) parent types plus all direct parent
     *         types these declaring types are inherited by
     */
    public static final Map<Class<?>, Set<Class<?>>> calculateNearestDeclaringParents(final Class<?> type, final Method method,
                                                                                      final Predicate<? super Class<?>> matcher) {
        requireNonNull(type);
        requireNonNull(method);
        requireNonNull(matcher);
        return calculateNearestDeclaringParents(type, method, matcher, NOOP);
    }

    /**
     * <p>
     * Similar to {@link #calculateNearestDeclaringParents(Class, Method, Predicate, Consumer, Predicate, Consumer)} but
     * (1) uses the given matcher to filter both the super classes and the super interfaces, and (2) uses the given
     * {@link Consumer consumer} to get informed about both the non-matching super classes and the non-matching super
     * interfaces.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param method
     *            the method to look for
     * @param matcher
     *            the predicate the considered (grand*) parent classes and interfaces must match
     * @param nonMatchings
     *            the consumer to handle all skipped (grand*) parent classes and interfaces
     * @return a map of the nearest predicate-matching, method-declaring (grand*) parent types plus all direct parent
     *         types these declaring types are inherited by
     */
    public static final Map<Class<?>, Set<Class<?>>> calculateNearestDeclaringParents(final Class<?> type, final Method method,
                                                                                      final Predicate<? super Class<?>> matcher,
                                                                                      final Consumer<? super Class<?>> nonMatchings) {
        requireNonNull(type);
        requireNonNull(method);
        requireNonNull(matcher);
        requireNonNull(nonMatchings);
        return calculateNearestDeclaringParents(type, method, matcher, NOOP, matcher, NOOP);
    }

    /**
     * <p>
     * Returns the nearest (grand*) parent types declaring the given method.
     *
     * The returned (grand*) parent types will be mapped onto all those direct parent nodes of the given {@code type}
     * that extend/represent that (grand*) parent type. Thus, this method actually returns a {@linkplain Map map}
     * containing each aforementioned mapping.
     * </p>
     *
     * <p>
     * To give an example: If interface {@code I} specifies a method {@code foobar} and is extended by interfaces
     * {@code J} and {@code K}, and class {@code C} implements both {@code J} and {@code K}, the execution of
     * {@code calculateNearestDeclaringParents(C, foobar, ...)} will return a map of
     * {@code [I.Class => (J.class, K.class)]}.
     *
     * If there is another interface {@code L} independently specifying method {@code foobar} too, the execution for
     * class {@code D} (implementing {@code J}, {@code K}, {@code L}) will return a map of
     * {@code [I.Class => (J.class, K.class), L.class => (L.class)]} because the definition within {@code I} is
     * inherited via {@code J} and {@code K} and the definition within {@code L} is inherited via {@code L}.
     * </p>
     *
     * <p>
     * <em>Important note</em>: After investigating the nearest parent nodes (see
     * {@link #calculateNearestMatchingParents(Class, Predicate, Consumer, Predicate, Consumer)}), this method skips all
     * redundant parent nodes (see {@link org.j8unit.util.Reflection#redundantTypes(Set)}) without any further notice.
     *
     * After investigating the origin (grand*) parent types declaring the given method, this method skips all redundant
     * origin types. For example, if {@code L} extends {@code I} the execution for class {@code D} will return a map of
     * {@code [L.class => (L.class)} because the inheritance via {@code L} obsoletes the less specific definition of
     * method {@code foobar} within {@code I}.
     * </p>
     *
     * @param type
     *            the given Java type to analyse
     * @param method
     *            the method to look for
     * @param classMatcher
     *            the predicate the considered (grand*) parent classes must match
     * @param nonMatchingClasses
     *            the consumer to handle all skipped (grand*) parent classes
     * @param interfaceMatcher
     *            the predicate the considered (grand*) parent interfaces must match
     * @param nonMatchingInterfaces
     *            the consumer to handle all skipped (grand*) parent interfaces
     * @return a map of the nearest predicate-matching, method-declaring (grand*) parent types plus all direct parent
     *         types these declaring types are inherited by
     */
    public static final Map<Class<?>, Set<Class<?>>> calculateNearestDeclaringParents(final Class<?> type, final Method method,
                                                                                      final Predicate<? super Class<?>> classMatcher,
                                                                                      final Consumer<? super Class<?>> nonMatchingClasses,
                                                                                      final Predicate<? super Class<?>> interfaceMatcher,
                                                                                      final Consumer<? super Class<?>> nonMatchingInterfaces) {
        requireNonNull(type);
        requireNonNull(method);
        requireNonNull(classMatcher);
        requireNonNull(nonMatchingClasses);
        requireNonNull(interfaceMatcher);
        requireNonNull(nonMatchingInterfaces);
        final Set<Class<?>> parents = calculateNearestMatchingParents(type, classMatcher, nonMatchingClasses, interfaceMatcher, nonMatchingInterfaces).keySet();
        parents.removeAll(redundantTypes(parents));
        final Function<Class<?>, Optional<Entry<Class<?>, Class<?>>>> lookup = t -> getNearestMergingClass(t, method).map(c -> entry(c, t));
        final Function<Entry<Class<?>, Class<?>>, Set<Class<?>>> valueMapper = e -> singleton(e.getValue());
        final BinaryOperator<Set<Class<?>>> valueMerger = Sets::merge;
        final Map<Class<?>, Set<Class<?>>> map = parents.stream()
                                                        // lookup nearest parent's node for given method
                                                        .map(lookup)
                                                        // skip empty results
                                                        .flatMap(Optionals::toStream)
                                                        // consolidate
                                                        .collect(toMap(Entry::getKey, valueMapper, valueMerger, HashMap::new));
        map.keySet().removeAll(redundantTypes(map.keySet()));
        return map;
    }

}
