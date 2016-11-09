package org.j8unit.repository.javax.management;

import javax.management.JMX;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMX} (by simply reusing the J8Unit test
 * interface {@link JMXClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXClassTest
implements JMXClassTests<JMX> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.JMX]

    @Override
    public Class<JMX> createNewSUT() {
        return JMX.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.management.JMX#isMXBeanInterface(Class) public
     * static boolean javax.management.JMX.isMXBeanInterface(java.lang.Class<?>)}.
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
    public void test_isMXBeanInterface_Class()
    throws Exception {
        // write some test for {@link javax.management.JMX#isMXBeanInterface(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection, javax.management.ObjectName, Class)
     * public static <T> T
     * javax.management.JMX.newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class<T>)}.
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
    public void test_newMBeanProxy_MBeanServerConnection_ObjectName_Class()
    throws Exception {
        // write some test for {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection,
        // javax.management.ObjectName, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection, javax.management.ObjectName, Class, boolean)
     * public static <T> T
     * javax.management.JMX.newMBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class<T>,boolean)}.
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
    public void test_newMBeanProxy_MBeanServerConnection_ObjectName_Class_boolean()
    throws Exception {
        // write some test for {@link javax.management.JMX#newMBeanProxy(javax.management.MBeanServerConnection,
        // javax.management.ObjectName, Class, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection, javax.management.ObjectName, Class)
     * public static <T> T
     * javax.management.JMX.newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class<T>)}.
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
    public void test_newMXBeanProxy_MBeanServerConnection_ObjectName_Class()
    throws Exception {
        // write some test for {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection,
        // javax.management.ObjectName, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection, javax.management.ObjectName, Class, boolean)
     * public static <T> T
     * javax.management.JMX.newMXBeanProxy(javax.management.MBeanServerConnection,javax.management.ObjectName,java.lang.Class<T>,boolean)}.
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
    public void test_newMXBeanProxy_MBeanServerConnection_ObjectName_Class_boolean()
    throws Exception {
        // write some test for {@link javax.management.JMX#newMXBeanProxy(javax.management.MBeanServerConnection,
        // javax.management.ObjectName, Class, boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.JMX]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.JMX]

}
