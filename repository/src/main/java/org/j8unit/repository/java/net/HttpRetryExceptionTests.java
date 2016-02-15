package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.HttpRetryException class java.net.HttpRetryException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link HttpRetryExceptionClassTests}.
 * </p>
 *
 * @see java.net.HttpRetryException class java.net.HttpRetryException (the hereby targeted class-under-test class)
 * @see HttpRetryExceptionClassTests HttpRetryExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HttpRetryExceptionTests<SUT extends java.net.HttpRetryException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.HttpRetryException#responseCode() public int
     * java.net.HttpRetryException.responseCode()}.
     *
     * <p>
     * Test method for {@link java.net.HttpRetryException#responseCode() public int
     * java.net.HttpRetryException.responseCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.HttpRetryException#responseCode() public int java.net.HttpRetryException.responseCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_responseCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.HttpRetryException#getReason() public java.lang.String
     * java.net.HttpRetryException.getReason()}.
     *
     * <p>
     * Test method for {@link java.net.HttpRetryException#getReason() public java.lang.String
     * java.net.HttpRetryException.getReason()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.HttpRetryException#getReason() public java.lang.String java.net.HttpRetryException.getReason() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReason()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.HttpRetryException#getLocation() public java.lang.String
     * java.net.HttpRetryException.getLocation()}.
     *
     * <p>
     * Test method for {@link java.net.HttpRetryException#getLocation() public java.lang.String
     * java.net.HttpRetryException.getLocation()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.HttpRetryException#getLocation() public java.lang.String java.net.HttpRetryException.getLocation()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
