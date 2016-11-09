package org.j8unit.repository.java.lang.management;

import java.lang.management.ManagementFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ManagementFactory} (by simply reusing the
 * J8Unit test interface {@link ManagementFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class ManagementFactoryClassTest
implements ManagementFactoryClassTests<ManagementFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.ManagementFactory]

    @Override
    public Class<ManagementFactory> createNewSUT() {
        return ManagementFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformMBeanServer() public static synchronized
     * javax.management.MBeanServer java.lang.management.ManagementFactory.getPlatformMBeanServer()}.
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
    public void test_getPlatformMBeanServer()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getPlatformMBeanServer()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getCompilationMXBean() public static
     * java.lang.management.CompilationMXBean java.lang.management.ManagementFactory.getCompilationMXBean()}.
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
    public void test_getCompilationMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getCompilationMXBean()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformManagementInterfaces() public static
     * java.util.Set<java.lang.Class<? extends java.lang.management.PlatformManagedObject>>
     * java.lang.management.ManagementFactory.getPlatformManagementInterfaces()}.
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
    public void test_getPlatformManagementInterfaces()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getPlatformManagementInterfaces()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getThreadMXBean() public static java.lang.management.ThreadMXBean
     * java.lang.management.ManagementFactory.getThreadMXBean()}.
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
    public void test_getThreadMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getThreadMXBean()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getMemoryPoolMXBeans() public static
     * java.util.List<java.lang.management.MemoryPoolMXBean>
     * java.lang.management.ManagementFactory.getMemoryPoolMXBeans()}.
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
    public void test_getMemoryPoolMXBeans()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getMemoryPoolMXBeans()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getGarbageCollectorMXBeans() public static
     * java.util.List<java.lang.management.GarbageCollectorMXBean>
     * java.lang.management.ManagementFactory.getGarbageCollectorMXBeans()}.
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
    public void test_getGarbageCollectorMXBeans()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getGarbageCollectorMXBeans()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformMXBean(javax.management.MBeanServerConnection, Class)
     * public static <T> T
     * java.lang.management.ManagementFactory.getPlatformMXBean(javax.management.MBeanServerConnection,java.lang.Class<T>)
     * throws java.io.IOException}.
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
    public void test_getPlatformMXBean_MBeanServerConnection_Class()
    throws Exception {
        // write some test for {@link
        // java.lang.management.ManagementFactory#getPlatformMXBean(javax.management.MBeanServerConnection, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformMXBean(Class) public static <T> T
     * java.lang.management.ManagementFactory.getPlatformMXBean(java.lang.Class<T>)}.
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
    public void test_getPlatformMXBean_Class()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getPlatformMXBean(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getOperatingSystemMXBean() public static
     * java.lang.management.OperatingSystemMXBean java.lang.management.ManagementFactory.getOperatingSystemMXBean()}.
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
    public void test_getOperatingSystemMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getOperatingSystemMXBean()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getClassLoadingMXBean() public static
     * java.lang.management.ClassLoadingMXBean java.lang.management.ManagementFactory.getClassLoadingMXBean()}.
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
    public void test_getClassLoadingMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getClassLoadingMXBean()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#newPlatformMXBeanProxy(javax.management.MBeanServerConnection, String, Class)
     * public static <T> T
     * java.lang.management.ManagementFactory.newPlatformMXBeanProxy(javax.management.MBeanServerConnection,java.lang.String,java.lang.Class<T>)
     * throws java.io.IOException}.
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
    public void test_newPlatformMXBeanProxy_MBeanServerConnection_String_Class()
    throws Exception {
        // write some test for {@link
        // java.lang.management.ManagementFactory#newPlatformMXBeanProxy(javax.management.MBeanServerConnection, String,
        // Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformMXBeans(javax.management.MBeanServerConnection, Class)
     * public static <T> java.util.List<T>
     * java.lang.management.ManagementFactory.getPlatformMXBeans(javax.management.MBeanServerConnection,java.lang.Class<T>)
     * throws java.io.IOException}.
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
    public void test_getPlatformMXBeans_MBeanServerConnection_Class()
    throws Exception {
        // write some test for {@link
        // java.lang.management.ManagementFactory#getPlatformMXBeans(javax.management.MBeanServerConnection, Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getPlatformMXBeans(Class) public static <T> java.util.List<T>
     * java.lang.management.ManagementFactory.getPlatformMXBeans(java.lang.Class<T>)}.
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
    public void test_getPlatformMXBeans_Class()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getPlatformMXBeans(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getMemoryManagerMXBeans() public static
     * java.util.List<java.lang.management.MemoryManagerMXBean>
     * java.lang.management.ManagementFactory.getMemoryManagerMXBeans()}.
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
    public void test_getMemoryManagerMXBeans()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getMemoryManagerMXBeans()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getMemoryMXBean() public static java.lang.management.MemoryMXBean
     * java.lang.management.ManagementFactory.getMemoryMXBean()}.
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
    public void test_getMemoryMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getMemoryMXBean()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.lang.management.ManagementFactory#getRuntimeMXBean() public static java.lang.management.RuntimeMXBean
     * java.lang.management.ManagementFactory.getRuntimeMXBean()}.
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
    public void test_getRuntimeMXBean()
    throws Exception {
        // write some test for {@link java.lang.management.ManagementFactory#getRuntimeMXBean()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.ManagementFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.ManagementFactory]

}
