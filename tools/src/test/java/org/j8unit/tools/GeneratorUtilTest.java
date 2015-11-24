package org.j8unit.tools;

import static java.util.Arrays.stream;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.j8unit.tools.Utilities.getNearestMergingClass;
import static org.j8unit.tools.Utilities.isReallyDeclared;
import static org.j8unit.tools.Utilities.optionalise;
import static org.j8unit.tools.Utilities.specifiesSuchPublicMethod;
import static org.j8unit.tools.Utilities.supportsSuchPublicMethod;
import static org.j8unit.tools.Utilities.toStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.DelayQueue;
import java.util.stream.Stream;
import javax.xml.ws.Holder;
import org.junit.Test;

public class GeneratorUtilTest {

    @Test
    public void testOptionalise()
    throws Exception {
        final Holder<Exception> holder = new Holder<>(null);
        assert holder.value == null;

        final Optional<String> o1 = optionalise(String::new, e -> holder.value = e);
        assertNotNull(o1);
        assertTrue(o1.isPresent());
        assertEquals(new String(), o1.get());
        assertNull(holder.value);

        final Optional<Integer> o2 = optionalise(() -> Integer.parseInt("x"), e -> holder.value = e);
        assertNotNull(o2);
        assertFalse(o2.isPresent());
        assertNotNull(holder.value);
        assertTrue(holder.value instanceof NumberFormatException);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testToStream()
    throws Exception {
        final Stream<Object> s1 = toStream(Optional.empty());
        assertNotNull(s1);
        assertEquals(emptyList(), s1.collect(toList()));

        final Stream<Object> s2 = toStream(Optional.ofNullable(null));
        assertNotNull(s2);
        assertEquals(emptyList(), s2.collect(toList()));

        final Stream<Object> s3 = toStream(Optional.of("Hello"));
        assertNotNull(s3);
        assertEquals(singletonList("Hello"), s3.collect(toList()));
    }

    @Test
    public void testSupportsSuchMethod()
    throws Exception {
        final Class<?> clazz = DelayQueue.class;
        final Method method = clazz.getMethod("parallelStream");
        assertEquals(Collection.class, method.getDeclaringClass());
        final boolean supports = supportsSuchPublicMethod(clazz, method);
        assertTrue(supports);
    }

    @Test
    public void testSpecifiesSuchMethod()
    throws Exception {
        final Class<?> clazz = DelayQueue.class;
        final Method method = clazz.getMethod("parallelStream");
        assertEquals(Collection.class, method.getDeclaringClass());
        final boolean supports = specifiesSuchPublicMethod(clazz, method);
        assertFalse(supports);
    }

    @Test
    public void testGetMergeNode()
    throws Exception {
        final Class<?> clazz = DelayQueue.class;
        final Method method = clazz.getMethod("parallelStream");
        assertEquals(Collection.class, method.getDeclaringClass());
        final Optional<Class<?>> mergeNode = getNearestMergingClass(clazz, method);
        assertTrue(mergeNode.isPresent());
        assertEquals(Collection.class, mergeNode.get());
    }

    @Test
    public void test()
    throws Exception {
        final Class<?> clazz = DelayQueue.class;
        Set<Method> duplicates = new HashSet<>();
        final Method[] methods = clazz.getMethods();
        System.out.println("=== Methods:");
        stream(methods).forEach(System.out::println);
        for (final Method mth : methods) {
            final Optional<Class<?>> mergeNode = getNearestMergingClass(clazz, mth);
            assert mergeNode.isPresent();
            if (!specifiesSuchPublicMethod(mergeNode.get(), mth)) {
                duplicates.add(mth);
            }
        }

        duplicates = duplicates.stream().map(mth -> {
            try {
                return clazz.getMethod(mth.getName(), mth.getParameterTypes());
            } catch (final NoSuchMethodException impossible) {
                impossible.printStackTrace(System.err);
                throw new RuntimeException(impossible);
            }
        }).filter(m -> !isReallyDeclared(clazz, m)).collect(toSet());
        System.out.println("=== Duplicates:");
        duplicates.forEach(System.out::println);
    }

    @Test
    public void testName()
    throws Exception {
        assertTrue(Object.class.isAssignableFrom(Iterable.class));
        assertFalse(this.extracted(Object.class, Iterable.class));
        assertTrue(this.extracted(Iterable.class, Collection.class));
        assertTrue(this.extracted(Object.class, AbstractCollection.class));
    }

    private boolean extracted(final Class<?> c, final Class<?> sc) {
        return c.isAssignableFrom(sc) && (!Object.class.equals(c) || !sc.isInterface());
    }
}
