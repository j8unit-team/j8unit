package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalInternalFrameUI class
 * javax.swing.plaf.metal.MetalInternalFrameUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalInternalFrameUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalInternalFrameUI class javax.swing.plaf.metal.MetalInternalFrameUI (the hereby
 *      targeted class-under-test class)
 * @see MetalInternalFrameUIClassTests MetalInternalFrameUIClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalInternalFrameUITests<SUT extends javax.swing.plaf.metal.MetalInternalFrameUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#setPalette(boolean) public void
     * javax.swing.plaf.metal.MetalInternalFrameUI.setPalette(boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#setPalette(boolean) public void
     * javax.swing.plaf.metal.MetalInternalFrameUI.setPalette(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalInternalFrameUI#setPalette(boolean) public void
     *      javax.swing.plaf.metal.MetalInternalFrameUI.setPalette(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPalette_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#uninstallUI(javax.swing.JComponent) public
     * void javax.swing.plaf.metal.MetalInternalFrameUI.uninstallUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#uninstallUI(javax.swing.JComponent) public
     * void javax.swing.plaf.metal.MetalInternalFrameUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalInternalFrameUI#uninstallUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.metal.MetalInternalFrameUI.uninstallUI(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalInternalFrameUI.installUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalInternalFrameUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalInternalFrameUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalInternalFrameUI#installUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.metal.MetalInternalFrameUI.installUI(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
