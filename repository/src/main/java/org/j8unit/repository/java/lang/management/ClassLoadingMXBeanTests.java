package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.ClassLoadingMXBean interface
 * java.lang.management.ClassLoadingMXBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ClassLoadingMXBeanClassTests}.
 * </p>
 *
 * @see java.lang.management.ClassLoadingMXBean interface java.lang.management.ClassLoadingMXBean (the hereby targeted
 *      class-under-test class)
 * @see ClassLoadingMXBeanClassTests ClassLoadingMXBeanClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassLoadingMXBeanTests<SUT extends java.lang.management.ClassLoadingMXBean>
extends PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#setVerbose(boolean) public abstract void
     * java.lang.management.ClassLoadingMXBean.setVerbose(boolean)}.
     *
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#setVerbose(boolean) public abstract void
     * java.lang.management.ClassLoadingMXBean.setVerbose(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.ClassLoadingMXBean#setVerbose(boolean) public abstract void
     *      java.lang.management.ClassLoadingMXBean.setVerbose(boolean) (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getUnloadedClassCount() public abstract long
     * java.lang.management.ClassLoadingMXBean.getUnloadedClassCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getUnloadedClassCount() public abstract long
     * java.lang.management.ClassLoadingMXBean.getUnloadedClassCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.ClassLoadingMXBean#getUnloadedClassCount() public abstract long
     *      java.lang.management.ClassLoadingMXBean.getUnloadedClassCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnloadedClassCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#isVerbose() public abstract boolean
     * java.lang.management.ClassLoadingMXBean.isVerbose()}.
     *
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#isVerbose() public abstract boolean
     * java.lang.management.ClassLoadingMXBean.isVerbose()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.ClassLoadingMXBean#isVerbose() public abstract boolean
     *      java.lang.management.ClassLoadingMXBean.isVerbose() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getLoadedClassCount() public abstract int
     * java.lang.management.ClassLoadingMXBean.getLoadedClassCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getLoadedClassCount() public abstract int
     * java.lang.management.ClassLoadingMXBean.getLoadedClassCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.ClassLoadingMXBean#getLoadedClassCount() public abstract int
     *      java.lang.management.ClassLoadingMXBean.getLoadedClassCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoadedClassCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getTotalLoadedClassCount() public abstract long
     * java.lang.management.ClassLoadingMXBean.getTotalLoadedClassCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.ClassLoadingMXBean#getTotalLoadedClassCount() public abstract long
     * java.lang.management.ClassLoadingMXBean.getTotalLoadedClassCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.ClassLoadingMXBean#getTotalLoadedClassCount() public abstract long
     *      java.lang.management.ClassLoadingMXBean.getTotalLoadedClassCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalLoadedClassCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
