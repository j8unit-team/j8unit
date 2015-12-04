package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.StatementEvent class javax.sql.StatementEvent}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.StatementEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StatementEventTests<SUT extends javax.sql.StatementEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.StatementEvent#getStatement() public java.sql.PreparedStatement
     * javax.sql.StatementEvent.getStatement()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.StatementEvent#getSQLException() public java.sql.SQLException
     * javax.sql.StatementEvent.getSQLException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSQLException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
