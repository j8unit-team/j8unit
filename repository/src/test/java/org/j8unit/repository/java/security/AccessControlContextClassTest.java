package org.j8unit.repository.java.security;

import java.security.AccessControlContext;
import java.security.DomainCombiner;
import java.security.ProtectionDomain;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessControlContextClassTest
implements org.j8unit.repository.java.security.AccessControlContextClassTests<AccessControlContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AccessControlContext]

    @Override
    public Class<AccessControlContext> createNewSUT() {
        return AccessControlContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AccessControlContext#AccessControlContext(ProtectionDomain[]) public
     * java.security.AccessControlContext(java.security.ProtectionDomain[])}.
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
    public void create_AccessControlContext_ProtectionDomainArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessControlContext sut = null; // = new AccessControlContext(ProtectionDomain[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AccessControlContext#AccessControlContext(AccessControlContext, DomainCombiner) public
     * java.security.AccessControlContext(java.security.AccessControlContext,java.security.DomainCombiner)}.
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
    public void create_AccessControlContext_AccessControlContext_DomainCombiner()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessControlContext sut = null; // = new AccessControlContext(AccessControlContext, DomainCombiner);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AccessControlContext]

}
