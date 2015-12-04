package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalScrollPaneUI class javax.swing.plaf.metal.MetalScrollPaneUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalScrollPaneUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalScrollPaneUITests<SUT extends javax.swing.plaf.metal.MetalScrollPaneUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollPaneUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalScrollPaneUI.uninstallUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollPaneUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalScrollPaneUI.installUI(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollPaneUI#installListeners(javax.swing.JScrollPane) public
     * void javax.swing.plaf.metal.MetalScrollPaneUI.installListeners(javax.swing.JScrollPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installListeners_JScrollPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollPaneUI#uninstallListeners(javax.swing.JScrollPane)
     * public void javax.swing.plaf.metal.MetalScrollPaneUI.uninstallListeners(javax.swing.JScrollPane)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_uninstallListeners_JScrollPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
