package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.MutableComboBoxModel interface
 * javax.swing.MutableComboBoxModel}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link MutableComboBoxModelClassTests}.
 * </p>
 *
 * @see javax.swing.MutableComboBoxModel interface javax.swing.MutableComboBoxModel (the hereby targeted
 *      class-under-test class)
 * @see MutableComboBoxModelClassTests MutableComboBoxModelClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MutableComboBoxModelTests<SUT extends javax.swing.MutableComboBoxModel<E>, E>
extends ComboBoxModelTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#insertElementAt(Object, int) public abstract void
     * javax.swing.MutableComboBoxModel.insertElementAt(E,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#insertElementAt(Object, int) public abstract void
     * javax.swing.MutableComboBoxModel.insertElementAt(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.MutableComboBoxModel#insertElementAt(Object, int) public abstract void
     *      javax.swing.MutableComboBoxModel.insertElementAt(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertElementAt_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElement(Object) public abstract void
     * javax.swing.MutableComboBoxModel.removeElement(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElement(Object) public abstract void
     * javax.swing.MutableComboBoxModel.removeElement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.MutableComboBoxModel#removeElement(Object) public abstract void
     *      javax.swing.MutableComboBoxModel.removeElement(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#addElement(Object) public abstract void
     * javax.swing.MutableComboBoxModel.addElement(E)}.
     *
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#addElement(Object) public abstract void
     * javax.swing.MutableComboBoxModel.addElement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.MutableComboBoxModel#addElement(Object) public abstract void
     *      javax.swing.MutableComboBoxModel.addElement(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElementAt(int) public abstract void
     * javax.swing.MutableComboBoxModel.removeElementAt(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElementAt(int) public abstract void
     * javax.swing.MutableComboBoxModel.removeElementAt(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.MutableComboBoxModel#removeElementAt(int) public abstract void
     *      javax.swing.MutableComboBoxModel.removeElementAt(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeElementAt_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
