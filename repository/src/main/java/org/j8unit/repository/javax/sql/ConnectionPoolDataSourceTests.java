package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.ConnectionPoolDataSource interface
 * javax.sql.ConnectionPoolDataSource}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ConnectionPoolDataSourceClassTests}.
 * </p>
 *
 * @see javax.sql.ConnectionPoolDataSource interface javax.sql.ConnectionPoolDataSource (the hereby targeted
 *      class-under-test class)
 * @see ConnectionPoolDataSourceClassTests ConnectionPoolDataSourceClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectionPoolDataSourceTests<SUT extends javax.sql.ConnectionPoolDataSource>
extends CommonDataSourceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection() public abstract
     * javax.sql.PooledConnection javax.sql.ConnectionPoolDataSource.getPooledConnection() throws java.sql.SQLException}
     * .
     *
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection() public abstract
     * javax.sql.PooledConnection javax.sql.ConnectionPoolDataSource.getPooledConnection() throws java.sql.SQLException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.ConnectionPoolDataSource#getPooledConnection() public abstract javax.sql.PooledConnection
     *      javax.sql.ConnectionPoolDataSource.getPooledConnection() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPooledConnection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection(String, String) public abstract
     * javax.sql.PooledConnection
     * javax.sql.ConnectionPoolDataSource.getPooledConnection(java.lang.String,java.lang.String) throws
     * java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection(String, String) public abstract
     * javax.sql.PooledConnection
     * javax.sql.ConnectionPoolDataSource.getPooledConnection(java.lang.String,java.lang.String) throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.ConnectionPoolDataSource#getPooledConnection(String, String) public abstract
     *      javax.sql.PooledConnection
     *      javax.sql.ConnectionPoolDataSource.getPooledConnection(java.lang.String,java.lang.String) throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPooledConnection_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
