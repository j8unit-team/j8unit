package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.FormView class javax.swing.text.html.FormView}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.FormViewClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormViewTests<SUT extends javax.swing.text.html.FormView>
extends org.j8unit.repository.java.awt.event.ActionListenerTests<SUT>, org.j8unit.repository.javax.swing.text.ComponentViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormView#actionPerformed(java.awt.event.ActionEvent) public void
     * javax.swing.text.html.FormView.actionPerformed(java.awt.event.ActionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_actionPerformed_ActionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormView#getMaximumSpan(int) public float
     * javax.swing.text.html.FormView.getMaximumSpan(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMaximumSpan_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
