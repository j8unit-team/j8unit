package org.j8unit.repository.javax.security.sasl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.sasl.SaslException class javax.security.sasl.SaslException}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link SaslExceptionClassTests}.
 * </p>
 *
 * @see javax.security.sasl.SaslException class javax.security.sasl.SaslException (the hereby targeted class-under-test
 *      class)
 * @see SaslExceptionClassTests SaslExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SaslExceptionTests<SUT extends javax.security.sasl.SaslException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#getCause() public java.lang.Throwable
     * javax.security.sasl.SaslException.getCause()}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#getCause() public java.lang.Throwable
     * javax.security.sasl.SaslException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslException#getCause() public java.lang.Throwable
     *      javax.security.sasl.SaslException.getCause() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#initCause(Throwable) public java.lang.Throwable
     * javax.security.sasl.SaslException.initCause(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#initCause(Throwable) public java.lang.Throwable
     * javax.security.sasl.SaslException.initCause(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslException#initCause(Throwable) public java.lang.Throwable
     *      javax.security.sasl.SaslException.initCause(java.lang.Throwable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_initCause_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#toString() public java.lang.String
     * javax.security.sasl.SaslException.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.sasl.SaslException#toString() public java.lang.String
     * javax.security.sasl.SaslException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.sasl.SaslException#toString() public java.lang.String
     *      javax.security.sasl.SaslException.toString() (the hereby targeted method-under-test)
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

}
