package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.AuthProvider class java.security.AuthProvider}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.AuthProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AuthProviderTests<SUT extends java.security.AuthProvider>
extends org.j8unit.repository.java.security.ProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AuthProvider#logout() public abstract void
     * java.security.AuthProvider.logout() throws javax.security.auth.login.LoginException}.
     * </p>
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
     * {@link java.security.AuthProvider#login(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler)
     * public abstract void
     * java.security.AuthProvider.login(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler) throws
     * javax.security.auth.login.LoginException}.
     * </p>
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
     * </p>
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
