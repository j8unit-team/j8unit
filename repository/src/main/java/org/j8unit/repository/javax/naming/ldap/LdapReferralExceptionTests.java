package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.LdapReferralException class
 * javax.naming.ldap.LdapReferralException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.ldap.LdapReferralExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ldap.LdapReferralExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.LdapReferralException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LdapReferralExceptionTests<SUT extends javax.naming.ldap.LdapReferralException>
extends org.j8unit.repository.javax.naming.ReferralExceptionTests<SUT> {

    /**
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
     * @j8unit.aim javax.naming.ldap.LdapReferralException#getReferralContext()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getReferralContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
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
     * @j8unit.aim javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * javax.naming.ldap.LdapReferralException.getReferralContext(java.util.Hashtable,javax.naming.ldap.Control[])
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.ldap.LdapReferralException#getReferralContext(java.util.Hashtable,
     *             javax.naming.ldap.Control[])
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

}
