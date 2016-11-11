package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicArrowButton;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicArrowButton} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicArrowButtonClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicArrowButtonClassTest
implements BasicArrowButtonClassTests<BasicArrowButton> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.basic.BasicArrowButton]

    @Override
    public Class<BasicArrowButton> createNewSUT() {
        return BasicArrowButton.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicArrowButton#BasicArrowButton(int) public
     * javax.swing.plaf.basic.BasicArrowButton(int)}.
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
    public void create_BasicArrowButton_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicArrowButton sut = null; // = new BasicArrowButton(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.basic.BasicArrowButton#BasicArrowButton(int, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color)
     * public javax.swing.plaf.basic.BasicArrowButton(int,java.awt.Color,java.awt.Color,java.awt.Color,java.awt.Color)}.
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
    public void create_BasicArrowButton_int_Color_Color_Color_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BasicArrowButton sut = null; // = new BasicArrowButton(int, java.awt.Color, java.awt.Color,
                                           // java.awt.Color, java.awt.Color);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.basic.BasicArrowButton]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.basic.BasicArrowButton]

}
