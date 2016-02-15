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
 * non-{@code static} methods) of {@linkplain java.sql.Driver interface java.sql.Driver}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link DriverClassTests}.
 * </p>
 *
 * @see java.sql.Driver interface java.sql.Driver (the hereby targeted class-under-test class)
 * @see DriverClassTests DriverClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DriverTests<SUT extends java.sql.Driver>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Driver#getParentLogger() public abstract java.util.logging.Logger
     * java.sql.Driver.getParentLogger() throws java.sql.SQLFeatureNotSupportedException}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#getParentLogger() public abstract java.util.logging.Logger
     * java.sql.Driver.getParentLogger() throws java.sql.SQLFeatureNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#getParentLogger() public abstract java.util.logging.Logger java.sql.Driver.getParentLogger()
     *      throws java.sql.SQLFeatureNotSupportedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParentLogger()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#getMajorVersion() public abstract int java.sql.Driver.getMajorVersion()}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#getMajorVersion() public abstract int java.sql.Driver.getMajorVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#getMajorVersion() public abstract int java.sql.Driver.getMajorVersion() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMajorVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#connect(String, java.util.Properties) public abstract java.sql.Connection
     * java.sql.Driver.connect(java.lang.String,java.util.Properties) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#connect(String, java.util.Properties) public abstract java.sql.Connection
     * java.sql.Driver.connect(java.lang.String,java.util.Properties) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#connect(String, java.util.Properties) public abstract java.sql.Connection
     *      java.sql.Driver.connect(java.lang.String,java.util.Properties) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_String_Properties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#acceptsURL(String) public abstract boolean
     * java.sql.Driver.acceptsURL(java.lang.String) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#acceptsURL(String) public abstract boolean
     * java.sql.Driver.acceptsURL(java.lang.String) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#acceptsURL(String) public abstract boolean java.sql.Driver.acceptsURL(java.lang.String)
     *      throws java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_acceptsURL_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#getPropertyInfo(String, java.util.Properties) public abstract
     * java.sql.DriverPropertyInfo[] java.sql.Driver.getPropertyInfo(java.lang.String,java.util.Properties) throws
     * java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#getPropertyInfo(String, java.util.Properties) public abstract
     * java.sql.DriverPropertyInfo[] java.sql.Driver.getPropertyInfo(java.lang.String,java.util.Properties) throws
     * java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#getPropertyInfo(String, java.util.Properties) public abstract java.sql.DriverPropertyInfo[]
     *      java.sql.Driver.getPropertyInfo(java.lang.String,java.util.Properties) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyInfo_String_Properties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#jdbcCompliant() public abstract boolean java.sql.Driver.jdbcCompliant()}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#jdbcCompliant() public abstract boolean java.sql.Driver.jdbcCompliant()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#jdbcCompliant() public abstract boolean java.sql.Driver.jdbcCompliant() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_jdbcCompliant()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Driver#getMinorVersion() public abstract int java.sql.Driver.getMinorVersion()}.
     *
     * <p>
     * Test method for {@link java.sql.Driver#getMinorVersion() public abstract int java.sql.Driver.getMinorVersion()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.Driver#getMinorVersion() public abstract int java.sql.Driver.getMinorVersion() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinorVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
