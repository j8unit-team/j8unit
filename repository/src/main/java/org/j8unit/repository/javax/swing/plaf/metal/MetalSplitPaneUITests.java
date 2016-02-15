package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalSplitPaneUI class
 * javax.swing.plaf.metal.MetalSplitPaneUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalSplitPaneUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalSplitPaneUI class javax.swing.plaf.metal.MetalSplitPaneUI (the hereby targeted
 *      class-under-test class)
 * @see MetalSplitPaneUIClassTests MetalSplitPaneUIClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalSplitPaneUITests<SUT extends javax.swing.plaf.metal.MetalSplitPaneUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalSplitPaneUI#createDefaultDivider() public
     * javax.swing.plaf.basic.BasicSplitPaneDivider javax.swing.plaf.metal.MetalSplitPaneUI.createDefaultDivider()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalSplitPaneUI#createDefaultDivider() public
     * javax.swing.plaf.basic.BasicSplitPaneDivider javax.swing.plaf.metal.MetalSplitPaneUI.createDefaultDivider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalSplitPaneUI#createDefaultDivider() public
     *      javax.swing.plaf.basic.BasicSplitPaneDivider javax.swing.plaf.metal.MetalSplitPaneUI.createDefaultDivider()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createDefaultDivider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
