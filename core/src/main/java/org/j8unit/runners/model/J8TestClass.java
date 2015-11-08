package org.j8unit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import org.junit.internal.MethodSorter;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/**
 * This is a {@linkplain TestClass test class model} that, in addition, is able to discover any {@link org.junit.Test
 * &#64;Test} annotated {@code default} method of each (either directly or indirectly) implemented {@code interface}. In
 * result, all these {@link org.junit.Test &#64;Test} {@code default} methods will also be executed&nbsp;&ndash; as long
 * as there is no {@code class} specific implementation.
 *
 * If you &ndash;&nbsp;as a progressive, excellent test-aware programmer&ndash;&nbsp; want to benefit from the improved
 * test case composition, you should take a look at <a href="https://github.com/j8unit-team/j8unit">the projects
 * homepage</a>.
 *
 * @since 4.12
 */
public class J8TestClass
extends TestClass {

    /**
     * Creates a {@link J8TestClass} based of the test within the given {@link Class}. Each time this constructor
     * executes, the given {@link Class} is scanned for annotations (see {@link TestClass#TestClass(Class)}
     * )&nbsp;&ndash; including {@link Test &#64;Test} annotated {@code default} method of each (either directly or
     * indirectly) implemented {@code interface}.
     */
    public J8TestClass(final Class<?> clazz) {
        super(clazz);
    }

    /**
     * In addition to the {@link TestClass#scanAnnotatedMembers(Map, Map)}, this method also scans for {@link Test
     * &#64;Test} annotated {@code default} method of each (either directly or indirectly) implemented {@code interface}
     * . Each of these methods will be added into {@code methodsForAnnotations} if and only if there is no specific
     * {@code class} implementation.
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
     * Scans for all {@code default} methods and adds those into {@code methodsForAnnotations} if and only if there is
     * no specific {@code class} implementation.
     *
     * @param methodsForAnnotations
     *            the accumulator of all annotated {@link Method}s
     * @see #addToAnnotationLists(org.junit.runners.model.FrameworkMember, Map)
     */
    protected void scanAnnotatedDefaultMethods(final Map<Class<? extends Annotation>, List<FrameworkMethod>> methodsForAnnotations) {
        for (final Class<?> eachInterface : getInterfaces(this.getJavaClass())) {
            // inspect each interface's declared methods
            for (final Method eachMethod : MethodSorter.getDeclaredMethods(eachInterface)) {
                if (eachMethod.isDefault()) {
                    addToAnnotationLists(new FrameworkMethod(eachMethod), methodsForAnnotations);
                }
            }
        }
    }

    /**
     * In opposite to {@link Class#getInterfaces()} this method returns all (!) {@code interface}s of a given
     * {@link Class}. The {@link Set} is ordered in the same order the {@code interface}s are implemented.
     *
     * @param clazz
     *            the {@link Class} to return all of its {@code interface}s
     * @return an ordered {@link Set} of all {@code interface}s implemented by the given {@link Class}
     */
    private static Set<Class<?>> getInterfaces(final Class<?> clazz) {
        return getInterfaces(clazz.getInterfaces());
    }

    /**
     * Helper method for {@link #getInterfaces(Class)}.
     */
    private static Set<Class<?>> getInterfaces(final Class<?>[] allInterfaces) {
        final Set<Class<?>> results = new LinkedHashSet<Class<?>>();
        for (final Class<?> eachInterface : allInterfaces) {
            results.add(eachInterface);
            results.addAll(getInterfaces(eachInterface.getInterfaces()));
        }
        return results;
    }

}
