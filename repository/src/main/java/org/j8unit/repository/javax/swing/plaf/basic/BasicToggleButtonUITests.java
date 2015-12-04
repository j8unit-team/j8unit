package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicToggleButtonUI class javax.swing.plaf.basic.BasicToggleButtonUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicToggleButtonUIClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicToggleButtonUITests<SUT extends javax.swing.plaf.basic.BasicToggleButtonUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicButtonUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicToggleButtonUI#paint(java.awt.Graphics,javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicToggleButtonUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
