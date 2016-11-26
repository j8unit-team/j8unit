package org.j8unit.repository.javax.swing.border;

import javax.swing.border.StrokeBorder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StrokeBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.StrokeBorderClassTests}).
 */
@RunWith(J8Unit4.class)
public class StrokeBorderClassTest
implements StrokeBorderClassTests<StrokeBorder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.border.StrokeBorder]

    @Override
    public Class<StrokeBorder> createNewSUT() {
        return StrokeBorder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.border.StrokeBorder#StrokeBorder(java.awt.BasicStroke, java.awt.Paint) public
     * javax.swing.border.StrokeBorder(java.awt.BasicStroke,java.awt.Paint)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_StrokeBorder_BasicStroke_Paint()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StrokeBorder sut = null; // = new StrokeBorder(java.awt.BasicStroke, java.awt.Paint);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.border.StrokeBorder#StrokeBorder(java.awt.BasicStroke) public
     * javax.swing.border.StrokeBorder(java.awt.BasicStroke)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_StrokeBorder_BasicStroke()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StrokeBorder sut = null; // = new StrokeBorder(java.awt.BasicStroke);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.border.StrokeBorder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.border.StrokeBorder]

}
