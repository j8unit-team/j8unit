package org.j8unit.repository.javax.security.auth.spi;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.spi.LoginModule interface
 * javax.security.auth.spi.LoginModule}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link LoginModuleClassTests}.
 * </p>
 *
 * @see javax.security.auth.spi.LoginModule interface javax.security.auth.spi.LoginModule (the hereby targeted
 *      class-under-test class)
 * @see LoginModuleClassTests LoginModuleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoginModuleTests<SUT extends javax.security.auth.spi.LoginModule>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#logout() public abstract boolean
     * javax.security.auth.spi.LoginModule.logout() throws javax.security.auth.login.LoginException}.
     *
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#logout() public abstract boolean
     * javax.security.auth.spi.LoginModule.logout() throws javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.spi.LoginModule#logout() public abstract boolean
     *      javax.security.auth.spi.LoginModule.logout() throws javax.security.auth.login.LoginException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.security.auth.spi.LoginModule#abort() public abstract boolean
     * javax.security.auth.spi.LoginModule.abort() throws javax.security.auth.login.LoginException}.
     *
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#abort() public abstract boolean
     * javax.security.auth.spi.LoginModule.abort() throws javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.spi.LoginModule#abort() public abstract boolean
     *      javax.security.auth.spi.LoginModule.abort() throws javax.security.auth.login.LoginException (the hereby
     *      targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#commit() public abstract boolean
     * javax.security.auth.spi.LoginModule.commit() throws javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.spi.LoginModule#commit() public abstract boolean
     *      javax.security.auth.spi.LoginModule.commit() throws javax.security.auth.login.LoginException (the hereby
     *      targeted method-under-test)
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
     * {@link javax.security.auth.spi.LoginModule#initialize(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler, java.util.Map, java.util.Map)
     * public abstract void
     * javax.security.auth.spi.LoginModule.initialize(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler,java.util.Map<java.lang.String,
     * ?>,java.util.Map<java.lang.String, ?>)}.
     *
     * <p>
     * Test method for
     * {@link javax.security.auth.spi.LoginModule#initialize(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler, java.util.Map, java.util.Map)
     * public abstract void
     * javax.security.auth.spi.LoginModule.initialize(javax.security.auth.Subject,javax.security.auth.callback.CallbackHandler,java.util.Map,java.util.Map)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.spi.LoginModule#initialize(javax.security.auth.Subject,
     *      javax.security.auth.callback.CallbackHandler, java.util.Map, java.util.Map) public abstract void
     *      javax.security.auth.spi.LoginModule.initialize(javax.security.auth.Subject,javax.security.auth.callback.
     *      CallbackHandler,java.util.Map,java.util.Map) (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.security.auth.spi.LoginModule#login() public abstract boolean
     * javax.security.auth.spi.LoginModule.login() throws javax.security.auth.login.LoginException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.spi.LoginModule#login() public abstract boolean
     *      javax.security.auth.spi.LoginModule.login() throws javax.security.auth.login.LoginException (the hereby
     *      targeted method-under-test)
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

}
