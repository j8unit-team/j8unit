package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.monitor.MonitorNotification class
 * javax.management.monitor.MonitorNotification}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MonitorNotificationClassTests}.
 * </p>
 *
 * @see javax.management.monitor.MonitorNotification class javax.management.monitor.MonitorNotification (the hereby
 *      targeted class-under-test class)
 * @see MonitorNotificationClassTests MonitorNotificationClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorNotificationTests<SUT extends javax.management.monitor.MonitorNotification>
extends org.j8unit.repository.javax.management.NotificationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedAttribute() public
     * java.lang.String javax.management.monitor.MonitorNotification.getObservedAttribute()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedAttribute() public
     * java.lang.String javax.management.monitor.MonitorNotification.getObservedAttribute()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorNotification#getObservedAttribute() public java.lang.String
     *      javax.management.monitor.MonitorNotification.getObservedAttribute() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.monitor.MonitorNotification#getDerivedGauge() public java.lang.Object
     * javax.management.monitor.MonitorNotification.getDerivedGauge()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getDerivedGauge() public java.lang.Object
     * javax.management.monitor.MonitorNotification.getDerivedGauge()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorNotification#getDerivedGauge() public java.lang.Object
     *      javax.management.monitor.MonitorNotification.getDerivedGauge() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedObject() public
     * javax.management.ObjectName javax.management.monitor.MonitorNotification.getObservedObject()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedObject() public
     * javax.management.ObjectName javax.management.monitor.MonitorNotification.getObservedObject()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorNotification#getObservedObject() public javax.management.ObjectName
     *      javax.management.monitor.MonitorNotification.getObservedObject() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.monitor.MonitorNotification#getTrigger() public java.lang.Object
     * javax.management.monitor.MonitorNotification.getTrigger()}.
     *
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getTrigger() public java.lang.Object
     * javax.management.monitor.MonitorNotification.getTrigger()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.monitor.MonitorNotification#getTrigger() public java.lang.Object
     *      javax.management.monitor.MonitorNotification.getTrigger() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrigger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
