package org.j8unit.repository.javax.swing.border;

import javax.swing.border.CompoundBorder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompoundBorder} (by simply reusing the
 * J8Unit test interface {@link CompoundBorderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompoundBorderClassTest
implements CompoundBorderClassTests<CompoundBorder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.border.CompoundBorder]

    @Override
    public Class<CompoundBorder> createNewSUT() {
        return CompoundBorder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.border.CompoundBorder#CompoundBorder() public javax.swing.border.CompoundBorder()}.
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
    public void create_CompoundBorder()
    throws Exception {
        // create new instance
        final CompoundBorder sut = new CompoundBorder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.border.CompoundBorder#CompoundBorder(javax.swing.border.Border, javax.swing.border.Border)
     * public javax.swing.border.CompoundBorder(javax.swing.border.Border,javax.swing.border.Border)}.
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
    public void create_CompoundBorder_Border_Border()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompoundBorder sut = null; // = new CompoundBorder(javax.swing.border.Border, javax.swing.border.Border);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.border.CompoundBorder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.border.CompoundBorder]

}
