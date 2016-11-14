package org.j8unit.repository.java.security;

import java.security.SecurityPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SecurityPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.SecurityPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SecurityPermissionClassTest
implements SecurityPermissionClassTests<SecurityPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.SecurityPermission]

    @Override
    public Class<SecurityPermission> createNewSUT() {
        return SecurityPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SecurityPermission#SecurityPermission(String) public
     * java.security.SecurityPermission(java.lang.String)}.
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
    public void create_SecurityPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecurityPermission sut = null; // = new SecurityPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.SecurityPermission#SecurityPermission(String, String) public
     * java.security.SecurityPermission(java.lang.String,java.lang.String)}.
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
    public void create_SecurityPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SecurityPermission sut = null; // = new SecurityPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.SecurityPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.SecurityPermission]

}
