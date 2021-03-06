package org.j8unit.repository.java.awt;

import java.awt.FlowLayout;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlowLayout} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.FlowLayoutClassTests}).
 */
@RunWith(J8Unit4.class)
public class FlowLayoutClassTest
implements FlowLayoutClassTests<FlowLayout> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.FlowLayout]

    @Override
    public Class<FlowLayout> createNewSUT() {
        return FlowLayout.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.FlowLayout#FlowLayout(int) public
     * java.awt.FlowLayout(int)}.
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
    public void create_FlowLayout_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlowLayout sut = null; // = new FlowLayout(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.FlowLayout#FlowLayout(int, int, int)
     * public java.awt.FlowLayout(int,int,int)}.
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
    public void create_FlowLayout_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlowLayout sut = null; // = new FlowLayout(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.FlowLayout#FlowLayout() public
     * java.awt.FlowLayout()}.
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
    public void create_FlowLayout()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FlowLayout sut = new FlowLayout();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.FlowLayout]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.FlowLayout]

}
