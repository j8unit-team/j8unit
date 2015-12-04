package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.PasswordView class javax.swing.text.PasswordView}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.PasswordViewClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PasswordViewTests<SUT extends javax.swing.text.PasswordView>
extends org.j8unit.repository.javax.swing.text.FieldViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.PasswordView#getPreferredSpan(int) public float
     * javax.swing.text.PasswordView.getPreferredSpan(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPreferredSpan_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.PasswordView#modelToView(int,java.awt.Shape,javax.swing.text.Position.Bias) public
     * java.awt.Shape javax.swing.text.PasswordView.modelToView(int,java.awt.Shape,javax.swing.text.Position$Bias)
     * throws javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_modelToView_int_Shape_Bias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.PasswordView#viewToModel(float,float,java.awt.Shape,javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.text.PasswordView.viewToModel(float,float,java.awt.Shape,javax.swing.text.Position$Bias[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_viewToModel_float_float_Shape_BiasArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
