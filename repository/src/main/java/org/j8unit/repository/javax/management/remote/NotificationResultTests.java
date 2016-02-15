package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.NotificationResult class
 * javax.management.remote.NotificationResult}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NotificationResultClassTests}.
 * </p>
 *
 * @see javax.management.remote.NotificationResult class javax.management.remote.NotificationResult (the hereby targeted
 *      class-under-test class)
 * @see NotificationResultClassTests NotificationResultClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotificationResultTests<SUT extends javax.management.remote.NotificationResult>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#getTargetedNotifications() public
     * javax.management.remote.TargetedNotification[]
     * javax.management.remote.NotificationResult.getTargetedNotifications()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#getTargetedNotifications() public
     * javax.management.remote.TargetedNotification[]
     * javax.management.remote.NotificationResult.getTargetedNotifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.NotificationResult#getTargetedNotifications() public
     *      javax.management.remote.TargetedNotification[]
     *      javax.management.remote.NotificationResult.getTargetedNotifications() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetedNotifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#getEarliestSequenceNumber() public long
     * javax.management.remote.NotificationResult.getEarliestSequenceNumber()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#getEarliestSequenceNumber() public long
     * javax.management.remote.NotificationResult.getEarliestSequenceNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.NotificationResult#getEarliestSequenceNumber() public long
     *      javax.management.remote.NotificationResult.getEarliestSequenceNumber() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEarliestSequenceNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#toString() public java.lang.String
     * javax.management.remote.NotificationResult.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#toString() public java.lang.String
     * javax.management.remote.NotificationResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.NotificationResult#toString() public java.lang.String
     *      javax.management.remote.NotificationResult.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.remote.NotificationResult#getNextSequenceNumber() public long
     * javax.management.remote.NotificationResult.getNextSequenceNumber()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.NotificationResult#getNextSequenceNumber() public long
     * javax.management.remote.NotificationResult.getNextSequenceNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.NotificationResult#getNextSequenceNumber() public long
     *      javax.management.remote.NotificationResult.getNextSequenceNumber() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextSequenceNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
