package org.j8unit.repository.java.sql;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.Struct interface java.sql.Struct}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.StructClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StructTests<SUT extends java.sql.Struct>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Struct#getAttributes() public abstract java.lang.Object[]
     * java.sql.Struct.getAttributes() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Struct#getAttributes(java.util.Map) public abstract java.lang.Object[]
     * java.sql.Struct.getAttributes(java.util.Map) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Struct#getSQLTypeName() public abstract java.lang.String
     * java.sql.Struct.getSQLTypeName() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSQLTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
