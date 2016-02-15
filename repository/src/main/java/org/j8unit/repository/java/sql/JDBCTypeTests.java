package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.JDBCType class java.sql.JDBCType}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link JDBCTypeClassTests}.
 * </p>
 *
 * @see java.sql.JDBCType class java.sql.JDBCType (the hereby targeted class-under-test class)
 * @see JDBCTypeClassTests JDBCTypeClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JDBCTypeTests<SUT extends java.sql.JDBCType>
extends SQLTypeTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.sql.JDBCType> {

    /**
     * <p>
     * Test method for {@link java.sql.JDBCType#getName() public java.lang.String java.sql.JDBCType.getName()}.
     *
     * <p>
     * Test method for {@link java.sql.JDBCType#getName() public java.lang.String java.sql.JDBCType.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.JDBCType#getName() public java.lang.String java.sql.JDBCType.getName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.JDBCType#getVendorTypeNumber() public java.lang.Integer
     * java.sql.JDBCType.getVendorTypeNumber()}.
     *
     * <p>
     * Test method for {@link java.sql.JDBCType#getVendorTypeNumber() public java.lang.Integer
     * java.sql.JDBCType.getVendorTypeNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.JDBCType#getVendorTypeNumber() public java.lang.Integer java.sql.JDBCType.getVendorTypeNumber()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getVendorTypeNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.JDBCType#getVendor() public java.lang.String java.sql.JDBCType.getVendor()}.
     *
     * <p>
     * Test method for {@link java.sql.JDBCType#getVendor() public java.lang.String java.sql.JDBCType.getVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.JDBCType#getVendor() public java.lang.String java.sql.JDBCType.getVendor() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
