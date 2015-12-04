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
 * Test class for {@link javax.sql.DataSource interface javax.sql.DataSource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.DataSourceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DataSourceTests<SUT extends javax.sql.DataSource>
extends org.j8unit.repository.javax.sql.CommonDataSourceTests<SUT>,
        org.j8unit.repository.java.sql.WrapperTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection() public abstract java.sql.Connection javax.sql.DataSource.getConnection() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnection() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.DataSource#getConnection(java.lang.String,java.lang.String) public abstract java.sql.Connection javax.sql.DataSource.getConnection(java.lang.String,java.lang.String) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnection_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
