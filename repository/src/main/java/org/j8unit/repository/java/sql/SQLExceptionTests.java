package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLException class java.sql.SQLException}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SQLExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLException class java.sql.SQLException (the hereby targeted class-under-test class)
 * @see SQLExceptionClassTests SQLExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLExceptionTests<SUT extends java.sql.SQLException>
extends org.j8unit.repository.java.lang.IterableTests<SUT, Throwable>, org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.SQLException#iterator() public java.util.Iterator
     * <java.lang.Throwable> java.sql.SQLException.iterator()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLException#iterator() public java.util.Iterator
     * java.sql.SQLException.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLException#iterator() public java.util.Iterator java.sql.SQLException.iterator() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLException#getErrorCode() public int java.sql.SQLException.getErrorCode()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLException#getErrorCode() public int java.sql.SQLException.getErrorCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLException#getErrorCode() public int java.sql.SQLException.getErrorCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getErrorCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLException#getSQLState() public java.lang.String
     * java.sql.SQLException.getSQLState()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLException#getSQLState() public java.lang.String
     * java.sql.SQLException.getSQLState()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLException#getSQLState() public java.lang.String java.sql.SQLException.getSQLState() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSQLState()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLException#getNextException() public java.sql.SQLException
     * java.sql.SQLException.getNextException()}.
     *
     * <p>
     * Test method for {@link java.sql.SQLException#getNextException() public java.sql.SQLException
     * java.sql.SQLException.getNextException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLException#getNextException() public java.sql.SQLException
     *      java.sql.SQLException.getNextException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.SQLException#setNextException(java.sql.SQLException) public void
     * java.sql.SQLException.setNextException(java.sql.SQLException)}.
     *
     * <p>
     * Test method for {@link java.sql.SQLException#setNextException(java.sql.SQLException) public void
     * java.sql.SQLException.setNextException(java.sql.SQLException)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.SQLException#setNextException(java.sql.SQLException) public void
     *      java.sql.SQLException.setNextException(java.sql.SQLException) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNextException_SQLException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
