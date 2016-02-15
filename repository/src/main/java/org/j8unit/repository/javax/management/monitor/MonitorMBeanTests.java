package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.monitor.MonitorMBean interface
 * javax.management.monitor.MonitorMBean}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MonitorMBeanClassTests}.
 * </p>
 *
 * @see javax.management.monitor.MonitorMBean interface javax.management.monitor.MonitorMBean (the hereby targeted
 *      class-under-test class)
 * @see MonitorMBeanClassTests MonitorMBeanClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorMBeanTests<SUT extends javax.management.monitor.MonitorMBean>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedAttribute() public abstract
     * java.lang.String javax.management.monitor.MonitorMBean.getObservedAttribute()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedAttribute() public abstract
     * java.lang.String javax.management.monitor.MonitorMBean.getObservedAttribute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#getObservedAttribute() public abstract java.lang.String
     *      javax.management.monitor.MonitorMBean.getObservedAttribute() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObservedAttribute()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.setObservedObject(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.setObservedObject(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#setObservedObject(javax.management.ObjectName) public abstract void
     *      javax.management.monitor.MonitorMBean.setObservedObject(javax.management.ObjectName) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObservedObject_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#stop() public abstract void
     * javax.management.monitor.MonitorMBean.stop()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#stop() public abstract void
     * javax.management.monitor.MonitorMBean.stop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#stop() public abstract void
     *      javax.management.monitor.MonitorMBean.stop() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#addObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.addObservedObject(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#addObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.addObservedObject(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#addObservedObject(javax.management.ObjectName) public abstract void
     *      javax.management.monitor.MonitorMBean.addObservedObject(javax.management.ObjectName) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addObservedObject_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getGranularityPeriod() public abstract long
     * javax.management.monitor.MonitorMBean.getGranularityPeriod()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getGranularityPeriod() public abstract long
     * javax.management.monitor.MonitorMBean.getGranularityPeriod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#getGranularityPeriod() public abstract long
     *      javax.management.monitor.MonitorMBean.getGranularityPeriod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGranularityPeriod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#isActive() public abstract boolean
     * javax.management.monitor.MonitorMBean.isActive()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#isActive() public abstract boolean
     * javax.management.monitor.MonitorMBean.isActive()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#isActive() public abstract boolean
     *      javax.management.monitor.MonitorMBean.isActive() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isActive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#start() public abstract void
     * javax.management.monitor.MonitorMBean.start()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#start() public abstract void
     * javax.management.monitor.MonitorMBean.start()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#start() public abstract void
     *      javax.management.monitor.MonitorMBean.start() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setObservedAttribute(String) public abstract void
     * javax.management.monitor.MonitorMBean.setObservedAttribute(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setObservedAttribute(String) public abstract void
     * javax.management.monitor.MonitorMBean.setObservedAttribute(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#setObservedAttribute(String) public abstract void
     *      javax.management.monitor.MonitorMBean.setObservedAttribute(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setObservedAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedObjects() public abstract
     * javax.management.ObjectName[] javax.management.monitor.MonitorMBean.getObservedObjects()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedObjects() public abstract
     * javax.management.ObjectName[] javax.management.monitor.MonitorMBean.getObservedObjects()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#getObservedObjects() public abstract javax.management.ObjectName[]
     *      javax.management.monitor.MonitorMBean.getObservedObjects() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObservedObjects()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setGranularityPeriod(long) public abstract void
     * javax.management.monitor.MonitorMBean.setGranularityPeriod(long) throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#setGranularityPeriod(long) public abstract void
     * javax.management.monitor.MonitorMBean.setGranularityPeriod(long) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#setGranularityPeriod(long) public abstract void
     *      javax.management.monitor.MonitorMBean.setGranularityPeriod(long) throws java.lang.IllegalArgumentException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setGranularityPeriod_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedObject() public abstract
     * javax.management.ObjectName javax.management.monitor.MonitorMBean.getObservedObject()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#getObservedObject() public abstract
     * javax.management.ObjectName javax.management.monitor.MonitorMBean.getObservedObject()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#getObservedObject() public abstract javax.management.ObjectName
     *      javax.management.monitor.MonitorMBean.getObservedObject() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObservedObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#containsObservedObject(javax.management.ObjectName)
     * public abstract boolean
     * javax.management.monitor.MonitorMBean.containsObservedObject(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#containsObservedObject(javax.management.ObjectName)
     * public abstract boolean
     * javax.management.monitor.MonitorMBean.containsObservedObject(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#containsObservedObject(javax.management.ObjectName) public abstract
     *      boolean javax.management.monitor.MonitorMBean.containsObservedObject(javax.management.ObjectName) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsObservedObject_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#removeObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.removeObservedObject(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorMBean#removeObservedObject(javax.management.ObjectName)
     * public abstract void javax.management.monitor.MonitorMBean.removeObservedObject(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorMBean#removeObservedObject(javax.management.ObjectName) public abstract void
     *      javax.management.monitor.MonitorMBean.removeObservedObject(javax.management.ObjectName) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeObservedObject_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
