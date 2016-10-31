package org.j8unit.repository.java.awt;

import java.awt.Point;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PointClassTest
implements org.j8unit.repository.java.awt.PointClassTests<Point> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Point]

    @Override
    public Class<Point> createNewSUT() {
        return Point.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Point#Point(java.awt.Point) public
     * java.awt.Point(java.awt.Point)}.
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
    public void create_Point_Point()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Point sut = null; // = new Point(java.awt.Point);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Point#Point(int, int) public
     * java.awt.Point(int,int)}.
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
    public void create_Point_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Point sut = null; // = new Point(int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Point#Point() public
     * java.awt.Point()}.
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
    public void create_Point()
    throws Exception {
        // create new instance
        final Point sut = new Point();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Point]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Point]

}
