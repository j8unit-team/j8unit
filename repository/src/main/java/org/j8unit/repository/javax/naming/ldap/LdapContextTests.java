package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.LdapContext interface javax.naming.ldap.LdapContext}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LdapContextClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.LdapContext interface javax.naming.ldap.LdapContext (the hereby targeted class-under-test
 *      class)
 * @see LdapContextClassTests LdapContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LdapContextTests<SUT extends javax.naming.ldap.LdapContext>
extends org.j8unit.repository.javax.naming.directory.DirContextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#setRequestControls(javax.naming.ldap.Control[]) public
     * abstract void javax.naming.ldap.LdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#setRequestControls(javax.naming.ldap.Control[]) public
     * abstract void javax.naming.ldap.LdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#setRequestControls(javax.naming.ldap.Control[]) public abstract void
     *      javax.naming.ldap.LdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRequestControls_ControlArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#newInstance(javax.naming.ldap.Control[]) public abstract
     * javax.naming.ldap.LdapContext javax.naming.ldap.LdapContext.newInstance(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#newInstance(javax.naming.ldap.Control[]) public abstract
     * javax.naming.ldap.LdapContext javax.naming.ldap.LdapContext.newInstance(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#newInstance(javax.naming.ldap.Control[]) public abstract
     *      javax.naming.ldap.LdapContext javax.naming.ldap.LdapContext.newInstance(javax.naming.ldap.Control[]) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newInstance_ControlArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest) public
     * abstract javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.LdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest) public
     * abstract javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.LdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest) public abstract
     *      javax.naming.ldap.ExtendedResponse
     *      javax.naming.ldap.LdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_extendedOperation_ExtendedRequest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getResponseControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getResponseControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getResponseControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getResponseControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#getResponseControls() public abstract javax.naming.ldap.Control[]
     *      javax.naming.ldap.LdapContext.getResponseControls() throws javax.naming.NamingException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResponseControls()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getRequestControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getRequestControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getRequestControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getRequestControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#getRequestControls() public abstract javax.naming.ldap.Control[]
     *      javax.naming.ldap.LdapContext.getRequestControls() throws javax.naming.NamingException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRequestControls()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getConnectControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getConnectControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#getConnectControls() public abstract
     * javax.naming.ldap.Control[] javax.naming.ldap.LdapContext.getConnectControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#getConnectControls() public abstract javax.naming.ldap.Control[]
     *      javax.naming.ldap.LdapContext.getConnectControls() throws javax.naming.NamingException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConnectControls()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#reconnect(javax.naming.ldap.Control[]) public abstract void
     * javax.naming.ldap.LdapContext.reconnect(javax.naming.ldap.Control[]) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapContext#reconnect(javax.naming.ldap.Control[]) public abstract void
     * javax.naming.ldap.LdapContext.reconnect(javax.naming.ldap.Control[]) throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapContext#reconnect(javax.naming.ldap.Control[]) public abstract void
     *      javax.naming.ldap.LdapContext.reconnect(javax.naming.ldap.Control[]) throws javax.naming.NamingException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reconnect_ControlArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
