package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.PropertyEditorSupport class java.beans.PropertyEditorSupport}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link PropertyEditorSupportClassTests}.
 * </p>
 *
 * @see java.beans.PropertyEditorSupport class java.beans.PropertyEditorSupport (the hereby targeted class-under-test
 *      class)
 * @see PropertyEditorSupportClassTests PropertyEditorSupportClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyEditorSupportTests<SUT extends java.beans.PropertyEditorSupport>
extends PropertyEditorTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.PropertyEditorSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public
     * synchronized void
     * java.beans.PropertyEditorSupport.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyEditorSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public
     * synchronized void
     * java.beans.PropertyEditorSupport.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#removePropertyChangeListener(java.beans.PropertyChangeListener) public
     *      synchronized void
     *      java.beans.PropertyEditorSupport.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.beans.PropertyEditorSupport#getAsText() public java.lang.String
     * java.beans.PropertyEditorSupport.getAsText()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getAsText() public java.lang.String
     * java.beans.PropertyEditorSupport.getAsText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getAsText() public java.lang.String
     *      java.beans.PropertyEditorSupport.getAsText() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAsText()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setAsText(String) public void
     * java.beans.PropertyEditorSupport.setAsText(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setAsText(String) public void
     * java.beans.PropertyEditorSupport.setAsText(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#setAsText(String) public void
     *      java.beans.PropertyEditorSupport.setAsText(java.lang.String) throws java.lang.IllegalArgumentException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setAsText_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getTags() public java.lang.String[]
     * java.beans.PropertyEditorSupport.getTags()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getTags() public java.lang.String[]
     * java.beans.PropertyEditorSupport.getTags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getTags() public java.lang.String[]
     *      java.beans.PropertyEditorSupport.getTags() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTags()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#supportsCustomEditor() public boolean
     * java.beans.PropertyEditorSupport.supportsCustomEditor()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#supportsCustomEditor() public boolean
     * java.beans.PropertyEditorSupport.supportsCustomEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#supportsCustomEditor() public boolean
     *      java.beans.PropertyEditorSupport.supportsCustomEditor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_supportsCustomEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#paintValue(java.awt.Graphics, java.awt.Rectangle) public
     * void java.beans.PropertyEditorSupport.paintValue(java.awt.Graphics,java.awt.Rectangle)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#paintValue(java.awt.Graphics, java.awt.Rectangle) public
     * void java.beans.PropertyEditorSupport.paintValue(java.awt.Graphics,java.awt.Rectangle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#paintValue(java.awt.Graphics, java.awt.Rectangle) public void
     *      java.beans.PropertyEditorSupport.paintValue(java.awt.Graphics,java.awt.Rectangle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paintValue_Graphics_Rectangle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setSource(Object) public void
     * java.beans.PropertyEditorSupport.setSource(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setSource(Object) public void
     * java.beans.PropertyEditorSupport.setSource(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#setSource(Object) public void
     *      java.beans.PropertyEditorSupport.setSource(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSource_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#firePropertyChange() public void
     * java.beans.PropertyEditorSupport.firePropertyChange()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#firePropertyChange() public void
     * java.beans.PropertyEditorSupport.firePropertyChange()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#firePropertyChange() public void
     *      java.beans.PropertyEditorSupport.firePropertyChange() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_firePropertyChange()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.PropertyEditorSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     * synchronized void java.beans.PropertyEditorSupport.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for
     * {@link java.beans.PropertyEditorSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     * synchronized void java.beans.PropertyEditorSupport.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#addPropertyChangeListener(java.beans.PropertyChangeListener) public
     *      synchronized void
     *      java.beans.PropertyEditorSupport.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.beans.PropertyEditorSupport#isPaintable() public boolean
     * java.beans.PropertyEditorSupport.isPaintable()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#isPaintable() public boolean
     * java.beans.PropertyEditorSupport.isPaintable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#isPaintable() public boolean java.beans.PropertyEditorSupport.isPaintable()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isPaintable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getSource() public java.lang.Object
     * java.beans.PropertyEditorSupport.getSource()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getSource() public java.lang.Object
     * java.beans.PropertyEditorSupport.getSource()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getSource() public java.lang.Object
     *      java.beans.PropertyEditorSupport.getSource() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setValue(Object) public void
     * java.beans.PropertyEditorSupport.setValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#setValue(Object) public void
     * java.beans.PropertyEditorSupport.setValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#setValue(Object) public void
     *      java.beans.PropertyEditorSupport.setValue(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getJavaInitializationString() public java.lang.String
     * java.beans.PropertyEditorSupport.getJavaInitializationString()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getJavaInitializationString() public java.lang.String
     * java.beans.PropertyEditorSupport.getJavaInitializationString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getJavaInitializationString() public java.lang.String
     *      java.beans.PropertyEditorSupport.getJavaInitializationString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getJavaInitializationString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getValue() public java.lang.Object
     * java.beans.PropertyEditorSupport.getValue()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getValue() public java.lang.Object
     * java.beans.PropertyEditorSupport.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getValue() public java.lang.Object
     *      java.beans.PropertyEditorSupport.getValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getCustomEditor() public java.awt.Component
     * java.beans.PropertyEditorSupport.getCustomEditor()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditorSupport#getCustomEditor() public java.awt.Component
     * java.beans.PropertyEditorSupport.getCustomEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditorSupport#getCustomEditor() public java.awt.Component
     *      java.beans.PropertyEditorSupport.getCustomEditor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCustomEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
