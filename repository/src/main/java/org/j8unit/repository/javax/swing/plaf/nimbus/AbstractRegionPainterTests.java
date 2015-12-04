package org.j8unit.repository.javax.swing.plaf.nimbus;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.nimbus.AbstractRegionPainter class
 * javax.swing.plaf.nimbus.AbstractRegionPainter}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.nimbus.AbstractRegionPainterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AbstractRegionPainterTests<SUT extends javax.swing.plaf.nimbus.AbstractRegionPainter>
extends org.j8unit.repository.javax.swing.PainterTests<SUT, javax.swing.JComponent>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.nimbus.AbstractRegionPainter#paint(java.awt.Graphics2D,javax.swing.JComponent,int,int)
     * public final void
     * javax.swing.plaf.nimbus.AbstractRegionPainter.paint(java.awt.Graphics2D,javax.swing.JComponent,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics2D_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
