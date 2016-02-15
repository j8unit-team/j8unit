package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.PrivilegedActionException class
 * java.security.PrivilegedActionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PrivilegedActionExceptionClassTests}.
 * </p>
 *
 * @see java.security.PrivilegedActionException class java.security.PrivilegedActionException (the hereby targeted
 *      class-under-test class)
 * @see PrivilegedActionExceptionClassTests PrivilegedActionExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivilegedActionExceptionTests<SUT extends java.security.PrivilegedActionException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getException() public java.lang.Exception
     * java.security.PrivilegedActionException.getException()}.
     *
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getException() public java.lang.Exception
     * java.security.PrivilegedActionException.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.PrivilegedActionException#getException() public java.lang.Exception
     *      java.security.PrivilegedActionException.getException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#toString() public java.lang.String
     * java.security.PrivilegedActionException.toString()}.
     *
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#toString() public java.lang.String
     * java.security.PrivilegedActionException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.PrivilegedActionException#toString() public java.lang.String
     *      java.security.PrivilegedActionException.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getCause() public java.lang.Throwable
     * java.security.PrivilegedActionException.getCause()}.
     *
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getCause() public java.lang.Throwable
     * java.security.PrivilegedActionException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.PrivilegedActionException#getCause() public java.lang.Throwable
     *      java.security.PrivilegedActionException.getCause() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
