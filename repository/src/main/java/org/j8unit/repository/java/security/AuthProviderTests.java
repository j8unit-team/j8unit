package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.AuthProvider class java.security.AuthProvider}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AuthProviderClassTests}.
 * </p>
 *
 * @see java.security.AuthProvider class java.security.AuthProvider (the hereby targeted class-under-test class)
 * @see AuthProviderClassTests AuthProviderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AuthProviderTests<SUT extends java.security.AuthProvider>
extends ProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AuthProvider#logout() public abstract void
     * java.security.AuthProvider.logout() throws javax.security.auth.login.LoginException}.
     *
     * <p>
     * Test method for {@link java.security.AuthProvider#logout() public abstract void
     * java.security.AuthProvider.logout() throws javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AuthProvider#logout() public abstract void java.security.AuthProvider.logout() throws
     *      javax.security.auth.login.LoginException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_logout()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AuthProvider#login(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler)
     * public abstract void
     * java.security.AuthProvider.login(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler) throws
     * javax.security.auth.login.LoginException}.
     *
     * <p>
     * Test method for
     * {@link java.security.AuthProvider#login(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler)
     * public abstract void
     * java.security.AuthProvider.login(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler) throws
     * javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AuthProvider#login(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler)
     *      public abstract void
     *      java.security.AuthProvider.login(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler)
     *      throws javax.security.auth.login.LoginException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_login_Subject_CallbackHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AuthProvider#setCallbackHandler(javax.security.auth.callback.CallbackHandler) public
     * abstract void java.security.AuthProvider.setCallbackHandler(javax.security.auth.callback.CallbackHandler)}.
     *
     * <p>
     * Test method for
     * {@link java.security.AuthProvider#setCallbackHandler(javax.security.auth.callback.CallbackHandler) public
     * abstract void java.security.AuthProvider.setCallbackHandler(javax.security.auth.callback.CallbackHandler)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AuthProvider#setCallbackHandler(javax.security.auth.callback.CallbackHandler) public abstract
     *      void java.security.AuthProvider.setCallbackHandler(javax.security.auth.callback.CallbackHandler) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCallbackHandler_CallbackHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
