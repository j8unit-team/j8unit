package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.CompilationMXBean interface
 * java.lang.management.CompilationMXBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CompilationMXBeanClassTests}.
 * </p>
 *
 * @see java.lang.management.CompilationMXBean interface java.lang.management.CompilationMXBean (the hereby targeted
 *      class-under-test class)
 * @see CompilationMXBeanClassTests CompilationMXBeanClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompilationMXBeanTests<SUT extends java.lang.management.CompilationMXBean>
extends PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getName() public abstract java.lang.String
     * java.lang.management.CompilationMXBean.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getName() public abstract java.lang.String
     * java.lang.management.CompilationMXBean.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.CompilationMXBean#getName() public abstract java.lang.String
     *      java.lang.management.CompilationMXBean.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getTotalCompilationTime() public abstract long
     * java.lang.management.CompilationMXBean.getTotalCompilationTime()}.
     *
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getTotalCompilationTime() public abstract long
     * java.lang.management.CompilationMXBean.getTotalCompilationTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.CompilationMXBean#getTotalCompilationTime() public abstract long
     *      java.lang.management.CompilationMXBean.getTotalCompilationTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalCompilationTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#isCompilationTimeMonitoringSupported() public
     * abstract boolean java.lang.management.CompilationMXBean.isCompilationTimeMonitoringSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#isCompilationTimeMonitoringSupported() public
     * abstract boolean java.lang.management.CompilationMXBean.isCompilationTimeMonitoringSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.CompilationMXBean#isCompilationTimeMonitoringSupported() public abstract boolean
     *      java.lang.management.CompilationMXBean.isCompilationTimeMonitoringSupported() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompilationTimeMonitoringSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
