package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalScrollBarUI class javax.swing.plaf.metal.MetalScrollBarUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalScrollBarUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetalScrollBarUITests<SUT extends javax.swing.plaf.metal.MetalScrollBarUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollBarUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.metal.MetalScrollBarUI.getPreferredSize(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
