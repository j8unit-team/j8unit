package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.LdapName;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LdapName} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.naming.ldap.LdapNameClassTests}).
 */
@RunWith(J8Unit4.class)
public class LdapNameClassTest
implements LdapNameClassTests<LdapName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.LdapName]

    @Override
    public Class<LdapName> createNewSUT() {
        return LdapName.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.naming.ldap.LdapName#LdapName(String)
     * public javax.naming.ldap.LdapName(java.lang.String) throws javax.naming.InvalidNameException}.
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
    public void create_LdapName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LdapName sut = null; // = new LdapName(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.LdapName#LdapName(java.util.List) public
     * javax.naming.ldap.LdapName(java.util.List<javax.naming.ldap.Rdn>)}.
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
    public void create_LdapName_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LdapName sut = null; // = new LdapName(java.util.List);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.LdapName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.LdapName]

}
