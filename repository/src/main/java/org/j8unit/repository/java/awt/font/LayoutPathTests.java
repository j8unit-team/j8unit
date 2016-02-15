package org.j8unit.repository.java.awt.font;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.font.LayoutPath class java.awt.font.LayoutPath}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LayoutPathClassTests}.
 * </p>
 *
 * @see java.awt.font.LayoutPath class java.awt.font.LayoutPath (the hereby targeted class-under-test class)
 * @see LayoutPathClassTests LayoutPathClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayoutPathTests<SUT extends java.awt.font.LayoutPath>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.font.LayoutPath#pointToPath(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     * abstract boolean java.awt.font.LayoutPath.pointToPath(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * <p>
     * Test method for {@link java.awt.font.LayoutPath#pointToPath(java.awt.geom.Point2D, java.awt.geom.Point2D) public
     * abstract boolean java.awt.font.LayoutPath.pointToPath(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.font.LayoutPath#pointToPath(java.awt.geom.Point2D, java.awt.geom.Point2D) public abstract boolean
     *      java.awt.font.LayoutPath.pointToPath(java.awt.geom.Point2D,java.awt.geom.Point2D) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link java.awt.font.LayoutPath#pathToPoint(java.awt.geom.Point2D, boolean, java.awt.geom.Point2D) public
     * abstract void java.awt.font.LayoutPath.pathToPoint(java.awt.geom.Point2D,boolean,java.awt.geom.Point2D)}.
     *
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
     * @see java.awt.font.LayoutPath#pathToPoint(java.awt.geom.Point2D, boolean, java.awt.geom.Point2D) public abstract
     *      void java.awt.font.LayoutPath.pathToPoint(java.awt.geom.Point2D,boolean,java.awt.geom.Point2D) (the hereby
     *      targeted method-under-test)
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

}
