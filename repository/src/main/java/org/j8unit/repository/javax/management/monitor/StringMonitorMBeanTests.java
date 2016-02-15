package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.monitor.StringMonitorMBean interface
 * javax.management.monitor.StringMonitorMBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link StringMonitorMBeanClassTests}.
 * </p>
 *
 * @see javax.management.monitor.StringMonitorMBean interface javax.management.monitor.StringMonitorMBean (the hereby
 *      targeted class-under-test class)
 * @see StringMonitorMBeanClassTests StringMonitorMBeanClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StringMonitorMBeanTests<SUT extends javax.management.monitor.StringMonitorMBean>
extends MonitorMBeanTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setStringToCompare(String) public abstract
     * void javax.management.monitor.StringMonitorMBean.setStringToCompare(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setStringToCompare(String) public abstract
     * void javax.management.monitor.StringMonitorMBean.setStringToCompare(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#setStringToCompare(String) public abstract void
     *      javax.management.monitor.StringMonitorMBean.setStringToCompare(java.lang.String) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStringToCompare_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGauge() public abstract
     * java.lang.String javax.management.monitor.StringMonitorMBean.getDerivedGauge()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGauge() public abstract
     * java.lang.String javax.management.monitor.StringMonitorMBean.getDerivedGauge()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getDerivedGauge() public abstract java.lang.String
     *      javax.management.monitor.StringMonitorMBean.getDerivedGauge() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGauge(javax.management.ObjectName)
     * public abstract java.lang.String
     * javax.management.monitor.StringMonitorMBean.getDerivedGauge(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGauge(javax.management.ObjectName)
     * public abstract java.lang.String
     * javax.management.monitor.StringMonitorMBean.getDerivedGauge(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getDerivedGauge(javax.management.ObjectName) public abstract
     *      java.lang.String javax.management.monitor.StringMonitorMBean.getDerivedGauge(javax.management.ObjectName)
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
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setNotifyDiffer(boolean) public abstract void
     * javax.management.monitor.StringMonitorMBean.setNotifyDiffer(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setNotifyDiffer(boolean) public abstract void
     * javax.management.monitor.StringMonitorMBean.setNotifyDiffer(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#setNotifyDiffer(boolean) public abstract void
     *      javax.management.monitor.StringMonitorMBean.setNotifyDiffer(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNotifyDiffer_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     * abstract long javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName)}.
     *
     * <p>
     * Test method for
     * {@link javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     * abstract long javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp(javax.management.ObjectName) public
     *      abstract long
     *      javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp(javax.management.ObjectName) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp() public abstract
     * long javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp() public abstract
     * long javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getDerivedGaugeTimeStamp() public abstract long
     *      javax.management.monitor.StringMonitorMBean.getDerivedGaugeTimeStamp() (the hereby targeted
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
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getNotifyDiffer() public abstract boolean
     * javax.management.monitor.StringMonitorMBean.getNotifyDiffer()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getNotifyDiffer() public abstract boolean
     * javax.management.monitor.StringMonitorMBean.getNotifyDiffer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getNotifyDiffer() public abstract boolean
     *      javax.management.monitor.StringMonitorMBean.getNotifyDiffer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotifyDiffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getNotifyMatch() public abstract boolean
     * javax.management.monitor.StringMonitorMBean.getNotifyMatch()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getNotifyMatch() public abstract boolean
     * javax.management.monitor.StringMonitorMBean.getNotifyMatch()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getNotifyMatch() public abstract boolean
     *      javax.management.monitor.StringMonitorMBean.getNotifyMatch() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotifyMatch()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setNotifyMatch(boolean) public abstract void
     * javax.management.monitor.StringMonitorMBean.setNotifyMatch(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#setNotifyMatch(boolean) public abstract void
     * javax.management.monitor.StringMonitorMBean.setNotifyMatch(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#setNotifyMatch(boolean) public abstract void
     *      javax.management.monitor.StringMonitorMBean.setNotifyMatch(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNotifyMatch_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getStringToCompare() public abstract
     * java.lang.String javax.management.monitor.StringMonitorMBean.getStringToCompare()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.StringMonitorMBean#getStringToCompare() public abstract
     * java.lang.String javax.management.monitor.StringMonitorMBean.getStringToCompare()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.StringMonitorMBean#getStringToCompare() public abstract java.lang.String
     *      javax.management.monitor.StringMonitorMBean.getStringToCompare() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStringToCompare()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
