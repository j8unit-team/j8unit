package org.j8unit.repository.javax.security.auth.spi;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.spi.LoginModule interface javax.security.auth.spi.LoginModule}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.spi.LoginModuleClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoginModuleTests<SUT extends javax.security.auth.spi.LoginModule>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#abort() public abstract boolean
     * javax.security.auth.spi.LoginModule.abort() throws javax.security.auth.login.LoginException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_abort()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#commit() public abstract boolean
     * javax.security.auth.spi.LoginModule.commit() throws javax.security.auth.login.LoginException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.spi.LoginModule#initialize(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler,java.util.Map,java.util.Map)
     * public abstract void
     * javax.security.auth.spi.LoginModule.initialize(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler,java.util.Map,java.util.Map)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_initialize_Subject_CallbackHandler_Map_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#login() public abstract boolean
     * javax.security.auth.spi.LoginModule.login() throws javax.security.auth.login.LoginException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_login()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#logout() public abstract boolean
     * javax.security.auth.spi.LoginModule.logout() throws javax.security.auth.login.LoginException}.
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

}
