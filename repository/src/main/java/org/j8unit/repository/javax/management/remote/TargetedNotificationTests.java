package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.TargetedNotification class
 * javax.management.remote.TargetedNotification}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TargetedNotificationClassTests}.
 * </p>
 *
 * @see javax.management.remote.TargetedNotification class javax.management.remote.TargetedNotification (the hereby
 *      targeted class-under-test class)
 * @see TargetedNotificationClassTests TargetedNotificationClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TargetedNotificationTests<SUT extends javax.management.remote.TargetedNotification>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#toString() public java.lang.String
     * javax.management.remote.TargetedNotification.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#toString() public java.lang.String
     * javax.management.remote.TargetedNotification.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.TargetedNotification#toString() public java.lang.String
     *      javax.management.remote.TargetedNotification.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#getListenerID() public java.lang.Integer
     * javax.management.remote.TargetedNotification.getListenerID()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#getListenerID() public java.lang.Integer
     * javax.management.remote.TargetedNotification.getListenerID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.TargetedNotification#getListenerID() public java.lang.Integer
     *      javax.management.remote.TargetedNotification.getListenerID() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListenerID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#getNotification() public
     * javax.management.Notification javax.management.remote.TargetedNotification.getNotification()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.TargetedNotification#getNotification() public
     * javax.management.Notification javax.management.remote.TargetedNotification.getNotification()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.TargetedNotification#getNotification() public javax.management.Notification
     *      javax.management.remote.TargetedNotification.getNotification() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNotification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
