package org.j8unit.tools.generator;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.j8unit.tools.generator.AccessScope.CLASS;
import static org.j8unit.tools.generator.AccessScope.INSTANCE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.RepositoryTests;
import org.junit.Test;

public class MembershipTest {

    public MembershipTest() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(final String[] args) {
    }

    @Test
    public void testConstructor()
    throws Exception {
        final Constructor<MembershipTest> constructor = MembershipTest.class.getConstructor();
        assertTrue(CLASS.matches(constructor));
        assertFalse(INSTANCE.matches(constructor));
    }

    @Test
    public void testInstanceMethod()
    throws Exception {
        final Method method = MembershipTest.class.getMethod("toString");
        assertFalse(CLASS.matches(method));
        assertTrue(INSTANCE.matches(method));
    }

    @Test
    public void testClassMethod()
    throws Exception {
        final Method method = MembershipTest.class.getMethod("main", String[].class);
        assertTrue(CLASS.matches(method));
        assertFalse(INSTANCE.matches(method));
    }

    @Test
    public void testName()
    throws Exception {
        assertEquals(RepositoryTests.class, INSTANCE.getBaseJ8UnitBaseTestClass());
        assertEquals(RepositoryClassTests.class, CLASS.getBaseJ8UnitBaseTestClass());
    }

    @Test
    public void testName2()
    throws Exception {
        assertEquals("String", INSTANCE.inspectSutSuperType(String.class).getKey());
        assertEquals(emptyList(), INSTANCE.inspectSutSuperType(String.class).getValue());
        assertEquals("String", CLASS.inspectSutSuperType(String.class).getKey());
        assertEquals(emptyList(), CLASS.inspectSutSuperType(String.class).getValue());

        assertEquals("Enum<E>", INSTANCE.inspectSutSuperType(Enum.class).getKey());
        assertEquals(singletonList("E extends Enum<E>"), INSTANCE.inspectSutSuperType(Enum.class).getValue());
        assertEquals("Enum", CLASS.inspectSutSuperType(Enum.class).getKey());
        assertEquals(emptyList(), CLASS.inspectSutSuperType(Enum.class).getValue());

        assertEquals("java.util.Map<K, V>", INSTANCE.inspectSutSuperType(Map.class).getKey());
        assertEquals(asList("K", "V"), INSTANCE.inspectSutSuperType(Map.class).getValue());
        assertEquals("java.util.Map", CLASS.inspectSutSuperType(Map.class).getKey());
        assertEquals(emptyList(), CLASS.inspectSutSuperType(Map.class).getValue());
    }

}
