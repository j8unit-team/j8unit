package org.j8unit.repository.java.awt.font;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.font.LayoutPath class java.awt.font.LayoutPath}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.font.LayoutPathTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.font.LayoutPathClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.font.LayoutPath
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayoutPathTests<SUT extends java.awt.font.LayoutPath>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.font.LayoutPath#pathToPoint(java.awt.geom.Point2D, boolean, java.awt.geom.Point2D) public
     * abstract void java.awt.font.LayoutPath.pathToPoint(java.awt.geom.Point2D,boolean,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.font.LayoutPath#pathToPoint(java.awt.geom.Point2D, boolean, java.awt.geom.Point2D)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_pathToPoint_Point2D_boolean_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.font.LayoutPath#pointToPath(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     * abstract boolean java.awt.font.LayoutPath.pointToPath(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.font.LayoutPath#pointToPath(java.awt.geom.Point2D, java.awt.geom.Point2D)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_pointToPath_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
