package org.j8unit.repository.javax.sql;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sql.ConnectionPoolDataSource interface javax.sql.ConnectionPoolDataSource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.ConnectionPoolDataSourceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConnectionPoolDataSourceTests<SUT extends javax.sql.ConnectionPoolDataSource>
extends org.j8unit.repository.javax.sql.CommonDataSourceTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection() public abstract javax.sql.PooledConnection javax.sql.ConnectionPoolDataSource.getPooledConnection() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPooledConnection() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.ConnectionPoolDataSource#getPooledConnection(java.lang.String,java.lang.String) public abstract javax.sql.PooledConnection javax.sql.ConnectionPoolDataSource.getPooledConnection(java.lang.String,java.lang.String) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPooledConnection_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
