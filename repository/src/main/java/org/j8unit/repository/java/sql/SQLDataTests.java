package org.j8unit.repository.java.sql;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.sql.SQLData interface java.sql.SQLData},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.SQLDataClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SQLDataTests<SUT extends java.sql.SQLData>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.sql.SQLData#getSQLTypeName() public abstract java.lang.String java.sql.SQLData.getSQLTypeName() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSQLTypeName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLData#writeSQL(java.sql.SQLOutput) public abstract void java.sql.SQLData.writeSQL(java.sql.SQLOutput) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeSQL_SQLOutput() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLData#readSQL(java.sql.SQLInput,java.lang.String) public abstract void java.sql.SQLData.readSQL(java.sql.SQLInput,java.lang.String) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readSQL_SQLInput_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
