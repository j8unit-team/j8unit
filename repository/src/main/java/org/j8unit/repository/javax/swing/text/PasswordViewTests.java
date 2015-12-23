package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.PasswordView class javax.swing.text.PasswordView},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.PasswordViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.PasswordViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.PasswordView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PasswordViewTests<SUT extends javax.swing.text.PasswordView>
extends org.j8unit.repository.javax.swing.text.FieldViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.PasswordView#getPreferredSpan(int) public float
     * javax.swing.text.PasswordView.getPreferredSpan(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.PasswordView#getPreferredSpan(int)
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
     * {@link javax.swing.text.PasswordView#modelToView(int, java.awt.Shape, javax.swing.text.Position.Bias) public
     * java.awt.Shape javax.swing.text.PasswordView.modelToView(int,java.awt.Shape,javax.swing.text.Position$Bias)
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.PasswordView#modelToView(int, java.awt.Shape, javax.swing.text.Position.Bias)
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
     * {@link javax.swing.text.PasswordView#viewToModel(float, float, java.awt.Shape, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.text.PasswordView.viewToModel(float,float,java.awt.Shape,javax.swing.text.Position$Bias[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.PasswordView#viewToModel(float, float, java.awt.Shape,
     *             javax.swing.text.Position.Bias[])
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
