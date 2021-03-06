package org.j8unit.repository.javax.swing.border;

import static org.junit.Assert.fail;
import javax.swing.border.AbstractBorder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractBorder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.border.AbstractBorderClassTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractBorderClassTest
implements AbstractBorderClassTests<AbstractBorder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.border.AbstractBorder]

    @Override
    public Class<AbstractBorder> createNewSUT() {
        return AbstractBorder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.border.AbstractBorder#AbstractBorder() public javax.swing.border.AbstractBorder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_AbstractBorder()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.border.AbstractBorder#getInteriorRectangle(java.awt.Component, javax.swing.border.Border, int, int, int, int)
     * public static java.awt.Rectangle
     * javax.swing.border.AbstractBorder.getInteriorRectangle(java.awt.Component,javax.swing.border.Border,int,int,int,int)}.
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
    public void test_getInteriorRectangle_Component_Border_int_int_int_int()
    throws Exception {
        // write some test for {@link javax.swing.border.AbstractBorder#getInteriorRectangle(java.awt.Component,
        // javax.swing.border.Border, int, int, int, int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.border.AbstractBorder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.border.AbstractBorder]

}
