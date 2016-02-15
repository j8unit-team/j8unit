package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.monitor.GaugeMonitorMBean interface
 * javax.management.monitor.GaugeMonitorMBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link GaugeMonitorMBeanClassTests}.
 * </p>
 *
 * @see javax.management.monitor.GaugeMonitorMBean interface javax.management.monitor.GaugeMonitorMBean (the hereby
 *      targeted class-under-test class)
 * @see GaugeMonitorMBeanClassTests GaugeMonitorMBeanClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GaugeMonitorMBeanTests<SUT extends javax.management.monitor.GaugeMonitorMBean>
extends MonitorMBeanTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getHighThreshold() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getHighThreshold()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getHighThreshold() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getHighThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getHighThreshold() public abstract java.lang.Number
     *      javax.management.monitor.GaugeMonitorMBean.getHighThreshold() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHighThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setThresholds(Number, Number) public abstract
     * void javax.management.monitor.GaugeMonitorMBean.setThresholds(java.lang.Number,java.lang.Number) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setThresholds(Number, Number) public abstract
     * void javax.management.monitor.GaugeMonitorMBean.setThresholds(java.lang.Number,java.lang.Number) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#setThresholds(Number, Number) public abstract void
     *      javax.management.monitor.GaugeMonitorMBean.setThresholds(java.lang.Number,java.lang.Number) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setThresholds_Number_Number()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     * abstract long javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for
     * {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     * abstract long javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     *      abstract long
     *      javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDerivedGaugeTimeStamp_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp() public abstract long
     * javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp() public abstract long
     * javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getDerivedGaugeTimeStamp() public abstract long
     *      javax.management.monitor.GaugeMonitorMBean.getDerivedGaugeTimeStamp() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDerivedGaugeTimeStamp()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setDifferenceMode(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setDifferenceMode(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setDifferenceMode(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setDifferenceMode(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#setDifferenceMode(boolean) public abstract void
     *      javax.management.monitor.GaugeMonitorMBean.setDifferenceMode(boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDifferenceMode_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setNotifyHigh(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setNotifyHigh(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setNotifyHigh(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setNotifyHigh(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#setNotifyHigh(boolean) public abstract void
     *      javax.management.monitor.GaugeMonitorMBean.setNotifyHigh(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNotifyHigh_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getNotifyLow() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getNotifyLow()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getNotifyLow() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getNotifyLow()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getNotifyLow() public abstract boolean
     *      javax.management.monitor.GaugeMonitorMBean.getNotifyLow() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotifyLow()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGauge() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getDerivedGauge()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGauge() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getDerivedGauge()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getDerivedGauge() public abstract java.lang.Number
     *      javax.management.monitor.GaugeMonitorMBean.getDerivedGauge() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDerivedGauge()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGauge(javax.management.ObjectName)
     * public abstract java.lang.Number
     * javax.management.monitor.GaugeMonitorMBean.getDerivedGauge(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDerivedGauge(javax.management.ObjectName)
     * public abstract java.lang.Number
     * javax.management.monitor.GaugeMonitorMBean.getDerivedGauge(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getDerivedGauge(javax.management.ObjectName) public abstract
     *      java.lang.Number javax.management.monitor.GaugeMonitorMBean.getDerivedGauge(javax.management.ObjectName)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDerivedGauge_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDifferenceMode() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getDifferenceMode()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getDifferenceMode() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getDifferenceMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getDifferenceMode() public abstract boolean
     *      javax.management.monitor.GaugeMonitorMBean.getDifferenceMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDifferenceMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getNotifyHigh() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getNotifyHigh()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getNotifyHigh() public abstract boolean
     * javax.management.monitor.GaugeMonitorMBean.getNotifyHigh()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getNotifyHigh() public abstract boolean
     *      javax.management.monitor.GaugeMonitorMBean.getNotifyHigh() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotifyHigh()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setNotifyLow(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setNotifyLow(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#setNotifyLow(boolean) public abstract void
     * javax.management.monitor.GaugeMonitorMBean.setNotifyLow(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#setNotifyLow(boolean) public abstract void
     *      javax.management.monitor.GaugeMonitorMBean.setNotifyLow(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNotifyLow_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getLowThreshold() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getLowThreshold()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.GaugeMonitorMBean#getLowThreshold() public abstract
     * java.lang.Number javax.management.monitor.GaugeMonitorMBean.getLowThreshold()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.GaugeMonitorMBean#getLowThreshold() public abstract java.lang.Number
     *      javax.management.monitor.GaugeMonitorMBean.getLowThreshold() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLowThreshold()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
