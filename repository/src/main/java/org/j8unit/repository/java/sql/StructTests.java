package org.j8unit.repository.java.sql;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.Struct interface java.sql.Struct}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link StructClassTests}.
 * </p>
 *
 * @see java.sql.Struct interface java.sql.Struct (the hereby targeted class-under-test class)
 * @see StructClassTests StructClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StructTests<SUT extends java.sql.Struct>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Struct#getAttributes() public abstract java.lang.Object[]
     * java.sql.Struct.getAttributes() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Struct#getAttributes() public abstract java.lang.Object[]
     * java.sql.Struct.getAttributes() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Struct#getAttributes() public abstract java.lang.Object[] java.sql.Struct.getAttributes() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
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
     * java.sql.Struct.getAttributes(java.util.Map<java.lang.String, java.lang.Class<?>>) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Struct#getAttributes(java.util.Map) public abstract java.lang.Object[]
     * java.sql.Struct.getAttributes(java.util.Map) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Struct#getAttributes(java.util.Map) public abstract java.lang.Object[]
     *      java.sql.Struct.getAttributes(java.util.Map) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
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
     *
     * <p>
     * Test method for {@link java.sql.Struct#getSQLTypeName() public abstract java.lang.String
     * java.sql.Struct.getSQLTypeName() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Struct#getSQLTypeName() public abstract java.lang.String java.sql.Struct.getSQLTypeName() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
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
