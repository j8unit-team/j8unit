package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.LoginContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LoginContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.login.LoginContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class LoginContextClassTest
implements LoginContextClassTests<LoginContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.LoginContext]

    @Override
    public Class<LoginContext> createNewSUT() {
        return LoginContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginContext#LoginContext(String, javax.security.auth.Subject) public
     * javax.security.auth.login.LoginContext(java.lang.String,javax.security.auth.Subject) throws
     * javax.security.auth.login.LoginException}.
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
    public void create_LoginContext_String_Subject()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginContext sut = null; // = new LoginContext(String, javax.security.auth.Subject);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginContext#LoginContext(String, javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler, javax.security.auth.login.Configuration)
     * public
     * javax.security.auth.login.LoginContext(java.lang.String,javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler,javax.security.auth.login.Configuration)
     * throws javax.security.auth.login.LoginException}.
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
    public void create_LoginContext_String_Subject_CallbackHandler_Configuration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginContext sut = null; // = new LoginContext(String, javax.security.auth.Subject,
                                       // javax.security.auth.callback.CallbackHandler,
                                       // javax.security.auth.login.Configuration);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginContext#LoginContext(String) public
     * javax.security.auth.login.LoginContext(java.lang.String) throws javax.security.auth.login.LoginException}.
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
    public void create_LoginContext_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginContext sut = null; // = new LoginContext(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginContext#LoginContext(String, javax.security.auth.callback.CallbackHandler)
     * public javax.security.auth.login.LoginContext(java.lang.String,javax.security.auth.callback.CallbackHandler)
     * throws javax.security.auth.login.LoginException}.
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
    public void create_LoginContext_String_CallbackHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginContext sut = null; // = new LoginContext(String, javax.security.auth.callback.CallbackHandler);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginContext#LoginContext(String, javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler)
     * public
     * javax.security.auth.login.LoginContext(java.lang.String,javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler)
     * throws javax.security.auth.login.LoginException}.
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
    public void create_LoginContext_String_Subject_CallbackHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginContext sut = null; // = new LoginContext(String, javax.security.auth.Subject,
                                       // javax.security.auth.callback.CallbackHandler);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.login.LoginContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.LoginContext]

}
