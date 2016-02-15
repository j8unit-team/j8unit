package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.MemoryMXBean interface
 * java.lang.management.MemoryMXBean}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link MemoryMXBeanClassTests}.
 * </p>
 *
 * @see java.lang.management.MemoryMXBean interface java.lang.management.MemoryMXBean (the hereby targeted
 *      class-under-test class)
 * @see MemoryMXBeanClassTests MemoryMXBeanClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MemoryMXBeanTests<SUT extends java.lang.management.MemoryMXBean>
extends PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getObjectPendingFinalizationCount() public abstract int
     * java.lang.management.MemoryMXBean.getObjectPendingFinalizationCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getObjectPendingFinalizationCount() public abstract int
     * java.lang.management.MemoryMXBean.getObjectPendingFinalizationCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#getObjectPendingFinalizationCount() public abstract int
     *      java.lang.management.MemoryMXBean.getObjectPendingFinalizationCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectPendingFinalizationCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#isVerbose() public abstract boolean
     * java.lang.management.MemoryMXBean.isVerbose()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#isVerbose() public abstract boolean
     * java.lang.management.MemoryMXBean.isVerbose()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#isVerbose() public abstract boolean
     *      java.lang.management.MemoryMXBean.isVerbose() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isVerbose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#gc() public abstract void
     * java.lang.management.MemoryMXBean.gc()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#gc() public abstract void
     * java.lang.management.MemoryMXBean.gc()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#gc() public abstract void java.lang.management.MemoryMXBean.gc() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_gc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#setVerbose(boolean) public abstract void
     * java.lang.management.MemoryMXBean.setVerbose(boolean)}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#setVerbose(boolean) public abstract void
     * java.lang.management.MemoryMXBean.setVerbose(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#setVerbose(boolean) public abstract void
     *      java.lang.management.MemoryMXBean.setVerbose(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setVerbose_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getNonHeapMemoryUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryMXBean.getNonHeapMemoryUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getNonHeapMemoryUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryMXBean.getNonHeapMemoryUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#getNonHeapMemoryUsage() public abstract java.lang.management.MemoryUsage
     *      java.lang.management.MemoryMXBean.getNonHeapMemoryUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNonHeapMemoryUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getHeapMemoryUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryMXBean.getHeapMemoryUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryMXBean#getHeapMemoryUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryMXBean.getHeapMemoryUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryMXBean#getHeapMemoryUsage() public abstract java.lang.management.MemoryUsage
     *      java.lang.management.MemoryMXBean.getHeapMemoryUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHeapMemoryUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
