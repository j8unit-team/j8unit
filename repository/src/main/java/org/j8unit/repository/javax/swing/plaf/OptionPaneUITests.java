package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.OptionPaneUI class javax.swing.plaf.OptionPaneUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.OptionPaneUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface OptionPaneUITests<SUT extends javax.swing.plaf.OptionPaneUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.OptionPaneUI#containsCustomComponents(javax.swing.JOptionPane) public abstract boolean javax.swing.plaf.OptionPaneUI.containsCustomComponents(javax.swing.JOptionPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsCustomComponents_JOptionPane() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.OptionPaneUI#selectInitialValue(javax.swing.JOptionPane) public abstract void javax.swing.plaf.OptionPaneUI.selectInitialValue(javax.swing.JOptionPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_selectInitialValue_JOptionPane() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
