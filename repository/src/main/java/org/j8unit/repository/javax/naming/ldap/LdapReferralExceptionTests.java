package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.LdapReferralException class
 * javax.naming.ldap.LdapReferralException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link LdapReferralExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.LdapReferralException class javax.naming.ldap.LdapReferralException (the hereby targeted
 *      class-under-test class)
 * @see LdapReferralExceptionClassTests LdapReferralExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LdapReferralExceptionTests<SUT extends javax.naming.ldap.LdapReferralException>
extends org.j8unit.repository.javax.naming.ReferralExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable) public
     * abstract javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable<?,
     * ?>) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable) public
     * abstract javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable) public abstract
     *      javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getReferralContext_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable, javax.naming.ldap.Control[])
     * public abstract javax.naming.Context
     * javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable<?, ?>,javax.naming.ldap.Control[])
     * throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable, javax.naming.ldap.Control[])
     * public abstract javax.naming.Context
     * javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable,javax.naming.ldap.Control[])
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable, javax.naming.ldap.Control[])
     *      public abstract javax.naming.Context
     *      javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable,javax.naming.ldap.Control[])
     *      throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferralContext_Hashtable_ControlArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext() public abstract
     * javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext() throws
     * javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.ldap.LdapReferralException#getReferralContext() public abstract
     * javax.naming.Context javax.naming.ldap.LdapReferralException.getReferralContext() throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.ldap.LdapReferralException#getReferralContext() public abstract javax.naming.Context
     *      javax.naming.ldap.LdapReferralException.getReferralContext() throws javax.naming.NamingException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getReferralContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
