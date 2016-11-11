package org.j8unit.repository.javax.security.auth.kerberos;

import javax.security.auth.kerberos.DelegationPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DelegationPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.kerberos.DelegationPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DelegationPermissionClassTest
implements DelegationPermissionClassTests<DelegationPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.kerberos.DelegationPermission]

    @Override
    public Class<DelegationPermission> createNewSUT() {
        return DelegationPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.kerberos.DelegationPermission#DelegationPermission(String) public
     * javax.security.auth.kerberos.DelegationPermission(java.lang.String)}.
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
    public void create_DelegationPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DelegationPermission sut = null; // = new DelegationPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.kerberos.DelegationPermission#DelegationPermission(String, String) public
     * javax.security.auth.kerberos.DelegationPermission(java.lang.String,java.lang.String)}.
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
    public void create_DelegationPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DelegationPermission sut = null; // = new DelegationPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.kerberos.DelegationPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.kerberos.DelegationPermission]

}
