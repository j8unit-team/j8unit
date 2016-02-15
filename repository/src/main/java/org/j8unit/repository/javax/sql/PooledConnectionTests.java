package org.j8unit.repository.javax.sql;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.PooledConnection interface javax.sql.PooledConnection}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PooledConnectionClassTests}.
 * </p>
 *
 * @see javax.sql.PooledConnection interface javax.sql.PooledConnection (the hereby targeted class-under-test class)
 * @see PooledConnectionClassTests PooledConnectionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PooledConnectionTests<SUT extends javax.sql.PooledConnection>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.PooledConnection#close() public abstract void javax.sql.PooledConnection.close()
     * throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.PooledConnection#close() public abstract void javax.sql.PooledConnection.close()
     * throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#close() public abstract void javax.sql.PooledConnection.close() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sql.PooledConnection#addConnectionEventListener(javax.sql.ConnectionEventListener)
     * public abstract void javax.sql.PooledConnection.addConnectionEventListener(javax.sql.ConnectionEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#addConnectionEventListener(javax.sql.ConnectionEventListener) public abstract
     *      void javax.sql.PooledConnection.addConnectionEventListener(javax.sql.ConnectionEventListener) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sql.PooledConnection#addStatementEventListener(javax.sql.StatementEventListener)
     * public abstract void javax.sql.PooledConnection.addStatementEventListener(javax.sql.StatementEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#addStatementEventListener(javax.sql.StatementEventListener) public abstract void
     *      javax.sql.PooledConnection.addStatementEventListener(javax.sql.StatementEventListener) (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for
     * {@link javax.sql.PooledConnection#removeConnectionEventListener(javax.sql.ConnectionEventListener) public
     * abstract void javax.sql.PooledConnection.removeConnectionEventListener(javax.sql.ConnectionEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#removeConnectionEventListener(javax.sql.ConnectionEventListener) public abstract
     *      void javax.sql.PooledConnection.removeConnectionEventListener(javax.sql.ConnectionEventListener) (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sql.PooledConnection#getConnection() public abstract java.sql.Connection
     * javax.sql.PooledConnection.getConnection() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#getConnection() public abstract java.sql.Connection
     *      javax.sql.PooledConnection.getConnection() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sql.PooledConnection#removeStatementEventListener(javax.sql.StatementEventListener)
     * public abstract void javax.sql.PooledConnection.removeStatementEventListener(javax.sql.StatementEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.PooledConnection#removeStatementEventListener(javax.sql.StatementEventListener) public abstract
     *      void javax.sql.PooledConnection.removeStatementEventListener(javax.sql.StatementEventListener) (the hereby
     *      targeted method-under-test)
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
