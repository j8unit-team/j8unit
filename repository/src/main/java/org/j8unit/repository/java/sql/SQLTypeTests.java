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
 * non-{@code static} methods) of {@linkplain java.sql.SQLType interface java.sql.SQLType}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link SQLTypeClassTests}.
 * </p>
 *
 * @see java.sql.SQLType interface java.sql.SQLType (the hereby targeted class-under-test class)
 * @see SQLTypeClassTests SQLTypeClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTypeTests<SUT extends java.sql.SQLType>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.SQLType#getVendor() public abstract java.lang.String
     * java.sql.SQLType.getVendor()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLType#getVendor() public abstract java.lang.String
     * java.sql.SQLType.getVendor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLType#getVendor() public abstract java.lang.String java.sql.SQLType.getVendor() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVendor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLType#getName() public abstract java.lang.String java.sql.SQLType.getName()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLType#getName() public abstract java.lang.String java.sql.SQLType.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLType#getName() public abstract java.lang.String java.sql.SQLType.getName() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.sql.SQLType#getVendorTypeNumber() public abstract java.lang.Integer
     * java.sql.SQLType.getVendorTypeNumber()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLType#getVendorTypeNumber() public abstract java.lang.Integer
     * java.sql.SQLType.getVendorTypeNumber()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLType#getVendorTypeNumber() public abstract java.lang.Integer
     *      java.sql.SQLType.getVendorTypeNumber() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getVendorTypeNumber()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
