package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.ListUI class javax.swing.plaf.ListUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.ListUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ListUITests<SUT extends javax.swing.plaf.ListUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#locationToIndex(javax.swing.JList,java.awt.Point) public abstract int javax.swing.plaf.ListUI.locationToIndex(javax.swing.JList,java.awt.Point)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_locationToIndex_JList_Point() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#indexToLocation(javax.swing.JList,int) public abstract java.awt.Point javax.swing.plaf.ListUI.indexToLocation(javax.swing.JList,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_indexToLocation_JList_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ListUI#getCellBounds(javax.swing.JList,int,int) public abstract java.awt.Rectangle javax.swing.plaf.ListUI.getCellBounds(javax.swing.JList,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellBounds_JList_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
