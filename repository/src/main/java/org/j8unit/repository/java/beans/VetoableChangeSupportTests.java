package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.VetoableChangeSupport class
 * java.beans.VetoableChangeSupport}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.VetoableChangeSupportTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.VetoableChangeSupportClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.VetoableChangeSupport
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VetoableChangeSupportTests<SUT extends java.beans.VetoableChangeSupport>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.VetoableChangeSupport#addVetoableChangeListener(java.lang.String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.VetoableChangeSupport.addVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#addVetoableChangeListener(java.lang.String,
     *             java.beans.VetoableChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_String_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.VetoableChangeSupport#addVetoableChangeListener(java.beans.VetoableChangeListener) public void
     * java.beans.VetoableChangeSupport.addVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#addVetoableChangeListener(java.beans.VetoableChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addVetoableChangeListener_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeSupport#fireVetoableChange(java.beans.PropertyChangeEvent) public
     * void java.beans.VetoableChangeSupport.fireVetoableChange(java.beans.PropertyChangeEvent) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#fireVetoableChange(java.beans.PropertyChangeEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireVetoableChange_PropertyChangeEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, boolean, boolean)
     * public void java.beans.VetoableChangeSupport.fireVetoableChange(java.lang.String,boolean,boolean) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, boolean, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireVetoableChange_String_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, int, int) public
     * void java.beans.VetoableChangeSupport.fireVetoableChange(java.lang.String,int,int) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fireVetoableChange_String_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, java.lang.Object, java.lang.Object)
     * public void
     * java.beans.VetoableChangeSupport.fireVetoableChange(java.lang.String,java.lang.Object,java.lang.Object) throws
     * java.beans.PropertyVetoException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#fireVetoableChange(java.lang.String, java.lang.Object,
     *             java.lang.Object)
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
     * Test method for {@link java.beans.VetoableChangeSupport#getVetoableChangeListeners() public
     * java.beans.VetoableChangeListener[] java.beans.VetoableChangeSupport.getVetoableChangeListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#getVetoableChangeListeners()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVetoableChangeListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeSupport#getVetoableChangeListeners(java.lang.String) public
     * java.beans.VetoableChangeListener[]
     * java.beans.VetoableChangeSupport.getVetoableChangeListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#getVetoableChangeListeners(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVetoableChangeListeners_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.VetoableChangeSupport#hasListeners(java.lang.String) public boolean
     * java.beans.VetoableChangeSupport.hasListeners(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#hasListeners(java.lang.String)
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
     * {@link java.beans.VetoableChangeSupport#removeVetoableChangeListener(java.lang.String, java.beans.VetoableChangeListener)
     * public void
     * java.beans.VetoableChangeSupport.removeVetoableChangeListener(java.lang.String,java.beans.VetoableChangeListener)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#removeVetoableChangeListener(java.lang.String,
     *             java.beans.VetoableChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link java.beans.VetoableChangeSupport#removeVetoableChangeListener(java.beans.VetoableChangeListener) public
     * void java.beans.VetoableChangeSupport.removeVetoableChangeListener(java.beans.VetoableChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.VetoableChangeSupport#removeVetoableChangeListener(java.beans.VetoableChangeListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeVetoableChangeListener_VetoableChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
