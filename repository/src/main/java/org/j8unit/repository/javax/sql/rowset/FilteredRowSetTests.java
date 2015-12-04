package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.FilteredRowSet interface javax.sql.rowset.FilteredRowSet},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.FilteredRowSetClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FilteredRowSetTests<SUT extends javax.sql.rowset.FilteredRowSet>
extends org.j8unit.repository.javax.sql.rowset.WebRowSetTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#getFilter() public abstract javax.sql.rowset.Predicate javax.sql.rowset.FilteredRowSet.getFilter()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFilter() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#setFilter(javax.sql.rowset.Predicate) public abstract void javax.sql.rowset.FilteredRowSet.setFilter(javax.sql.rowset.Predicate) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFilter_Predicate() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
