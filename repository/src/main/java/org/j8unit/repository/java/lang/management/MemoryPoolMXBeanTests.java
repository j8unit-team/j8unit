package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.MemoryPoolMXBean interface
 * java.lang.management.MemoryPoolMXBean}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MemoryPoolMXBeanClassTests}.
 * </p>
 *
 * @see java.lang.management.MemoryPoolMXBean interface java.lang.management.MemoryPoolMXBean (the hereby targeted
 *      class-under-test class)
 * @see MemoryPoolMXBeanClassTests MemoryPoolMXBeanClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MemoryPoolMXBeanTests<SUT extends java.lang.management.MemoryPoolMXBean>
extends PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getType() public abstract
     * java.lang.management.MemoryType java.lang.management.MemoryPoolMXBean.getType()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getType() public abstract
     * java.lang.management.MemoryType java.lang.management.MemoryPoolMXBean.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getType() public abstract java.lang.management.MemoryType
     *      java.lang.management.MemoryPoolMXBean.getType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsageThreshold() public abstract long
     * java.lang.management.MemoryPoolMXBean.getUsageThreshold()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsageThreshold() public abstract long
     * java.lang.management.MemoryPoolMXBean.getUsageThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getUsageThreshold() public abstract long
     *      java.lang.management.MemoryPoolMXBean.getUsageThreshold() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsageThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdExceeded() public abstract
     * boolean java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdExceeded()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdExceeded() public abstract
     * boolean java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdExceeded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdExceeded() public abstract boolean
     *      java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdExceeded() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCollectionUsageThresholdExceeded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsageThreshold() public abstract long
     * java.lang.management.MemoryPoolMXBean.getCollectionUsageThreshold()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsageThreshold() public abstract long
     * java.lang.management.MemoryPoolMXBean.getCollectionUsageThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getCollectionUsageThreshold() public abstract long
     *      java.lang.management.MemoryPoolMXBean.getCollectionUsageThreshold() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollectionUsageThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isUsageThresholdExceeded() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isUsageThresholdExceeded()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isUsageThresholdExceeded() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isUsageThresholdExceeded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#isUsageThresholdExceeded() public abstract boolean
     *      java.lang.management.MemoryPoolMXBean.isUsageThresholdExceeded() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isUsageThresholdExceeded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#setCollectionUsageThreshold(long) public abstract
     * void java.lang.management.MemoryPoolMXBean.setCollectionUsageThreshold(long)}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#setCollectionUsageThreshold(long) public abstract
     * void java.lang.management.MemoryPoolMXBean.setCollectionUsageThreshold(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#setCollectionUsageThreshold(long) public abstract void
     *      java.lang.management.MemoryPoolMXBean.setCollectionUsageThreshold(long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCollectionUsageThreshold_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsageThresholdCount() public abstract
     * long java.lang.management.MemoryPoolMXBean.getCollectionUsageThresholdCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsageThresholdCount() public abstract
     * long java.lang.management.MemoryPoolMXBean.getCollectionUsageThresholdCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getCollectionUsageThresholdCount() public abstract long
     *      java.lang.management.MemoryPoolMXBean.getCollectionUsageThresholdCount() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollectionUsageThresholdCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#setUsageThreshold(long) public abstract void
     * java.lang.management.MemoryPoolMXBean.setUsageThreshold(long)}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#setUsageThreshold(long) public abstract void
     * java.lang.management.MemoryPoolMXBean.setUsageThreshold(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#setUsageThreshold(long) public abstract void
     *      java.lang.management.MemoryPoolMXBean.setUsageThreshold(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUsageThreshold_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isValid() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isValid()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isValid() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isValid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#isValid() public abstract boolean
     *      java.lang.management.MemoryPoolMXBean.isValid() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getCollectionUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getCollectionUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getCollectionUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getCollectionUsage() public abstract java.lang.management.MemoryUsage
     *      java.lang.management.MemoryPoolMXBean.getCollectionUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollectionUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getPeakUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getPeakUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getPeakUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getPeakUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getPeakUsage() public abstract java.lang.management.MemoryUsage
     *      java.lang.management.MemoryPoolMXBean.getPeakUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPeakUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#resetPeakUsage() public abstract void
     * java.lang.management.MemoryPoolMXBean.resetPeakUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#resetPeakUsage() public abstract void
     * java.lang.management.MemoryPoolMXBean.resetPeakUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#resetPeakUsage() public abstract void
     *      java.lang.management.MemoryPoolMXBean.resetPeakUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resetPeakUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getName() public abstract java.lang.String
     * java.lang.management.MemoryPoolMXBean.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getName() public abstract java.lang.String
     * java.lang.management.MemoryPoolMXBean.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getName() public abstract java.lang.String
     *      java.lang.management.MemoryPoolMXBean.getName() (the hereby targeted method-under-test)
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
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getMemoryManagerNames() public abstract
     * java.lang.String[] java.lang.management.MemoryPoolMXBean.getMemoryManagerNames()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getMemoryManagerNames() public abstract
     * java.lang.String[] java.lang.management.MemoryPoolMXBean.getMemoryManagerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getMemoryManagerNames() public abstract java.lang.String[]
     *      java.lang.management.MemoryPoolMXBean.getMemoryManagerNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMemoryManagerNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdSupported() public
     * abstract boolean java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdSupported() public
     * abstract boolean java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#isCollectionUsageThresholdSupported() public abstract boolean
     *      java.lang.management.MemoryPoolMXBean.isCollectionUsageThresholdSupported() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCollectionUsageThresholdSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsageThresholdCount() public abstract long
     * java.lang.management.MemoryPoolMXBean.getUsageThresholdCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsageThresholdCount() public abstract long
     * java.lang.management.MemoryPoolMXBean.getUsageThresholdCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getUsageThresholdCount() public abstract long
     *      java.lang.management.MemoryPoolMXBean.getUsageThresholdCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsageThresholdCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#getUsage() public abstract
     * java.lang.management.MemoryUsage java.lang.management.MemoryPoolMXBean.getUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#getUsage() public abstract java.lang.management.MemoryUsage
     *      java.lang.management.MemoryPoolMXBean.getUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isUsageThresholdSupported() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isUsageThresholdSupported()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryPoolMXBean#isUsageThresholdSupported() public abstract boolean
     * java.lang.management.MemoryPoolMXBean.isUsageThresholdSupported()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryPoolMXBean#isUsageThresholdSupported() public abstract boolean
     *      java.lang.management.MemoryPoolMXBean.isUsageThresholdSupported() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isUsageThresholdSupported()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
