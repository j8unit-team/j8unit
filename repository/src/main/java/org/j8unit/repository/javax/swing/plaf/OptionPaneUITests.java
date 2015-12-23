package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.OptionPaneUI class javax.swing.plaf.OptionPaneUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.OptionPaneUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.OptionPaneUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.OptionPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OptionPaneUITests<SUT extends javax.swing.plaf.OptionPaneUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.OptionPaneUI#containsCustomComponents(javax.swing.JOptionPane) public
     * abstract boolean javax.swing.plaf.OptionPaneUI.containsCustomComponents(javax.swing.JOptionPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.OptionPaneUI#containsCustomComponents(javax.swing.JOptionPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsCustomComponents_JOptionPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.OptionPaneUI#selectInitialValue(javax.swing.JOptionPane) public abstract
     * void javax.swing.plaf.OptionPaneUI.selectInitialValue(javax.swing.JOptionPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.OptionPaneUI#selectInitialValue(javax.swing.JOptionPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_selectInitialValue_JOptionPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
