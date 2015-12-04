package org.j8unit.repository.javax.security.auth.callback;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.security.auth.callback.UnsupportedCallbackException class javax.security.auth.callback.UnsupportedCallbackException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.callback.UnsupportedCallbackExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnsupportedCallbackExceptionTests<SUT extends javax.security.auth.callback.UnsupportedCallbackException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.security.auth.callback.UnsupportedCallbackException#getCallback() public javax.security.auth.callback.Callback javax.security.auth.callback.UnsupportedCallbackException.getCallback()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCallback() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
