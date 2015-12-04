package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.monitor.MonitorNotification class
 * javax.management.monitor.MonitorNotification}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.monitor.MonitorNotificationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MonitorNotificationTests<SUT extends javax.management.monitor.MonitorNotification>
extends org.j8unit.repository.javax.management.NotificationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.monitor.MonitorNotification#getDerivedGauge() public java.lang.Object
     * javax.management.monitor.MonitorNotification.getDerivedGauge()}.
     * </p>
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
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedAttribute() public
     * java.lang.String javax.management.monitor.MonitorNotification.getObservedAttribute()}.
     * </p>
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
     * Test method for {@link javax.management.monitor.MonitorNotification#getObservedObject() public
     * javax.management.ObjectName javax.management.monitor.MonitorNotification.getObservedObject()}.
     * </p>
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
     * </p>
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
