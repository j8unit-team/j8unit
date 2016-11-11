package org.j8unit.repository.java.security;

import java.security.ProtectionDomain;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProtectionDomain} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.ProtectionDomainClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProtectionDomainClassTest
implements ProtectionDomainClassTests<ProtectionDomain> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.ProtectionDomain]

    @Override
    public Class<ProtectionDomain> createNewSUT() {
        return ProtectionDomain.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProtectionDomain#ProtectionDomain(java.security.CodeSource, java.security.PermissionCollection)
     * public java.security.ProtectionDomain(java.security.CodeSource,java.security.PermissionCollection)}.
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
    public void create_ProtectionDomain_CodeSource_PermissionCollection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProtectionDomain sut = null; // = new ProtectionDomain(java.security.CodeSource,
                                           // java.security.PermissionCollection);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.ProtectionDomain#ProtectionDomain(java.security.CodeSource, java.security.PermissionCollection, ClassLoader, java.security.Principal[])
     * public
     * java.security.ProtectionDomain(java.security.CodeSource,java.security.PermissionCollection,java.lang.ClassLoader,java.security.Principal[])}.
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
    public void create_ProtectionDomain_CodeSource_PermissionCollection_ClassLoader_PrincipalArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProtectionDomain sut = null; // = new ProtectionDomain(java.security.CodeSource,
                                           // java.security.PermissionCollection, ClassLoader,
                                           // java.security.Principal[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.ProtectionDomain]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.ProtectionDomain]

}
