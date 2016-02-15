package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.callback.UnsupportedCallbackException class
 * javax.security.auth.callback.UnsupportedCallbackException}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link UnsupportedCallbackExceptionClassTests}.
 * </p>
 *
 * @see javax.security.auth.callback.UnsupportedCallbackException class
 *      javax.security.auth.callback.UnsupportedCallbackException (the hereby targeted class-under-test class)
 * @see UnsupportedCallbackExceptionClassTests UnsupportedCallbackExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedCallbackExceptionTests<SUT extends javax.security.auth.callback.UnsupportedCallbackException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.UnsupportedCallbackException#getCallback() public
     * javax.security.auth.callback.Callback javax.security.auth.callback.UnsupportedCallbackException.getCallback()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.callback.UnsupportedCallbackException#getCallback() public
     * javax.security.auth.callback.Callback javax.security.auth.callback.UnsupportedCallbackException.getCallback()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.callback.UnsupportedCallbackException#getCallback() public
     *      javax.security.auth.callback.Callback
     *      javax.security.auth.callback.UnsupportedCallbackException.getCallback() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCallback()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
