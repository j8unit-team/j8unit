package org.j8unit.repository.java.awt.geom;

import java.awt.Shape;
import java.awt.geom.Area;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AreaClassTest
implements org.j8unit.repository.java.awt.geom.AreaClassTests<Area> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.geom.Area]

    @Override
    public Class<Area> createNewSUT() {
        return Area.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Area#Area() public java.awt.geom.Area()}.
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
    public void create_Area()
    throws Exception {
        // create new instance
        final Area sut = new Area();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Area#Area(Shape) public
     * java.awt.geom.Area(java.awt.Shape)}.
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
    public void create_Area_Shape()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Area sut = null; // = new Area(Shape);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.geom.Area]

}
