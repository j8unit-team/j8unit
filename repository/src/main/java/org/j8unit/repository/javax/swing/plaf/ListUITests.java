package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.ListUI class javax.swing.plaf.ListUI}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.ListUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.ListUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.ListUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListUITests<SUT extends javax.swing.plaf.ListUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList, int, int) public abstract
     * java.awt.Rectangle javax.swing.plaf.ListUI.getCellBounds(javax.swing.JList,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList, int, int)
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

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList, int) public abstract
     * java.awt.Point javax.swing.plaf.ListUI.indexToLocation(javax.swing.JList,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList, int)
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
     * Test method for {@link javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList, java.awt.Point) public abstract
     * int javax.swing.plaf.ListUI.locationToIndex(javax.swing.JList,java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList, java.awt.Point)
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

}
