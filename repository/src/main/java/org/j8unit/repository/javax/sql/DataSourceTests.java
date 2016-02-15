package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.DataSource interface javax.sql.DataSource}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link DataSourceClassTests}.
 * </p>
 *
 * @see javax.sql.DataSource interface javax.sql.DataSource (the hereby targeted class-under-test class)
 * @see DataSourceClassTests DataSourceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataSourceTests<SUT extends javax.sql.DataSource>
extends CommonDataSourceTests<SUT>, org.j8unit.repository.java.sql.WrapperTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection() public abstract java.sql.Connection
     * javax.sql.DataSource.getConnection() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection() public abstract java.sql.Connection
     * javax.sql.DataSource.getConnection() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.DataSource#getConnection() public abstract java.sql.Connection
     *      javax.sql.DataSource.getConnection() throws java.sql.SQLException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.DataSource#getConnection(String, String) public abstract java.sql.Connection
     * javax.sql.DataSource.getConnection(java.lang.String,java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection(String, String) public abstract java.sql.Connection
     * javax.sql.DataSource.getConnection(java.lang.String,java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.DataSource#getConnection(String, String) public abstract java.sql.Connection
     *      javax.sql.DataSource.getConnection(java.lang.String,java.lang.String) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnection_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
