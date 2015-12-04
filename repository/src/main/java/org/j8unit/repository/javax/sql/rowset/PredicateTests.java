package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.Predicate interface javax.sql.rowset.Predicate}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.PredicateClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PredicateTests<SUT extends javax.sql.rowset.Predicate>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.Predicate#evaluate(java.lang.Object,int) public abstract boolean
     * javax.sql.rowset.Predicate.evaluate(java.lang.Object,int) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.Predicate#evaluate(java.lang.Object,java.lang.String) public abstract
     * boolean javax.sql.rowset.Predicate.evaluate(java.lang.Object,java.lang.String) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_Object_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.Predicate#evaluate(javax.sql.RowSet) public abstract boolean
     * javax.sql.rowset.Predicate.evaluate(javax.sql.RowSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_evaluate_RowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
