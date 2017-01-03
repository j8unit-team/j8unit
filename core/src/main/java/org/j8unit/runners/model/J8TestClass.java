package org.j8unit.runners.model;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.empty;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/**
 * <p>
 * This is an extended {@linkplain TestClass test class model} that, in addition, is able to discover any
 * {@link org.junit.Test &#64;Test} annotated {@code default} method of each (either directly or indirectly) implemented
 * {@code interface}. In result, all these {@link org.junit.Test &#64;Test} {@code default} methods will also be
 * executed&nbsp;&ndash; as long as there is no {@code class} specific implementation overriding the {@code default}
 * behaviour.
 * </p>
 *
 * <p>
 * If you &ndash;&nbsp;as a progressive, excellent test-aware programmer&ndash;&nbsp; want to benefit from the improved
 * test case composition, you should take a look at <a href="https://www.j8unit.org">the J8Unit homepage</a> to learn
 * more about the J8Unit test style and about the J8Unit test repository.
 * </p>
 *
 * @since 4.12
 */
public class J8TestClass
extends TestClass {

    /**
     * <p>
     * Creates a {@link J8TestClass} based of the tests within the given {@link Class}. Each time this constructor
     * executes, the given {@link Class} is {@linkplain TestClass#TestClass(Class) scanned for annotations}&nbsp;&ndash;
     * including {@link Test &#64;Test} annotated {@code default} method of each (either directly or indirectly)
     * implemented {@code interface}.
     * </p>
     */
    public J8TestClass(final Class<?> clazz) {
        super(clazz);
    }

    /**
     * <p>
     * In addition to the {@link TestClass#scanAnnotatedMembers(Map, Map)}, this method also scans for {@link Test
     * &#64;Test} annotated {@code default} methods of each (either directly or indirectly) implemented
     * {@code interface}. Each of these methods will be added into {@code methodsForAnnotations} if and only if there is
     * no specific {@code class} implementation.
     * </p>
     *
     * @param methodsForAnnotations
     *            the accumulator of all annotated {@link Method}s
     * @param fieldsForAnnotations
     *            the accumulator of all annotated {@link java.lang.reflect.Field}s
     * @see #scanAnnotatedDefaultMethods(Map)
     */
    @Override
    protected void scanAnnotatedMembers(final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations,
                                        final Map<Class<? extends Annotation>, List<FrameworkField>> fieldsForAnnotations) {
        super.scanAnnotatedMembers(methodsForAnnotations, fieldsForAnnotations);
        this.scanAnnotatedDefaultMethods(methodsForAnnotations);
    }

    /**
     * <p>
     * Scans for all {@code default} methods and adds those into {@code methodsForAnnotations} if and only if there is
     * no specific {@code class} implementation.
     * </p>
     *
     * @param methodsForAnnotations
     *            the accumulator of all annotated {@link Method}s
     * @see #addToAnnotationLists(org.junit.runners.model.FrameworkMember, Map)
     */
    protected void scanAnnotatedDefaultMethods(final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations) {
        for (final Class<?> interfaze : allInterfacesOf(this.getJavaClass())) {
            // inspect each interface's declared methods
            for (final Method method : MethodSorter.getDeclaredMethods(interfaze)) {
                if (method.isDefault()) {
                    addToAnnotationLists(new FrameworkMethod(method), methodsForAnnotations);
                }
            }
        }
    }

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

}
