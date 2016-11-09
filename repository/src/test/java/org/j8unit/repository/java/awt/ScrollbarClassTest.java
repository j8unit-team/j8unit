package org.j8unit.repository.java.awt;

import java.awt.Scrollbar;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Scrollbar} (by simply reusing the J8Unit
 * test interface {@link ScrollbarClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollbarClassTest
implements ScrollbarClassTests<Scrollbar> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Scrollbar]

    @Override
    public Class<Scrollbar> createNewSUT() {
        return Scrollbar.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Scrollbar#Scrollbar(int, int, int, int, int) public java.awt.Scrollbar(int,int,int,int,int)
     * throws java.awt.HeadlessException}.
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
    public void create_Scrollbar_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Scrollbar sut = null; // = new Scrollbar(int, int, int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Scrollbar#Scrollbar(int) public
     * java.awt.Scrollbar(int) throws java.awt.HeadlessException}.
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
    public void create_Scrollbar_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Scrollbar sut = null; // = new Scrollbar(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Scrollbar#Scrollbar() public
     * java.awt.Scrollbar() throws java.awt.HeadlessException}.
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
    public void create_Scrollbar()
    throws Exception {
        // create new instance
        final Scrollbar sut = new Scrollbar();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Scrollbar]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Scrollbar]

}
