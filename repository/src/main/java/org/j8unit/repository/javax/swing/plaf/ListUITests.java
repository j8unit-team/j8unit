package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.ListUI class javax.swing.plaf.ListUI}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ListUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.ListUI class javax.swing.plaf.ListUI (the hereby targeted class-under-test class)
 * @see ListUIClassTests ListUIClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListUITests<SUT extends javax.swing.plaf.ListUI>
extends ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList, java.awt.Point) public abstract
     * int javax.swing.plaf.ListUI.locationToIndex(javax.swing.JList,java.awt.Point)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList, java.awt.Point) public abstract
     * int javax.swing.plaf.ListUI.locationToIndex(javax.swing.JList,java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList, java.awt.Point) public abstract int
     *      javax.swing.plaf.ListUI.locationToIndex(javax.swing.JList,java.awt.Point) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_locationToIndex_JList_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList, int) public abstract
     * java.awt.Point javax.swing.plaf.ListUI.indexToLocation(javax.swing.JList,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList, int) public abstract
     * java.awt.Point javax.swing.plaf.ListUI.indexToLocation(javax.swing.JList,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList, int) public abstract java.awt.Point
     *      javax.swing.plaf.ListUI.indexToLocation(javax.swing.JList,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_indexToLocation_JList_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList, int, int) public abstract
     * java.awt.Rectangle javax.swing.plaf.ListUI.getCellBounds(javax.swing.JList,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList, int, int) public abstract
     * java.awt.Rectangle javax.swing.plaf.ListUI.getCellBounds(javax.swing.JList,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList, int, int) public abstract java.awt.Rectangle
     *      javax.swing.plaf.ListUI.getCellBounds(javax.swing.JList,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellBounds_JList_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
