package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.callback.UnsupportedCallbackException class
 * javax.security.auth.callback.UnsupportedCallbackException}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.callback.UnsupportedCallbackExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.callback.UnsupportedCallbackExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.callback.UnsupportedCallbackException
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.callback.UnsupportedCallbackException#getCallback()
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
