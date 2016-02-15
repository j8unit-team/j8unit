package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.PropertyChangeSupport class java.beans.PropertyChangeSupport}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link PropertyChangeSupportClassTests}.
 * </p>
 *
 * @see java.beans.PropertyChangeSupport class java.beans.PropertyChangeSupport (the hereby targeted class-under-test
 *      class)
 * @see PropertyChangeSupportClassTests PropertyChangeSupportClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyChangeSupportTests<SUT extends java.beans.PropertyChangeSupport>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#hasListeners(String) public boolean
     * java.beans.PropertyChangeSupport.hasListeners(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#hasListeners(String) public boolean
     * java.beans.PropertyChangeSupport.hasListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#hasListeners(String) public boolean
     *      java.beans.PropertyChangeSupport.hasListeners(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasListeners_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.PropertyChangeSupport.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.PropertyChangeSupport.addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(String, java.beans.PropertyChangeListener) public
     *      void java.beans.PropertyChangeSupport.addPropertyChangeListener(java.lang.String,java.beans.
     *      PropertyChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * {@link java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public void
     * java.beans.PropertyChangeSupport.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public void
     * java.beans.PropertyChangeSupport.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      java.beans.PropertyChangeSupport.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public
     * void java.beans.PropertyChangeSupport.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public
     * void java.beans.PropertyChangeSupport.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public void
     *      java.beans.PropertyChangeSupport.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePropertyChangeListener_PropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.PropertyChangeSupport.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyChangeSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     * public void
     * java.beans.PropertyChangeSupport.removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(String, java.beans.PropertyChangeListener)
     *      public void java.beans.PropertyChangeSupport.removePropertyChangeListener(java.lang.String,java.beans.
     *      PropertyChangeListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyChangeSupport#getPropertyChangeListeners(String) public
     * java.beans.PropertyChangeListener[]
     * java.beans.PropertyChangeSupport.getPropertyChangeListeners(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#getPropertyChangeListeners(String) public
     * java.beans.PropertyChangeListener[]
     * java.beans.PropertyChangeSupport.getPropertyChangeListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(String) public
     *      java.beans.PropertyChangeListener[]
     *      java.beans.PropertyChangeSupport.getPropertyChangeListeners(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeListeners_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#getPropertyChangeListeners() public
     * java.beans.PropertyChangeListener[] java.beans.PropertyChangeSupport.getPropertyChangeListeners()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#getPropertyChangeListeners() public
     * java.beans.PropertyChangeListener[] java.beans.PropertyChangeSupport.getPropertyChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners() public java.beans.PropertyChangeListener[]
     *      java.beans.PropertyChangeSupport.getPropertyChangeListeners() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, boolean, boolean) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,boolean,boolean)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, boolean, boolean) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#firePropertyChange(String, boolean, boolean) public void
     *      java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,boolean,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_String_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public
     * void java.beans.PropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public
     * void java.beans.PropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#firePropertyChange(java.beans.PropertyChangeEvent) public void
     *      java.beans.PropertyChangeSupport.firePropertyChange(java.beans.PropertyChangeEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, int, int) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,int,int)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, int, int) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#firePropertyChange(String, int, int) public void
     *      java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange_String_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, Object, Object) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#firePropertyChange(String, Object, Object) public void
     * java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#firePropertyChange(String, Object, Object) public void
     *      java.beans.PropertyChangeSupport.firePropertyChange(java.lang.String,java.lang.Object,java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, Object, Object)
     * public void
     * java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,java.lang.Object,java.lang.Object)}
     * .
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, Object, Object)
     * public void
     * java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, Object, Object) public void
     *      java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,java.lang.Object,java.lang.
     *      Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireIndexedPropertyChange_String_int_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, int, int) public
     * void java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, int, int) public
     * void java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, int, int) public void
     *      java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,int,int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireIndexedPropertyChange_String_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, boolean, boolean)
     * public void java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,boolean,boolean)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, boolean, boolean)
     * public void java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyChangeSupport#fireIndexedPropertyChange(String, int, boolean, boolean) public void
     *      java.beans.PropertyChangeSupport.fireIndexedPropertyChange(java.lang.String,int,boolean,boolean) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireIndexedPropertyChange_String_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
