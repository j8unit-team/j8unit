package org.j8unit.repository.java.awt;

import java.awt.BorderLayout;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BorderLayout} (by simply reusing the
 * J8Unit test interface {@link BorderLayoutClassTests}).
 */

@RunWith(J8Unit4.class)
public class BorderLayoutClassTest
implements BorderLayoutClassTests<BorderLayout> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.BorderLayout]

    @Override
    public Class<BorderLayout> createNewSUT() {
        return BorderLayout.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.BorderLayout#BorderLayout() public
     * java.awt.BorderLayout()}.
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
    public void create_BorderLayout()
    throws Exception {
        // create new instance
        final BorderLayout sut = new BorderLayout();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.BorderLayout#BorderLayout(int, int)
     * public java.awt.BorderLayout(int,int)}.
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
    public void create_BorderLayout_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BorderLayout sut = null; // = new BorderLayout(int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.BorderLayout]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.BorderLayout]

}
