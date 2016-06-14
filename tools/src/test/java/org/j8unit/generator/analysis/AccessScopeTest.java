package org.j8unit.generator.analysis;

import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import org.j8unit.generator.api.render.ConciseOriginRenderer;
import org.j8unit.generator.api.render.OriginRenderer;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.RepositoryTests;
import org.junit.Test;

public class AccessScopeTest {

    public AccessScopeTest() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(final String[] args) {
    }

    public static final String CLASSSTRING = "";

    public final String INSTANCESTRING = "";

    @Test
    public void testAccessScopeOfConstructor()
    throws Exception {
        final Constructor<AccessScopeTest> constructor = AccessScopeTest.class.getConstructor();
        assertTrue(CLASS.matches(constructor));
        assertFalse(CLASS.mismatches(constructor));
        assertTrue(INSTANCE.mismatches(constructor));
        assertFalse(INSTANCE.matches(constructor));
    }

    @Test
    public void testAccessScopeOfInstanceMethod()
    throws Exception {
        final Method method = AccessScopeTest.class.getMethod("toString");
        assertFalse(CLASS.matches(method));
        assertTrue(CLASS.mismatches(method));
        assertFalse(INSTANCE.mismatches(method));
        assertTrue(INSTANCE.matches(method));
    }

    @Test
    public void testAccessScopeOfInstanceField()
    throws Exception {
        final Field field = AccessScopeTest.class.getField("INSTANCESTRING");
        assertFalse(CLASS.matches(field));
        assertTrue(CLASS.mismatches(field));
        assertFalse(INSTANCE.mismatches(field));
        assertTrue(INSTANCE.matches(field));
    }

    @Test
    public void testAccessScopeOfClassMethod()
    throws Exception {
        final Method method = AccessScopeTest.class.getMethod("main", String[].class);
        assertTrue(CLASS.matches(method));
        assertFalse(CLASS.mismatches(method));
        assertTrue(INSTANCE.mismatches(method));
        assertFalse(INSTANCE.matches(method));
    }

    @Test
    public void testAccessScopeOfInstanceClass()
    throws Exception {
        final Field field = AccessScopeTest.class.getField("CLASSSTRING");
        assertTrue(CLASS.matches(field));
        assertFalse(CLASS.mismatches(field));
        assertTrue(INSTANCE.mismatches(field));
        assertFalse(INSTANCE.matches(field));
    }

    @Test
    public void testGetBaseJ8UnitBaseTestClass()
    throws Exception {
        assertEquals(RepositoryTests.class, INSTANCE.getBaseJ8UnitInterfaceType());
        assertEquals(RepositoryClassTests.class, CLASS.getBaseJ8UnitInterfaceType());
    }

    @Test
    public void testGetGenericStatement()
    throws Exception {
        final OriginRenderer renderer = new OriginRenderer() {};

        assertEquals("<SUT extends java.lang.String>", INSTANCE.getTestInterfaceGenericStatement(renderer, String.class));
        assertEquals("<SUT extends java.lang.String>", CLASS.getTestInterfaceGenericStatement(renderer, String.class));

        assertEquals("<SUT extends java.lang.Enum<E>, E extends java.lang.Enum<E>>", INSTANCE.getTestInterfaceGenericStatement(renderer, Enum.class));
        assertEquals("<SUT extends java.lang.Enum>", CLASS.getTestInterfaceGenericStatement(renderer, Enum.class));

        assertEquals("<SUT extends java.util.Map<K, V>, K extends java.lang.Object, V extends java.lang.Object>",
                     INSTANCE.getTestInterfaceGenericStatement(renderer, Map.class));
        assertEquals("<SUT extends java.util.Map>", CLASS.getTestInterfaceGenericStatement(renderer, Map.class));
    }

    @Test
    public void testGetGenericConciseStatement()
    throws Exception {
        final OriginRenderer renderer = new ConciseOriginRenderer() {};

        assertEquals("<SUT extends String>", INSTANCE.getTestInterfaceGenericStatement(renderer, String.class));
        assertEquals("<SUT extends String>", CLASS.getTestInterfaceGenericStatement(renderer, String.class));

        assertEquals("<SUT extends Enum<E>, E extends Enum<E>>", INSTANCE.getTestInterfaceGenericStatement(renderer, Enum.class));
        assertEquals("<SUT extends Enum>", CLASS.getTestInterfaceGenericStatement(renderer, Enum.class));

        assertEquals("<SUT extends java.util.Map<K, V>, K, V>", INSTANCE.getTestInterfaceGenericStatement(renderer, Map.class));
        assertEquals("<SUT extends java.util.Map>", CLASS.getTestInterfaceGenericStatement(renderer, Map.class));
    }

}
