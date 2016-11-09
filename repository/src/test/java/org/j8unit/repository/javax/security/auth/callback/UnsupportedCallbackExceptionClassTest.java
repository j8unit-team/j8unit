package org.j8unit.repository.javax.security.auth.callback;

import javax.security.auth.callback.UnsupportedCallbackException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedCallbackException} (by simply
 * reusing the J8Unit test interface {@link UnsupportedCallbackExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedCallbackExceptionClassTest
implements UnsupportedCallbackExceptionClassTests<UnsupportedCallbackException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.callback.UnsupportedCallbackException]

    @Override
    public Class<UnsupportedCallbackException> createNewSUT() {
        return UnsupportedCallbackException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.UnsupportedCallbackException#UnsupportedCallbackException(javax.security.auth.callback.Callback, String)
     * public
     * javax.security.auth.callback.UnsupportedCallbackException(javax.security.auth.callback.Callback,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_UnsupportedCallbackException_Callback_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedCallbackException sut = null; // = new
                                                       // UnsupportedCallbackException(javax.security.auth.callback.Callback,
                                                       // String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.callback.UnsupportedCallbackException#UnsupportedCallbackException(javax.security.auth.callback.Callback)
     * public javax.security.auth.callback.UnsupportedCallbackException(javax.security.auth.callback.Callback)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_UnsupportedCallbackException_Callback()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedCallbackException sut = null; // = new
                                                       // UnsupportedCallbackException(javax.security.auth.callback.Callback);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.callback.UnsupportedCallbackException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.callback.UnsupportedCallbackException]

}
