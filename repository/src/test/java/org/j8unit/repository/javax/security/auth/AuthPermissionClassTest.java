package org.j8unit.repository.javax.security.auth;

import javax.security.auth.AuthPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AuthPermission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.AuthPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AuthPermissionClassTest
implements AuthPermissionClassTests<AuthPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.AuthPermission]

    @Override
    public Class<AuthPermission> createNewSUT() {
        return AuthPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.AuthPermission#AuthPermission(String) public
     * javax.security.auth.AuthPermission(java.lang.String)}.
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
    public void create_AuthPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AuthPermission sut = null; // = new AuthPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.AuthPermission#AuthPermission(String, String) public
     * javax.security.auth.AuthPermission(java.lang.String,java.lang.String)}.
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
    public void create_AuthPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AuthPermission sut = null; // = new AuthPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.AuthPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.AuthPermission]

}
