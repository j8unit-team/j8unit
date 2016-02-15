package org.j8unit.repository.java.beans;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.PropertyEditor interface java.beans.PropertyEditor}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PropertyEditorClassTests}.
 * </p>
 *
 * @see java.beans.PropertyEditor interface java.beans.PropertyEditor (the hereby targeted class-under-test class)
 * @see PropertyEditorClassTests PropertyEditorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyEditorTests<SUT extends java.beans.PropertyEditor>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getCustomEditor() public abstract java.awt.Component
     * java.beans.PropertyEditor.getCustomEditor()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getCustomEditor() public abstract java.awt.Component
     * java.beans.PropertyEditor.getCustomEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#getCustomEditor() public abstract java.awt.Component
     *      java.beans.PropertyEditor.getCustomEditor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCustomEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getJavaInitializationString() public abstract java.lang.String
     * java.beans.PropertyEditor.getJavaInitializationString()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getJavaInitializationString() public abstract java.lang.String
     * java.beans.PropertyEditor.getJavaInitializationString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#getJavaInitializationString() public abstract java.lang.String
     *      java.beans.PropertyEditor.getJavaInitializationString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#getValue() public abstract java.lang.Object
     * java.beans.PropertyEditor.getValue()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getValue() public abstract java.lang.Object
     * java.beans.PropertyEditor.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#getValue() public abstract java.lang.Object java.beans.PropertyEditor.getValue()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#supportsCustomEditor() public abstract boolean
     * java.beans.PropertyEditor.supportsCustomEditor()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#supportsCustomEditor() public abstract boolean
     * java.beans.PropertyEditor.supportsCustomEditor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#supportsCustomEditor() public abstract boolean
     *      java.beans.PropertyEditor.supportsCustomEditor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#setValue(Object) public abstract void
     * java.beans.PropertyEditor.setValue(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#setValue(Object) public abstract void
     * java.beans.PropertyEditor.setValue(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#setValue(Object) public abstract void
     *      java.beans.PropertyEditor.setValue(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#paintValue(java.awt.Graphics, java.awt.Rectangle) public
     * abstract void java.beans.PropertyEditor.paintValue(java.awt.Graphics,java.awt.Rectangle)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#paintValue(java.awt.Graphics, java.awt.Rectangle) public
     * abstract void java.beans.PropertyEditor.paintValue(java.awt.Graphics,java.awt.Rectangle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#paintValue(java.awt.Graphics, java.awt.Rectangle) public abstract void
     *      java.beans.PropertyEditor.paintValue(java.awt.Graphics,java.awt.Rectangle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#getTags() public abstract java.lang.String[]
     * java.beans.PropertyEditor.getTags()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getTags() public abstract java.lang.String[]
     * java.beans.PropertyEditor.getTags()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#getTags() public abstract java.lang.String[] java.beans.PropertyEditor.getTags()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#setAsText(String) public abstract void
     * java.beans.PropertyEditor.setAsText(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#setAsText(String) public abstract void
     * java.beans.PropertyEditor.setAsText(java.lang.String) throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#setAsText(String) public abstract void
     *      java.beans.PropertyEditor.setAsText(java.lang.String) throws java.lang.IllegalArgumentException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.PropertyEditor.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#addPropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.PropertyEditor.addPropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#addPropertyChangeListener(java.beans.PropertyChangeListener) public abstract void
     *      java.beans.PropertyEditor.addPropertyChangeListener(java.beans.PropertyChangeListener) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.beans.PropertyEditor#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.PropertyEditor.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#removePropertyChangeListener(java.beans.PropertyChangeListener)
     * public abstract void java.beans.PropertyEditor.removePropertyChangeListener(java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#removePropertyChangeListener(java.beans.PropertyChangeListener) public abstract
     *      void java.beans.PropertyEditor.removePropertyChangeListener(java.beans.PropertyChangeListener) (the hereby
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
     * Test method for {@link java.beans.PropertyEditor#getAsText() public abstract java.lang.String
     * java.beans.PropertyEditor.getAsText()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#getAsText() public abstract java.lang.String
     * java.beans.PropertyEditor.getAsText()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#getAsText() public abstract java.lang.String java.beans.PropertyEditor.getAsText()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.beans.PropertyEditor#isPaintable() public abstract boolean
     * java.beans.PropertyEditor.isPaintable()}.
     *
     * <p>
     * Test method for {@link java.beans.PropertyEditor#isPaintable() public abstract boolean
     * java.beans.PropertyEditor.isPaintable()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.beans.PropertyEditor#isPaintable() public abstract boolean java.beans.PropertyEditor.isPaintable() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPaintable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
