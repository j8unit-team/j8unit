package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.beancontext.BeanContextSupport class
 * java.beans.beancontext.BeanContextSupport}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BeanContextSupportClassTests}.
 * </p>
 *
 * @see java.beans.beancontext.BeanContextSupport class java.beans.beancontext.BeanContextSupport (the hereby targeted
 *      class-under-test class)
 * @see BeanContextSupportClassTests BeanContextSupportClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextSupportTests<SUT extends java.beans.beancontext.BeanContextSupport>
extends BeanContextTests, org.j8unit.repository.java.io.SerializableTests, org.j8unit.repository.java.beans.PropertyChangeListenerTests,
org.j8unit.repository.java.beans.VetoableChangeListenerTests, BeanContextChildSupportTests {

    // The definition of the SUT factory method must be repeated
    // because of the "rawtypes" nature of this J8Unit test interface
    // (caused by the "rawtypes" nature of the class-under-test).
    @Override
    public abstract SUT createNewSUT();

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#getResource(String, java.beans.beancontext.BeanContextChild)
     * public java.net.URL
     * java.beans.beancontext.BeanContextSupport.getResource(java.lang.String,java.beans.beancontext.BeanContextChild)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#getResource(String, java.beans.beancontext.BeanContextChild)
     * public java.net.URL
     * java.beans.beancontext.BeanContextSupport.getResource(java.lang.String,java.beans.beancontext.BeanContextChild)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#getResource(String, java.beans.beancontext.BeanContextChild)
     *      public java.net.URL
     *      java.beans.beancontext.BeanContextSupport.getResource(java.lang.String,java.beans.beancontext.
     *      BeanContextChild) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResource_String_BeanContextChild()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public void
     * java.beans.beancontext.BeanContextSupport.removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public void
     * java.beans.beancontext.BeanContextSupport.removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     *      public void
     *      java.beans.beancontext.BeanContextSupport.removeBeanContextMembershipListener(java.beans.beancontext.
     *      BeanContextMembershipListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#getBeanContextPeer() public
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextSupport.getBeanContextPeer()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#getBeanContextPeer() public
     * java.beans.beancontext.BeanContext java.beans.beancontext.BeanContextSupport.getBeanContextPeer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#getBeanContextPeer() public java.beans.beancontext.BeanContext
     *      java.beans.beancontext.BeanContextSupport.getBeanContextPeer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBeanContextPeer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#avoidingGui() public boolean
     * java.beans.beancontext.BeanContextSupport.avoidingGui()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#avoidingGui() public boolean
     * java.beans.beancontext.BeanContextSupport.avoidingGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#avoidingGui() public boolean
     *      java.beans.beancontext.BeanContextSupport.avoidingGui() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_avoidingGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#remove(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#remove(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#remove(Object) public boolean
     *      java.beans.beancontext.BeanContextSupport.remove(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#setDesignTime(boolean) public synchronized void
     * java.beans.beancontext.BeanContextSupport.setDesignTime(boolean)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#setDesignTime(boolean) public synchronized void
     * java.beans.beancontext.BeanContextSupport.setDesignTime(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#setDesignTime(boolean) public synchronized void
     *      java.beans.beancontext.BeanContextSupport.setDesignTime(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDesignTime_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#iterator() public java.util.Iterator
     * java.beans.beancontext.BeanContextSupport.iterator()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#iterator() public java.util.Iterator
     * java.beans.beancontext.BeanContextSupport.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#iterator() public java.util.Iterator
     *      java.beans.beancontext.BeanContextSupport.iterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#removeAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.removeAll(java.util.Collection)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#removeAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.removeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#removeAll(java.util.Collection) public boolean
     *      java.beans.beancontext.BeanContextSupport.removeAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isSerializing() public boolean
     * java.beans.beancontext.BeanContextSupport.isSerializing()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isSerializing() public boolean
     * java.beans.beancontext.BeanContextSupport.isSerializing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#isSerializing() public boolean
     *      java.beans.beancontext.BeanContextSupport.isSerializing() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSerializing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#toArray(Object[]) public java.lang.Object[]
     * java.beans.beancontext.BeanContextSupport.toArray(java.lang.Object[])}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#toArray(Object[]) public java.lang.Object[]
     * java.beans.beancontext.BeanContextSupport.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#toArray(Object[]) public java.lang.Object[]
     *      java.beans.beancontext.BeanContextSupport.toArray(java.lang.Object[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#toArray() public java.lang.Object[]
     * java.beans.beancontext.BeanContextSupport.toArray()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#toArray() public java.lang.Object[]
     * java.beans.beancontext.BeanContextSupport.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#toArray() public java.lang.Object[]
     *      java.beans.beancontext.BeanContextSupport.toArray() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#dontUseGui() public synchronized void
     * java.beans.beancontext.BeanContextSupport.dontUseGui()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#dontUseGui() public synchronized void
     * java.beans.beancontext.BeanContextSupport.dontUseGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#dontUseGui() public synchronized void
     *      java.beans.beancontext.BeanContextSupport.dontUseGui() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_dontUseGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#propertyChange(java.beans.PropertyChangeEvent)
     * public void java.beans.beancontext.BeanContextSupport.propertyChange(java.beans.PropertyChangeEvent)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#propertyChange(java.beans.PropertyChangeEvent)
     * public void java.beans.beancontext.BeanContextSupport.propertyChange(java.beans.PropertyChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#propertyChange(java.beans.PropertyChangeEvent) public void
     *      java.beans.beancontext.BeanContextSupport.propertyChange(java.beans.PropertyChangeEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_propertyChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isDesignTime() public synchronized boolean
     * java.beans.beancontext.BeanContextSupport.isDesignTime()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isDesignTime() public synchronized boolean
     * java.beans.beancontext.BeanContextSupport.isDesignTime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#isDesignTime() public synchronized boolean
     *      java.beans.beancontext.BeanContextSupport.isDesignTime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isDesignTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#readChildren(java.io.ObjectInputStream) public
     * final void java.beans.beancontext.BeanContextSupport.readChildren(java.io.ObjectInputStream) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#readChildren(java.io.ObjectInputStream) public
     * final void java.beans.beancontext.BeanContextSupport.readChildren(java.io.ObjectInputStream) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#readChildren(java.io.ObjectInputStream) public final void
     *      java.beans.beancontext.BeanContextSupport.readChildren(java.io.ObjectInputStream) throws
     *      java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readChildren_ObjectInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#add(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.add(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#add(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#add(Object) public boolean
     *      java.beans.beancontext.BeanContextSupport.add(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_add_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#writeChildren(java.io.ObjectOutputStream) public
     * final void java.beans.beancontext.BeanContextSupport.writeChildren(java.io.ObjectOutputStream) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#writeChildren(java.io.ObjectOutputStream) public
     * final void java.beans.beancontext.BeanContextSupport.writeChildren(java.io.ObjectOutputStream) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#writeChildren(java.io.ObjectOutputStream) public final void
     *      java.beans.beancontext.BeanContextSupport.writeChildren(java.io.ObjectOutputStream) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeChildren_ObjectOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public void
     * java.beans.beancontext.BeanContextSupport.addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     * public void
     * java.beans.beancontext.BeanContextSupport.addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     *      public void
     *      java.beans.beancontext.BeanContextSupport.addBeanContextMembershipListener(java.beans.beancontext.
     *      BeanContextMembershipListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addBeanContextMembershipListener_BeanContextMembershipListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#getResourceAsStream(String, java.beans.beancontext.BeanContextChild)
     * public java.io.InputStream
     * java.beans.beancontext.BeanContextSupport.getResourceAsStream(java.lang.String,java.beans.beancontext.BeanContextChild)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextSupport#getResourceAsStream(String, java.beans.beancontext.BeanContextChild)
     * public java.io.InputStream
     * java.beans.beancontext.BeanContextSupport.getResourceAsStream(java.lang.String,java.beans.beancontext.BeanContextChild)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#getResourceAsStream(String,
     *      java.beans.beancontext.BeanContextChild) public java.io.InputStream
     *      java.beans.beancontext.BeanContextSupport.getResourceAsStream(java.lang.String,java.beans.beancontext.
     *      BeanContextChild) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResourceAsStream_String_BeanContextChild()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#containsAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.containsAll(java.util.Collection)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#containsAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.containsAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#containsAll(java.util.Collection) public boolean
     *      java.beans.beancontext.BeanContextSupport.containsAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#containsKey(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.containsKey(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#containsKey(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.containsKey(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#containsKey(Object) public boolean
     *      java.beans.beancontext.BeanContextSupport.containsKey(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsKey_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#clear() public void
     * java.beans.beancontext.BeanContextSupport.clear()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#clear() public void
     * java.beans.beancontext.BeanContextSupport.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#clear() public void
     *      java.beans.beancontext.BeanContextSupport.clear() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isEmpty() public boolean
     * java.beans.beancontext.BeanContextSupport.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#isEmpty() public boolean
     * java.beans.beancontext.BeanContextSupport.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#isEmpty() public boolean
     *      java.beans.beancontext.BeanContextSupport.isEmpty() (the hereby targeted method-under-test)
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
     * Test method for {@link java.beans.beancontext.BeanContextSupport#okToUseGui() public synchronized void
     * java.beans.beancontext.BeanContextSupport.okToUseGui()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#okToUseGui() public synchronized void
     * java.beans.beancontext.BeanContextSupport.okToUseGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#okToUseGui() public synchronized void
     *      java.beans.beancontext.BeanContextSupport.okToUseGui() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_okToUseGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#contains(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#contains(Object) public boolean
     * java.beans.beancontext.BeanContextSupport.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#contains(Object) public boolean
     *      java.beans.beancontext.BeanContextSupport.contains(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_contains_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#addAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.addAll(java.util.Collection)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#addAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.addAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#addAll(java.util.Collection) public boolean
     *      java.beans.beancontext.BeanContextSupport.addAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#size() public int
     * java.beans.beancontext.BeanContextSupport.size()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#size() public int
     * java.beans.beancontext.BeanContextSupport.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#size() public int java.beans.beancontext.BeanContextSupport.size()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#needsGui() public synchronized boolean
     * java.beans.beancontext.BeanContextSupport.needsGui()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#needsGui() public synchronized boolean
     * java.beans.beancontext.BeanContextSupport.needsGui()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#needsGui() public synchronized boolean
     *      java.beans.beancontext.BeanContextSupport.needsGui() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_needsGui()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#instantiateChild(String) public java.lang.Object
     * java.beans.beancontext.BeanContextSupport.instantiateChild(java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#instantiateChild(String) public java.lang.Object
     * java.beans.beancontext.BeanContextSupport.instantiateChild(java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#instantiateChild(String) public java.lang.Object
     *      java.beans.beancontext.BeanContextSupport.instantiateChild(java.lang.String) throws
     *      java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_instantiateChild_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#getLocale() public synchronized java.util.Locale
     * java.beans.beancontext.BeanContextSupport.getLocale()}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#getLocale() public synchronized java.util.Locale
     * java.beans.beancontext.BeanContextSupport.getLocale()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#getLocale() public synchronized java.util.Locale
     *      java.beans.beancontext.BeanContextSupport.getLocale() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#retainAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.retainAll(java.util.Collection)}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#retainAll(java.util.Collection) public boolean
     * java.beans.beancontext.BeanContextSupport.retainAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#retainAll(java.util.Collection) public boolean
     *      java.beans.beancontext.BeanContextSupport.retainAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_retainAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#vetoableChange(java.beans.PropertyChangeEvent)
     * public void java.beans.beancontext.BeanContextSupport.vetoableChange(java.beans.PropertyChangeEvent) throws
     * java.beans.PropertyVetoException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#vetoableChange(java.beans.PropertyChangeEvent)
     * public void java.beans.beancontext.BeanContextSupport.vetoableChange(java.beans.PropertyChangeEvent) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#vetoableChange(java.beans.PropertyChangeEvent) public void
     *      java.beans.beancontext.BeanContextSupport.vetoableChange(java.beans.PropertyChangeEvent) throws
     *      java.beans.PropertyVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_vetoableChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#setLocale(java.util.Locale) public synchronized
     * void java.beans.beancontext.BeanContextSupport.setLocale(java.util.Locale) throws
     * java.beans.PropertyVetoException}.
     *
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextSupport#setLocale(java.util.Locale) public synchronized
     * void java.beans.beancontext.BeanContextSupport.setLocale(java.util.Locale) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.beancontext.BeanContextSupport#setLocale(java.util.Locale) public synchronized void
     *      java.beans.beancontext.BeanContextSupport.setLocale(java.util.Locale) throws
     *      java.beans.PropertyVetoException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLocale_Locale()
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
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChildSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * class java.beans.beancontext.BeanContextChildSupport}</li>
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
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChildSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * class java.beans.beancontext.BeanContextChildSupport}</li>
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
     * <li>{@linkplain java.beans.beancontext.BeanContextChildSupport#setBeanContext(java.beans.beancontext.BeanContext)
     * class java.beans.beancontext.BeanContextChildSupport}</li>
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
     * {@linkplain java.beans.beancontext.BeanContextChildSupport#removeVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * class java.beans.beancontext.BeanContextChildSupport}</li>
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
     * <li>{@linkplain java.util.Collection#hashCode() interface java.util.Collection}</li>
     * <li>{@linkplain Object#hashCode() class java.lang.Object}</li>
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
     * <li>{@linkplain java.util.Collection#equals(Object) interface java.util.Collection}</li>
     * <li>{@linkplain Object#equals(Object) class java.lang.Object}</li>
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
     * <li>{@linkplain java.beans.beancontext.BeanContextChildSupport#getBeanContext() class
     * java.beans.beancontext.BeanContextChildSupport}</li>
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
     * <li>
     * {@linkplain java.beans.beancontext.BeanContextChildSupport#addVetoableChangeListener(String, java.beans.VetoableChangeListener)
     * class java.beans.beancontext.BeanContextChildSupport}</li>
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
