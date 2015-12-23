package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.DataSource interface javax.sql.DataSource}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.sql.DataSourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.DataSourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.DataSource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataSourceTests<SUT extends javax.sql.DataSource>
extends org.j8unit.repository.javax.sql.CommonDataSourceTests<SUT>, org.j8unit.repository.java.sql.WrapperTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection() public abstract java.sql.Connection
     * javax.sql.DataSource.getConnection() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.DataSource#getConnection()
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
     * Test method for {@link javax.sql.DataSource#getConnection(java.lang.String, java.lang.String) public abstract
     * java.sql.Connection javax.sql.DataSource.getConnection(java.lang.String,java.lang.String) throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.DataSource#getConnection(java.lang.String, java.lang.String)
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
