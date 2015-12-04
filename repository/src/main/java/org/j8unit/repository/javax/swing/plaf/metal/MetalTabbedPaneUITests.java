package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalTabbedPaneUI class javax.swing.plaf.metal.MetalTabbedPaneUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalTabbedPaneUITests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#update(java.awt.Graphics,javax.swing.JComponent) public void javax.swing.plaf.metal.MetalTabbedPaneUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_update_Graphics_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#paint(java.awt.Graphics,javax.swing.JComponent) public void javax.swing.plaf.metal.MetalTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics_JComponent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout class javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutTests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests<SUT>
    {

    }

}
