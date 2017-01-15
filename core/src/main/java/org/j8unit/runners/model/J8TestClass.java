package org.j8unit.runners.model;

import static org.j8unit.util.Reflection.allInterfacesOf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
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

}
