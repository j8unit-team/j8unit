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
 * Test class for {@link javax.sql.XADataSource interface javax.sql.XADataSource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.XADataSourceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XADataSourceTests<SUT extends javax.sql.XADataSource>
extends org.j8unit.repository.javax.sql.CommonDataSourceTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sql.XADataSource#getXAConnection() public abstract javax.sql.XAConnection javax.sql.XADataSource.getXAConnection() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXAConnection() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.XADataSource#getXAConnection(java.lang.String,java.lang.String) public abstract javax.sql.XAConnection javax.sql.XADataSource.getXAConnection(java.lang.String,java.lang.String) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getXAConnection_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
