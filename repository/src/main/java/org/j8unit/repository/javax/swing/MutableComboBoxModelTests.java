package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.MutableComboBoxModel interface javax.swing.MutableComboBoxModel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.MutableComboBoxModelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MutableComboBoxModelTests<SUT extends javax.swing.MutableComboBoxModel<E>, E>
extends org.j8unit.repository.javax.swing.ComboBoxModelTests<SUT,E>
{

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#insertElementAt(java.lang.Object,int) public abstract void javax.swing.MutableComboBoxModel.insertElementAt(java.lang.Object,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertElementAt_Object_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElement(java.lang.Object) public abstract void javax.swing.MutableComboBoxModel.removeElement(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeElement_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#addElement(java.lang.Object) public abstract void javax.swing.MutableComboBoxModel.addElement(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addElement_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.MutableComboBoxModel#removeElementAt(int) public abstract void javax.swing.MutableComboBoxModel.removeElementAt(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeElementAt_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
