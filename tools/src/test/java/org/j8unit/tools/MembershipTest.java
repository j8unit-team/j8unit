package org.j8unit.tools;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
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
        assertTrue(Membership.CLASS.matches(constructor));
        assertFalse(Membership.INSTANCE.matches(constructor));
    }

    @Test
    public void testInstanceMethod()
    throws Exception {
        final Method method = MembershipTest.class.getMethod("toString");
        assertFalse(Membership.CLASS.matches(method));
        assertTrue(Membership.INSTANCE.matches(method));
    }

    @Test
    public void testClassMethod()
    throws Exception {
        final Method method = MembershipTest.class.getMethod("main", String[].class);
        assertTrue(Membership.CLASS.matches(method));
        assertFalse(Membership.INSTANCE.matches(method));
    }

}
