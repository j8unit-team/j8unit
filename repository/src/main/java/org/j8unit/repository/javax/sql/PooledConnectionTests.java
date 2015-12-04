package org.j8unit.repository.javax.sql;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.PooledConnection interface javax.sql.PooledConnection}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.PooledConnectionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PooledConnectionTests<SUT extends javax.sql.PooledConnection>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#close() public abstract void javax.sql.PooledConnection.close()
     * throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#addConnectionEventListener(javax.sql.ConnectionEventListener)
     * public abstract void javax.sql.PooledConnection.addConnectionEventListener(javax.sql.ConnectionEventListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addConnectionEventListener_ConnectionEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#addStatementEventListener(javax.sql.StatementEventListener)
     * public abstract void javax.sql.PooledConnection.addStatementEventListener(javax.sql.StatementEventListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addStatementEventListener_StatementEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sql.PooledConnection#removeConnectionEventListener(javax.sql.ConnectionEventListener) public
     * abstract void javax.sql.PooledConnection.removeConnectionEventListener(javax.sql.ConnectionEventListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeConnectionEventListener_ConnectionEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#getConnection() public abstract java.sql.Connection
     * javax.sql.PooledConnection.getConnection() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#removeStatementEventListener(javax.sql.StatementEventListener)
     * public abstract void javax.sql.PooledConnection.removeStatementEventListener(javax.sql.StatementEventListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeStatementEventListener_StatementEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
