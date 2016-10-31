package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.InitialLdapContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialLdapContextClassTest
implements org.j8unit.repository.javax.naming.ldap.InitialLdapContextClassTests<InitialLdapContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.InitialLdapContext]

    @Override
    public Class<InitialLdapContext> createNewSUT() {
        return InitialLdapContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.InitialLdapContext#InitialLdapContext() public javax.naming.ldap.InitialLdapContext()
     * throws javax.naming.NamingException}.
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
    public void create_InitialLdapContext()
    throws Exception {
        // create new instance
        final InitialLdapContext sut = new InitialLdapContext();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.InitialLdapContext#InitialLdapContext(java.util.Hashtable, javax.naming.ldap.Control[])
     * public javax.naming.ldap.InitialLdapContext(java.util.Hashtable<?, ?>,javax.naming.ldap.Control[]) throws
     * javax.naming.NamingException}.
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
    public void create_InitialLdapContext_Hashtable_ControlArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InitialLdapContext sut = null; // = new InitialLdapContext(java.util.Hashtable,
                                             // javax.naming.ldap.Control[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.InitialLdapContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.InitialLdapContext]

}
