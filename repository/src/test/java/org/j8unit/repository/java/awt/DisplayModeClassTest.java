package org.j8unit.repository.java.awt;

import java.awt.DisplayMode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DisplayModeClassTest
implements org.j8unit.repository.java.awt.DisplayModeClassTests<DisplayMode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.DisplayMode]

    @Override
    public Class<DisplayMode> createNewSUT() {
        return DisplayMode.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.DisplayMode#DisplayMode(int, int, int, int) public java.awt.DisplayMode(int,int,int,int)}.
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
    public void create_DisplayMode_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DisplayMode sut = null; // = new DisplayMode(int, int, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.DisplayMode]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.DisplayMode]

}
