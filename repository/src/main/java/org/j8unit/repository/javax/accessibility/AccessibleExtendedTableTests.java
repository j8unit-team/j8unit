package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleExtendedTable interface
 * javax.accessibility.AccessibleExtendedTable}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleExtendedTableClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessibleExtendedTableTests<SUT extends javax.accessibility.AccessibleExtendedTable>
extends org.j8unit.repository.javax.accessibility.AccessibleTableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedTable#getAccessibleColumn(int) public abstract int
     * javax.accessibility.AccessibleExtendedTable.getAccessibleColumn(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleColumn_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedTable#getAccessibleIndex(int,int) public abstract
     * int javax.accessibility.AccessibleExtendedTable.getAccessibleIndex(int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleIndex_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleExtendedTable#getAccessibleRow(int) public abstract int
     * javax.accessibility.AccessibleExtendedTable.getAccessibleRow(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleRow_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
