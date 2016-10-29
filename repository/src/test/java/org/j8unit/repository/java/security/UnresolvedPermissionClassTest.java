package org.j8unit.repository.java.security;

import java.security.UnresolvedPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnresolvedPermissionClassTest
implements org.j8unit.repository.java.security.UnresolvedPermissionClassTests<UnresolvedPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.UnresolvedPermission]

    @Override
    public Class<UnresolvedPermission> createNewSUT() {
        return UnresolvedPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.UnresolvedPermission#UnresolvedPermission(String, String, String, java.security.cert.Certificate[])
     * public
     * java.security.UnresolvedPermission(java.lang.String,java.lang.String,java.lang.String,java.security.cert.Certificate[])}.
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
    public void create_UnresolvedPermission_String_String_String_CertificateArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnresolvedPermission sut = null; // = new UnresolvedPermission(String, String, String,
                                               // java.security.cert.Certificate[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.UnresolvedPermission]

}
