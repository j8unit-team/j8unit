package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextServicesSupport class
 * java.beans.beancontext.BeanContextServicesSupport}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BeanContextServicesSupportClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextServicesSupport class java.beans.beancontext.BeanContextServicesSupport (the
 *      hereby targeted class-under-test class)
 * @see BeanContextServicesSupportClassTests BeanContextServicesSupportClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextServicesSupportTests<SUT extends java.beans.beancontext.BeanContextServicesSupport>
extends BeanContextServicesTests, BeanContextSupportTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this J8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#hasService(Class) public synchronized
     * boolean java.beans.beancontext.BeanContextServicesSupport.hasService(java.lang.Class)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#hasService(Class) public synchronized
     * boolean java.beans.beancontext.BeanContextServicesSupport.hasService(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#hasService(Class) public synchronized boolean
     *      java.beans.beancontext.BeanContextServicesSupport.hasService(java.lang.Class) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasService_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#initialize() public void
     * java.beans.beancontext.BeanContextServicesSupport.initialize()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#initialize() public void
     * java.beans.beancontext.BeanContextServicesSupport.initialize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#initialize() public void
     *      java.beans.beancontext.BeanContextServicesSupport.initialize() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     *      public void java.beans.beancontext.BeanContextServicesSupport.serviceRevoked(java.beans.beancontext.
     *      BeanContextServiceRevokedEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_serviceRevoked_BeanContextServiceRevokedEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getBeanContextServicesPeer() public
     * java.beans.beancontext.BeanContextServices
     * java.beans.beancontext.BeanContextServicesSupport.getBeanContextServicesPeer()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getBeanContextServicesPeer() public
     * java.beans.beancontext.BeanContextServices
     * java.beans.beancontext.BeanContextServicesSupport.getBeanContextServicesPeer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#getBeanContextServicesPeer() public
     *      java.beans.beancontext.BeanContextServices
     *      java.beans.beancontext.BeanContextServicesSupport.getBeanContextServicesPeer() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanContextServicesPeer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#addService(Class, java.beans.beancontext.BeanContextServiceProvider)
     * public boolean
     * java.beans.beancontext.BeanContextServicesSupport.addService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#addService(Class, java.beans.beancontext.BeanContextServiceProvider)
     * public boolean
     * java.beans.beancontext.BeanContextServicesSupport.addService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#addService(Class,
     *      java.beans.beancontext.BeanContextServiceProvider) public boolean
     *      java.beans.beancontext.BeanContextServicesSupport.addService(java.lang.Class,java.beans.beancontext.
     *      BeanContextServiceProvider) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addService_Class_BeanContextServiceProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#removeBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     *      public void
     *      java.beans.beancontext.BeanContextServicesSupport.removeBeanContextServicesListener(java.beans.beancontext.
     *      BeanContextServicesListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextServicesListener_BeanContextServicesListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceSelectors(Class) public
     * java.util.Iterator java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceSelectors(java.lang.Class)}
     * .
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceSelectors(Class) public
     * java.util.Iterator java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceSelectors(java.lang.Class)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceSelectors(Class) public
     *      java.util.Iterator
     *      java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceSelectors(java.lang.Class) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceSelectors_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceClasses() public
     * java.util.Iterator java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceClasses()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceClasses() public
     * java.util.Iterator java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceClasses()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#getCurrentServiceClasses() public java.util.Iterator
     *      java.beans.beancontext.BeanContextServicesSupport.getCurrentServiceClasses() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCurrentServiceClasses()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#revokeService(Class, java.beans.beancontext.BeanContextServiceProvider, boolean)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.revokeService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider,boolean)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#revokeService(Class, java.beans.beancontext.BeanContextServiceProvider, boolean)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.revokeService(java.lang.Class,java.beans.beancontext.BeanContextServiceProvider,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#revokeService(Class,
     *      java.beans.beancontext.BeanContextServiceProvider, boolean) public void
     *      java.beans.beancontext.BeanContextServicesSupport.revokeService(java.lang.Class,java.beans.beancontext.
     *      BeanContextServiceProvider,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_revokeService_Class_BeanContextServiceProvider_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#getService(java.beans.beancontext.BeanContextChild, Object, Class, Object, java.beans.beancontext.BeanContextServiceRevokedListener)
     * public java.lang.Object
     * java.beans.beancontext.BeanContextServicesSupport.getService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener)
     * throws java.util.TooManyListenersException}.
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#getService(java.beans.beancontext.BeanContextChild, Object, Class, Object, java.beans.beancontext.BeanContextServiceRevokedListener)
     * public java.lang.Object
     * java.beans.beancontext.BeanContextServicesSupport.getService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener)
     * throws java.util.TooManyListenersException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#getService(java.beans.beancontext.BeanContextChild,
     *      Object, Class, Object, java.beans.beancontext.BeanContextServiceRevokedListener) public java.lang.Object
     *      java.beans.beancontext.BeanContextServicesSupport.getService(java.beans.beancontext.BeanContextChild,java.
     *      lang.Object,java.lang.Class,java.lang.Object,java.beans.beancontext.BeanContextServiceRevokedListener)
     *      throws java.util.TooManyListenersException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getService_BeanContextChild_Object_Class_Object_BeanContextServiceRevokedListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     *      public void java.beans.beancontext.BeanContextServicesSupport.serviceAvailable(java.beans.beancontext.
     *      BeanContextServiceAvailableEvent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_serviceAvailable_BeanContextServiceAvailableEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#addBeanContextServicesListener(java.beans.beancontext.BeanContextServicesListener)
     *      public void
     *      java.beans.beancontext.BeanContextServicesSupport.addBeanContextServicesListener(java.beans.beancontext.
     *      BeanContextServicesListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextServicesListener_BeanContextServicesListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#releaseService(java.beans.beancontext.BeanContextChild, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.releaseService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Object)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextServicesSupport#releaseService(java.beans.beancontext.BeanContextChild, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextServicesSupport.releaseService(java.beans.beancontext.BeanContextChild,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextServicesSupport#releaseService(java.beans.beancontext.BeanContextChild,
     *      Object, Object) public void
     *      java.beans.beancontext.BeanContextServicesSupport.releaseService(java.beans.beancontext.BeanContextChild,
     *      java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_releaseService_BeanContextChild_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#setBeanContext(java.beans.beancontext.BeanContext)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.beancontext.BeanContextChild#setBeanContext(java.beans.beancontext.BeanContext)
     * interface java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setBeanContext_BeanContext()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#getResource(String, java.beans.beancontext.BeanContextChild)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.beancontext.BeanContext#getResource(String, java.beans.beancontext.BeanContextChild)
     * interface java.beans.beancontext.BeanContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResource_String_BeanContextChild()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChild#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * interface java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContext#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * interface java.beans.beancontext.BeanContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#avoidingGui() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.Visibility#avoidingGui() interface java.beans.Visibility}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_avoidingGui()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#equals(Object) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#equals(Object) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#remove(Object) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#remove(Object) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#setDesignTime(boolean) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.DesignMode#setDesignTime(boolean) interface java.beans.DesignMode}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDesignTime_boolean()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChild#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * interface java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#iterator() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#iterator() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#removeAll(java.util.Collection) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#removeAll(java.util.Collection) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#toArray(Object[]) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#toArray(Object[]) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray_ObjectArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#toArray() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#toArray() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#dontUseGui() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.Visibility#dontUseGui() interface java.beans.Visibility}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dontUseGui()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#isDesignTime() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.DesignMode#isDesignTime() interface java.beans.DesignMode}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDesignTime()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChild#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * interface java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#add(Object) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#add(Object) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContext#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * interface java.beans.beancontext.BeanContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#getResourceAsStream(String, java.beans.beancontext.BeanContextChild)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContext#getResourceAsStream(String, java.beans.beancontext.BeanContextChild)
     * interface java.beans.beancontext.BeanContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String_BeanContextChild()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#containsAll(java.util.Collection) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#containsAll(java.util.Collection) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#clear() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#clear() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clear()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#isEmpty() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#isEmpty() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isEmpty()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#hashCode() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#hashCode() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#getBeanContext() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.beancontext.BeanContextChild#getBeanContext() interface
     * java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBeanContext()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#okToUseGui() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.Visibility#okToUseGui() interface java.beans.Visibility}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_okToUseGui()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#contains(Object) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#contains(Object) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_contains_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#addAll(java.util.Collection) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#addAll(java.util.Collection) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#size() class java.beans.beancontext.BeanContextSupport}
     * </li>
     * <li>{@linkplain java.util.Collection#size() interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#needsGui() class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.Visibility#needsGui() interface java.beans.Visibility}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_needsGui()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#instantiateChild(String) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.beans.beancontext.BeanContext#instantiateChild(String) interface
     * java.beans.beancontext.BeanContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_instantiateChild_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.beans.beancontext.BeanContextSupport#retainAll(java.util.Collection) class
     * java.beans.beancontext.BeanContextSupport}</li>
     * <li>{@linkplain java.util.Collection#retainAll(java.util.Collection) interface java.util.Collection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_retainAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextSupport#addVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * class java.beans.beancontext.BeanContextSupport}</li>
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChild#addVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * interface java.beans.beancontext.BeanContextChild}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
    }

}
