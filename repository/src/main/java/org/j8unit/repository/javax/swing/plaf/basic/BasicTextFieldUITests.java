package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicTextFieldUI class javax.swing.plaf.basic.BasicTextFieldUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTextFieldUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicTextFieldUITests<SUT extends javax.swing.plaf.basic.BasicTextFieldUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTextUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextFieldUI#create(javax.swing.text.Element) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextFieldUI.create(javax.swing.text.Element)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_create_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextFieldUI#getBaseline(javax.swing.JComponent,int,int) public
     * int javax.swing.plaf.basic.BasicTextFieldUI.getBaseline(javax.swing.JComponent,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextFieldUI#getBaselineResizeBehavior(javax.swing.JComponent)
     * public java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.basic.BasicTextFieldUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
