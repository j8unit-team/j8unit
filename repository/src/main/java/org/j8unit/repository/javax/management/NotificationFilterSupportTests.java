package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.NotificationFilterSupport class javax.management.NotificationFilterSupport},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.NotificationFilterSupportClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NotificationFilterSupportTests<SUT extends javax.management.NotificationFilterSupport>
extends org.j8unit.repository.javax.management.NotificationFilterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.NotificationFilterSupport#enableType(java.lang.String) public
     * synchronized void javax.management.NotificationFilterSupport.enableType(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enableType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.NotificationFilterSupport#disableAllTypes() public synchronized void
     * javax.management.NotificationFilterSupport.disableAllTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disableAllTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.NotificationFilterSupport#isNotificationEnabled(javax.management.Notification) public
     * synchronized boolean
     * javax.management.NotificationFilterSupport.isNotificationEnabled(javax.management.Notification)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isNotificationEnabled_Notification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.NotificationFilterSupport#getEnabledTypes() public synchronized
     * java.util.Vector javax.management.NotificationFilterSupport.getEnabledTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.NotificationFilterSupport#disableType(java.lang.String) public
     * synchronized void javax.management.NotificationFilterSupport.disableType(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disableType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
