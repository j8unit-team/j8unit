package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.Predicate interface javax.sql.rowset.Predicate},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.PredicateTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.PredicateClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.Predicate
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PredicateTests<SUT extends javax.sql.rowset.Predicate>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.Predicate#evaluate(java.lang.Object, int) public abstract boolean
     * javax.sql.rowset.Predicate.evaluate(java.lang.Object,int) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.Predicate#evaluate(java.lang.Object, int)
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
     * Test method for {@link javax.sql.rowset.Predicate#evaluate(java.lang.Object, java.lang.String) public abstract
     * boolean javax.sql.rowset.Predicate.evaluate(java.lang.Object,java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.Predicate#evaluate(java.lang.Object, java.lang.String)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.Predicate#evaluate(javax.sql.RowSet)
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
