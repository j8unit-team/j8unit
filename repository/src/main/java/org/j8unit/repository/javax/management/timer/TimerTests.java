package org.j8unit.repository.javax.management.timer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.timer.Timer class javax.management.timer.Timer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TimerClassTests}.
 * </p>
 *
 * @see javax.management.timer.Timer class javax.management.timer.Timer (the hereby targeted class-under-test class)
 * @see TimerClassTests TimerClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimerTests<SUT extends javax.management.timer.Timer>
extends TimerMBeanTests<SUT>, org.j8unit.repository.javax.management.MBeanRegistrationTests<SUT>,
org.j8unit.repository.javax.management.NotificationBroadcasterSupportTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getFixedRate(Integer) public synchronized java.lang.Boolean
     * javax.management.timer.Timer.getFixedRate(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getFixedRate(Integer) public synchronized java.lang.Boolean
     * javax.management.timer.Timer.getFixedRate(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getFixedRate(Integer) public synchronized java.lang.Boolean
     *      javax.management.timer.Timer.getFixedRate(java.lang.Integer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFixedRate_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#postDeregister() public void
     * javax.management.timer.Timer.postDeregister()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#postDeregister() public void
     * javax.management.timer.Timer.postDeregister()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#postDeregister() public void javax.management.timer.Timer.postDeregister() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationMessage(Integer) public synchronized
     * java.lang.String javax.management.timer.Timer.getNotificationMessage(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationMessage(Integer) public synchronized
     * java.lang.String javax.management.timer.Timer.getNotificationMessage(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNotificationMessage(Integer) public synchronized java.lang.String
     *      javax.management.timer.Timer.getNotificationMessage(java.lang.Integer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationMessage_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getPeriod(Integer) public synchronized java.lang.Long
     * javax.management.timer.Timer.getPeriod(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getPeriod(Integer) public synchronized java.lang.Long
     * javax.management.timer.Timer.getPeriod(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getPeriod(Integer) public synchronized java.lang.Long
     *      javax.management.timer.Timer.getPeriod(java.lang.Integer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPeriod_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#isActive() public boolean
     * javax.management.timer.Timer.isActive()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#isActive() public boolean
     * javax.management.timer.Timer.isActive()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#isActive() public boolean javax.management.timer.Timer.isActive() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.management.timer.Timer#getNotificationInfo() public synchronized
     * javax.management.MBeanNotificationInfo[] javax.management.timer.Timer.getNotificationInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationInfo() public synchronized
     * javax.management.MBeanNotificationInfo[] javax.management.timer.Timer.getNotificationInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNotificationInfo() public synchronized
     *      javax.management.MBeanNotificationInfo[] javax.management.timer.Timer.getNotificationInfo() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationUserData(Integer) public synchronized
     * java.lang.Object javax.management.timer.Timer.getNotificationUserData(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationUserData(Integer) public synchronized
     * java.lang.Object javax.management.timer.Timer.getNotificationUserData(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNotificationUserData(Integer) public synchronized java.lang.Object
     *      javax.management.timer.Timer.getNotificationUserData(java.lang.Integer) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationUserData_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long) public
     *      synchronized java.lang.Integer
     *      javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.
     *      Date,long) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotification_String_String_Object_Date_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date) public synchronized
     *      java.lang.Integer
     *      javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.
     *      Date) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotification_String_String_Object_Date()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long, boolean)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long,long,boolean)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long, boolean)
     * public synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long,long,boolean)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long, boolean)
     *      public synchronized java.lang.Integer
     *      javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.
     *      Date,long,long,boolean) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotification_String_String_Object_Date_long_long_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long) public
     * synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long,long)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long) public
     * synchronized java.lang.Integer
     * javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.Date,long,long)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#addNotification(String, String, Object, java.util.Date, long, long) public
     *      synchronized java.lang.Integer
     *      javax.management.timer.Timer.addNotification(java.lang.String,java.lang.String,java.lang.Object,java.util.
     *      Date,long,long) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotification_String_String_Object_Date_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getSendPastNotifications() public boolean
     * javax.management.timer.Timer.getSendPastNotifications()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getSendPastNotifications() public boolean
     * javax.management.timer.Timer.getSendPastNotifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getSendPastNotifications() public boolean
     *      javax.management.timer.Timer.getSendPastNotifications() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSendPastNotifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationIDs(String) public synchronized
     * java.util.Vector<java.lang.Integer> javax.management.timer.Timer.getNotificationIDs(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationIDs(String) public synchronized
     * java.util.Vector javax.management.timer.Timer.getNotificationIDs(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNotificationIDs(String) public synchronized java.util.Vector
     *      javax.management.timer.Timer.getNotificationIDs(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationIDs_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationType(Integer) public synchronized
     * java.lang.String javax.management.timer.Timer.getNotificationType(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNotificationType(Integer) public synchronized
     * java.lang.String javax.management.timer.Timer.getNotificationType(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNotificationType(Integer) public synchronized java.lang.String
     *      javax.management.timer.Timer.getNotificationType(java.lang.Integer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationType_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#removeNotifications(String) public synchronized void
     * javax.management.timer.Timer.removeNotifications(java.lang.String) throws
     * javax.management.InstanceNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#removeNotifications(String) public synchronized void
     * javax.management.timer.Timer.removeNotifications(java.lang.String) throws
     * javax.management.InstanceNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#removeNotifications(String) public synchronized void
     *      javax.management.timer.Timer.removeNotifications(java.lang.String) throws
     *      javax.management.InstanceNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotifications_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#preRegister(javax.management.MBeanServer, javax.management.ObjectName) public
     * javax.management.ObjectName
     * javax.management.timer.Timer.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * <p>
     * Test method for
     * {@link javax.management.timer.Timer#preRegister(javax.management.MBeanServer, javax.management.ObjectName) public
     * javax.management.ObjectName
     * javax.management.timer.Timer.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#preRegister(javax.management.MBeanServer, javax.management.ObjectName) public
     *      javax.management.ObjectName
     *      javax.management.timer.Timer.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     *      java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preRegister_MBeanServer_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNbNotifications() public synchronized int
     * javax.management.timer.Timer.getNbNotifications()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNbNotifications() public synchronized int
     * javax.management.timer.Timer.getNbNotifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNbNotifications() public synchronized int
     *      javax.management.timer.Timer.getNbNotifications() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNbNotifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getDate(Integer) public synchronized java.util.Date
     * javax.management.timer.Timer.getDate(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getDate(Integer) public synchronized java.util.Date
     * javax.management.timer.Timer.getDate(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getDate(Integer) public synchronized java.util.Date
     *      javax.management.timer.Timer.getDate(java.lang.Integer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDate_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#preDeregister() public void
     * javax.management.timer.Timer.preDeregister() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#preDeregister() public void
     * javax.management.timer.Timer.preDeregister() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#preDeregister() public void javax.management.timer.Timer.preDeregister() throws
     *      java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#removeNotification(Integer) public synchronized void
     * javax.management.timer.Timer.removeNotification(java.lang.Integer) throws
     * javax.management.InstanceNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#removeNotification(Integer) public synchronized void
     * javax.management.timer.Timer.removeNotification(java.lang.Integer) throws
     * javax.management.InstanceNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#removeNotification(Integer) public synchronized void
     *      javax.management.timer.Timer.removeNotification(java.lang.Integer) throws
     *      javax.management.InstanceNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeNotification_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#setSendPastNotifications(boolean) public void
     * javax.management.timer.Timer.setSendPastNotifications(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#setSendPastNotifications(boolean) public void
     * javax.management.timer.Timer.setSendPastNotifications(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#setSendPastNotifications(boolean) public void
     *      javax.management.timer.Timer.setSendPastNotifications(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setSendPastNotifications_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#getAllNotificationIDs() public synchronized java.util.Vector
     * <java.lang.Integer> javax.management.timer.Timer.getAllNotificationIDs()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getAllNotificationIDs() public synchronized java.util.Vector
     * javax.management.timer.Timer.getAllNotificationIDs()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getAllNotificationIDs() public synchronized java.util.Vector
     *      javax.management.timer.Timer.getAllNotificationIDs() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAllNotificationIDs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#isEmpty() public synchronized boolean
     * javax.management.timer.Timer.isEmpty()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#isEmpty() public synchronized boolean
     * javax.management.timer.Timer.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#isEmpty() public synchronized boolean javax.management.timer.Timer.isEmpty()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isEmpty()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#start() public synchronized void
     * javax.management.timer.Timer.start()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#start() public synchronized void
     * javax.management.timer.Timer.start()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#start() public synchronized void javax.management.timer.Timer.start() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.management.timer.Timer#getNbOccurences(Integer) public synchronized java.lang.Long
     * javax.management.timer.Timer.getNbOccurences(java.lang.Integer)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#getNbOccurences(Integer) public synchronized java.lang.Long
     * javax.management.timer.Timer.getNbOccurences(java.lang.Integer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#getNbOccurences(Integer) public synchronized java.lang.Long
     *      javax.management.timer.Timer.getNbOccurences(java.lang.Integer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNbOccurences_Integer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#stop() public synchronized void
     * javax.management.timer.Timer.stop()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#stop() public synchronized void
     * javax.management.timer.Timer.stop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#stop() public synchronized void javax.management.timer.Timer.stop() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.management.timer.Timer#removeAllNotifications() public synchronized void
     * javax.management.timer.Timer.removeAllNotifications()}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#removeAllNotifications() public synchronized void
     * javax.management.timer.Timer.removeAllNotifications()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#removeAllNotifications() public synchronized void
     *      javax.management.timer.Timer.removeAllNotifications() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeAllNotifications()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.timer.Timer#postRegister(Boolean) public void
     * javax.management.timer.Timer.postRegister(java.lang.Boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.timer.Timer#postRegister(Boolean) public void
     * javax.management.timer.Timer.postRegister(java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.timer.Timer#postRegister(Boolean) public void
     *      javax.management.timer.Timer.postRegister(java.lang.Boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postRegister_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
