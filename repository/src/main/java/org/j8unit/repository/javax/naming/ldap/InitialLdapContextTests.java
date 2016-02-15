package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.InitialLdapContext class
 * javax.naming.ldap.InitialLdapContext}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link InitialLdapContextClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.InitialLdapContext class javax.naming.ldap.InitialLdapContext (the hereby targeted
 *      class-under-test class)
 * @see InitialLdapContextClassTests InitialLdapContextClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InitialLdapContextTests<SUT extends javax.naming.ldap.InitialLdapContext>
extends LdapContextTests<SUT>, org.j8unit.repository.javax.naming.directory.InitialDirContextTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest)
     * public javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.InitialLdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest)
     * public javax.naming.ldap.ExtendedResponse
     * javax.naming.ldap.InitialLdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#extendedOperation(javax.naming.ldap.ExtendedRequest) public
     *      javax.naming.ldap.ExtendedResponse
     *      javax.naming.ldap.InitialLdapContext.extendedOperation(javax.naming.ldap.ExtendedRequest) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getRequestControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getRequestControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getRequestControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getRequestControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#getRequestControls() public javax.naming.ldap.Control[]
     *      javax.naming.ldap.InitialLdapContext.getRequestControls() throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getResponseControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getResponseControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getResponseControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getResponseControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#getResponseControls() public javax.naming.ldap.Control[]
     *      javax.naming.ldap.InitialLdapContext.getResponseControls() throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getConnectControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getConnectControls() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#getConnectControls() public
     * javax.naming.ldap.Control[] javax.naming.ldap.InitialLdapContext.getConnectControls() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#getConnectControls() public javax.naming.ldap.Control[]
     *      javax.naming.ldap.InitialLdapContext.getConnectControls() throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.naming.ldap.InitialLdapContext#reconnect(javax.naming.ldap.Control[]) public void
     * javax.naming.ldap.InitialLdapContext.reconnect(javax.naming.ldap.Control[]) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#reconnect(javax.naming.ldap.Control[]) public void
     * javax.naming.ldap.InitialLdapContext.reconnect(javax.naming.ldap.Control[]) throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#reconnect(javax.naming.ldap.Control[]) public void
     *      javax.naming.ldap.InitialLdapContext.reconnect(javax.naming.ldap.Control[]) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_reconnect_ControlArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#setRequestControls(javax.naming.ldap.Control[])
     * public void javax.naming.ldap.InitialLdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#setRequestControls(javax.naming.ldap.Control[])
     * public void javax.naming.ldap.InitialLdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#setRequestControls(javax.naming.ldap.Control[]) public void
     *      javax.naming.ldap.InitialLdapContext.setRequestControls(javax.naming.ldap.Control[]) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.naming.ldap.InitialLdapContext#newInstance(javax.naming.ldap.Control[]) public
     * javax.naming.ldap.LdapContext javax.naming.ldap.InitialLdapContext.newInstance(javax.naming.ldap.Control[])
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.InitialLdapContext#newInstance(javax.naming.ldap.Control[]) public
     * javax.naming.ldap.LdapContext javax.naming.ldap.InitialLdapContext.newInstance(javax.naming.ldap.Control[])
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.InitialLdapContext#newInstance(javax.naming.ldap.Control[]) public
     *      javax.naming.ldap.LdapContext javax.naming.ldap.InitialLdapContext.newInstance(javax.naming.ldap.Control[])
     *      throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#modifyAttributes(String, javax.naming.directory.ModificationItem[])
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#modifyAttributes(String, javax.naming.directory.ModificationItem[])
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modifyAttributes_String_ModificationItemArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#modifyAttributes(javax.naming.Name, int, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#modifyAttributes(javax.naming.Name, int, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modifyAttributes_Name_int_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#modifyAttributes(String, int, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#modifyAttributes(String, int, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modifyAttributes_String_int_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#modifyAttributes(javax.naming.Name, javax.naming.directory.ModificationItem[])
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#modifyAttributes(javax.naming.Name, javax.naming.directory.ModificationItem[])
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modifyAttributes_Name_ModificationItemArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#list(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#list(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_list_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#list(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#list(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_list_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#rebind(javax.naming.Name, Object) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#rebind(javax.naming.Name, Object) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_Name_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#rebind(String, Object) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#rebind(String, Object) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_String_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#unbind(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#unbind(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unbind_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#unbind(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#unbind(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_unbind_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#search(javax.naming.Name, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(javax.naming.Name, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_Name_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#search(String, javax.naming.directory.Attributes, String[])
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(String, javax.naming.directory.Attributes, String[])
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_String_Attributes_StringArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#search(String, javax.naming.directory.Attributes) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#search(String, javax.naming.directory.Attributes) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_String_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#search(javax.naming.Name, String, Object[], javax.naming.directory.SearchControls)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(javax.naming.Name, String, Object[], javax.naming.directory.SearchControls)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_Name_String_ObjectArray_SearchControls()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#search(String, String, Object[], javax.naming.directory.SearchControls)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(String, String, Object[], javax.naming.directory.SearchControls)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_String_String_ObjectArray_SearchControls()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#search(javax.naming.Name, String, javax.naming.directory.SearchControls)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(javax.naming.Name, String, javax.naming.directory.SearchControls)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_Name_String_SearchControls()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#search(String, String, javax.naming.directory.SearchControls)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(String, String, javax.naming.directory.SearchControls)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_String_String_SearchControls()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#search(javax.naming.Name, javax.naming.directory.Attributes, String[])
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#search(javax.naming.Name, javax.naming.directory.Attributes, String[])
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_search_Name_Attributes_StringArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getSchema(javax.naming.Name) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getSchema(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSchema_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getSchema(String) interface javax.naming.directory.DirContext}
     * </li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getSchema(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSchema_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#getNameParser(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getNameParser(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNameParser_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#getNameParser(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getNameParser(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNameParser_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#composeName(javax.naming.Name, javax.naming.Name) interface
     * javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#composeName(javax.naming.Name, javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_composeName_Name_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#composeName(String, String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#composeName(String, String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_composeName_String_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#bind(javax.naming.Name, Object) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#bind(javax.naming.Name, Object) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_Name_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#bind(String, Object) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#bind(String, Object) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_String_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#getNameInNamespace() interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getNameInNamespace() class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNameInNamespace()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#createSubcontext(javax.naming.Name, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#createSubcontext(javax.naming.Name, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createSubcontext_Name_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#createSubcontext(String, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#createSubcontext(String, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createSubcontext_String_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#addToEnvironment(String, Object) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#addToEnvironment(String, Object) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addToEnvironment_String_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#lookup(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#lookup(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lookup_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#lookup(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#lookup(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lookup_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getSchemaClassDefinition(String) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getSchemaClassDefinition(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSchemaClassDefinition_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getSchemaClassDefinition(javax.naming.Name) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getSchemaClassDefinition(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSchemaClassDefinition_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#getEnvironment() interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getEnvironment() class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEnvironment()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#listBindings(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#listBindings(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_listBindings_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#listBindings(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#listBindings(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_listBindings_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#lookupLink(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#lookupLink(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lookupLink_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#lookupLink(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#lookupLink(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_lookupLink_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#rename(javax.naming.Name, javax.naming.Name) interface javax.naming.Context}
     * </li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#rename(javax.naming.Name, javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rename_Name_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#rename(String, String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#rename(String, String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rename_String_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#createSubcontext(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#createSubcontext(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createSubcontext_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#createSubcontext(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#createSubcontext(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createSubcontext_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#destroySubcontext(javax.naming.Name) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#destroySubcontext(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_destroySubcontext_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#destroySubcontext(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#destroySubcontext(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_destroySubcontext_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#removeFromEnvironment(String) interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#removeFromEnvironment(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeFromEnvironment_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#bind(String, Object, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#bind(String, Object, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_String_Object_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#bind(javax.naming.Name, Object, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#bind(javax.naming.Name, Object, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_bind_Name_Object_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getAttributes(javax.naming.Name, String[]) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getAttributes(javax.naming.Name, String[]) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_Name_StringArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getAttributes(javax.naming.Name) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getAttributes(javax.naming.Name) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_Name()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getAttributes(String, String[]) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getAttributes(String, String[]) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_String_StringArray()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#getAttributes(String) interface
     * javax.naming.directory.DirContext}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#getAttributes(String) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_String()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>
     * {@linkplain javax.naming.directory.DirContext#rebind(javax.naming.Name, Object, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#rebind(javax.naming.Name, Object, javax.naming.directory.Attributes)
     * class javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_Name_Object_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.directory.DirContext#rebind(String, Object, javax.naming.directory.Attributes)
     * interface javax.naming.directory.DirContext}</li>
     * <li>
     * {@linkplain javax.naming.directory.InitialDirContext#rebind(String, Object, javax.naming.directory.Attributes) class
     * javax.naming.directory.InitialDirContext}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_rebind_String_Object_Attributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.naming.Context#close() interface javax.naming.Context}</li>
     * <li>{@linkplain javax.naming.directory.InitialDirContext#close() class javax.naming.directory.InitialDirContext}
     * </li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
    }

}
