package org.j8unit.repository.java.beans;

import java.beans.Introspector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Introspector} (by simply reusing the
 * J8Unit test interface {@link IntrospectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntrospectorClassTest
implements IntrospectorClassTests<Introspector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Introspector]

    @Override
    public Class<Introspector> createNewSUT() {
        return Introspector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#getBeanInfoSearchPath()
     * public static java.lang.String[] java.beans.Introspector.getBeanInfoSearchPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getBeanInfoSearchPath()
    throws Exception {
        // write some test for {@link java.beans.Introspector#getBeanInfoSearchPath()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.Introspector#setBeanInfoSearchPath(String[]) public static void
     * java.beans.Introspector.setBeanInfoSearchPath(java.lang.String[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_setBeanInfoSearchPath_StringArray()
    throws Exception {
        // write some test for {@link java.beans.Introspector#setBeanInfoSearchPath(String[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#flushFromCaches(Class)
     * public static void java.beans.Introspector.flushFromCaches(java.lang.Class<?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_flushFromCaches_Class()
    throws Exception {
        // write some test for {@link java.beans.Introspector#flushFromCaches(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.beans.Introspector#getBeanInfo(Class, Class, int) public static java.beans.BeanInfo
     * java.beans.Introspector.getBeanInfo(java.lang.Class<?>,java.lang.Class<?>,int) throws
     * java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getBeanInfo_Class_Class_int()
    throws Exception {
        // write some test for {@link java.beans.Introspector#getBeanInfo(Class, Class, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#getBeanInfo(Class, Class)
     * public static java.beans.BeanInfo java.beans.Introspector.getBeanInfo(java.lang.Class<?>,java.lang.Class<?>)
     * throws java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getBeanInfo_Class_Class()
    throws Exception {
        // write some test for {@link java.beans.Introspector#getBeanInfo(Class, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#getBeanInfo(Class, int)
     * public static java.beans.BeanInfo java.beans.Introspector.getBeanInfo(java.lang.Class<?>,int) throws
     * java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getBeanInfo_Class_int()
    throws Exception {
        // write some test for {@link java.beans.Introspector#getBeanInfo(Class, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#getBeanInfo(Class) public
     * static java.beans.BeanInfo java.beans.Introspector.getBeanInfo(java.lang.Class<?>) throws
     * java.beans.IntrospectionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getBeanInfo_Class()
    throws Exception {
        // write some test for {@link java.beans.Introspector#getBeanInfo(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#decapitalize(String) public
     * static java.lang.String java.beans.Introspector.decapitalize(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_decapitalize_String()
    throws Exception {
        // write some test for {@link java.beans.Introspector#decapitalize(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.beans.Introspector#flushCaches() public static
     * void java.beans.Introspector.flushCaches()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_flushCaches()
    throws Exception {
        // write some test for {@link java.beans.Introspector#flushCaches()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.Introspector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Introspector]

}
