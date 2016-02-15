package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextChildSupport class
 * java.beans.beancontext.BeanContextChildSupport}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BeanContextChildSupportClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextChildSupport class java.beans.beancontext.BeanContextChildSupport (the hereby
 *      targeted class-under-test class)
 * @see BeanContextChildSupportClassTests BeanContextChildSupportClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextChildSupportTests<SUT extends java.beans.beancontext.BeanContextChildSupport>
extends BeanContextChildTests<SUT>, BeanContextServicesListenerTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#addPropertyChangeListener(String,
     *      java.beans.PropertyChangeListener) public void
     *      java.beans.beancontext.BeanContextChildSupport.addPropertyChangeListener(java.lang.String,java.beans.
     *      PropertyChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#setBeanContext(java.beans.beancontext.BeanContext) public
     * synchronized void
     * java.beans.beancontext.BeanContextChildSupport.setBeanContext(java.beans.beancontext.BeanContext) throws
     * java.beans.PropertyVetoException}.
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#setBeanContext(java.beans.beancontext.BeanContext) public
     * synchronized void
     * java.beans.beancontext.BeanContextChildSupport.setBeanContext(java.beans.beancontext.BeanContext) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#setBeanContext(java.beans.beancontext.BeanContext) public
     *      synchronized void
     *      java.beans.beancontext.BeanContextChildSupport.setBeanContext(java.beans.beancontext.BeanContext) throws
     *      java.beans.PropertyVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setBeanContext_BeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#getBeanContextChildPeer() public
     * java.beans.beancontext.BeanContextChild java.beans.beancontext.BeanContextChildSupport.getBeanContextChildPeer()}
     * .
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#getBeanContextChildPeer() public
     * java.beans.beancontext.BeanContextChild java.beans.beancontext.BeanContextChildSupport.getBeanContextChildPeer()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#getBeanContextChildPeer() public
     *      java.beans.beancontext.BeanContextChild
     *      java.beans.beancontext.BeanContextChildSupport.getBeanContextChildPeer() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanContextChildPeer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#serviceRevoked(java.beans.beancontext.BeanContextServiceRevokedEvent)
     *      public void java.beans.beancontext.BeanContextChildSupport.serviceRevoked(java.beans.beancontext.
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
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#removeVetoableChangeListener(String,
     *      java.beans.VetoableChangeListener) public void
     *      java.beans.beancontext.BeanContextChildSupport.removeVetoableChangeListener(java.lang.String,java.beans.
     *      VetoableChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#isDelegated() public boolean
     * java.beans.beancontext.BeanContextChildSupport.isDelegated()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#isDelegated() public boolean
     * java.beans.beancontext.BeanContextChildSupport.isDelegated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#isDelegated() public boolean
     *      java.beans.beancontext.BeanContextChildSupport.isDelegated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDelegated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#getBeanContext() public synchronized
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextChildSupport.getBeanContext()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#getBeanContext() public synchronized
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextChildSupport.getBeanContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#getBeanContext() public synchronized
     *      java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextChildSupport.getBeanContext() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#removePropertyChangeListener(String,
     *      java.beans.PropertyChangeListener) public void
     *      java.beans.beancontext.BeanContextChildSupport.removePropertyChangeListener(java.lang.String,java.beans.
     *      PropertyChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_String_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#validatePendingSetBeanContext(java.beans.beancontext.BeanContext)
     * public boolean
     * java.beans.beancontext.BeanContextChildSupport.validatePendingSetBeanContext(java.beans.beancontext.BeanContext)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#validatePendingSetBeanContext(java.beans.beancontext.BeanContext)
     * public boolean
     * java.beans.beancontext.BeanContextChildSupport.validatePendingSetBeanContext(java.beans.beancontext.BeanContext)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#validatePendingSetBeanContext(java.beans.beancontext.BeanContext)
     *      public boolean
     *      java.beans.beancontext.BeanContextChildSupport.validatePendingSetBeanContext(java.beans.beancontext.
     *      BeanContext) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validatePendingSetBeanContext_BeanContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#fireVetoableChange(String, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.fireVetoableChange(java.lang.String,java.lang.Object,java.lang.Object)
     * throws java.beans.PropertyVetoException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#fireVetoableChange(String, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.fireVetoableChange(java.lang.String,java.lang.Object,java.lang.Object)
     * throws java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#fireVetoableChange(String, Object, Object) public void
     *      java.beans.beancontext.BeanContextChildSupport.fireVetoableChange(java.lang.String,java.lang.Object,java.
     *      lang.Object) throws java.beans.PropertyVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireVetoableChange_String_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)
     *      public void java.beans.beancontext.BeanContextChildSupport.serviceAvailable(java.beans.beancontext.
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
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#firePropertyChange(String, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
     * .
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextChildSupport#firePropertyChange(String, Object, Object)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#firePropertyChange(String, Object, Object) public void
     *      java.beans.beancontext.BeanContextChildSupport.firePropertyChange(java.lang.String,java.lang.Object,java.
     *      lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_String_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#addVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextChildSupport#addVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.beancontext.BeanContextChildSupport.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextChildSupport#addVetoableChangeListener(String,
     *      java.beans.VetoableChangeListener) public void
     *      java.beans.beancontext.BeanContextChildSupport.addVetoableChangeListener(java.lang.String,java.beans.
     *      VetoableChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
