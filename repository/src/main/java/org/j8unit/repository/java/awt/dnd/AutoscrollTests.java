package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.dnd.Autoscroll interface java.awt.dnd.Autoscroll}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AutoscrollClassTests}.
 * </p>
 *
 * @see java.awt.dnd.Autoscroll interface java.awt.dnd.Autoscroll (the hereby targeted class-under-test class)
 * @see AutoscrollClassTests AutoscrollClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AutoscrollTests<SUT extends java.awt.dnd.Autoscroll>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#autoscroll(java.awt.Point) public abstract void
     * java.awt.dnd.Autoscroll.autoscroll(java.awt.Point)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#autoscroll(java.awt.Point) public abstract void
     * java.awt.dnd.Autoscroll.autoscroll(java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.Autoscroll#autoscroll(java.awt.Point) public abstract void
     *      java.awt.dnd.Autoscroll.autoscroll(java.awt.Point) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_autoscroll_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#getAutoscrollInsets() public abstract java.awt.Insets
     * java.awt.dnd.Autoscroll.getAutoscrollInsets()}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.Autoscroll#getAutoscrollInsets() public abstract java.awt.Insets
     * java.awt.dnd.Autoscroll.getAutoscrollInsets()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.Autoscroll#getAutoscrollInsets() public abstract java.awt.Insets
     *      java.awt.dnd.Autoscroll.getAutoscrollInsets() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoscrollInsets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
