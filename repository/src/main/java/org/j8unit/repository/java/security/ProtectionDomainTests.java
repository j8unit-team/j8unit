package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.ProtectionDomain class java.security.ProtectionDomain}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ProtectionDomainClassTests}.
 * </p>
 *
 * @see java.security.ProtectionDomain class java.security.ProtectionDomain (the hereby targeted class-under-test class)
 * @see ProtectionDomainClassTests ProtectionDomainClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProtectionDomainTests<SUT extends java.security.ProtectionDomain>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getPermissions() public final
     * java.security.PermissionCollection java.security.ProtectionDomain.getPermissions()}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getPermissions() public final
     * java.security.PermissionCollection java.security.ProtectionDomain.getPermissions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#getPermissions() public final java.security.PermissionCollection
     *      java.security.ProtectionDomain.getPermissions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermissions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getCodeSource() public final java.security.CodeSource
     * java.security.ProtectionDomain.getCodeSource()}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getCodeSource() public final java.security.CodeSource
     * java.security.ProtectionDomain.getCodeSource()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#getCodeSource() public final java.security.CodeSource
     *      java.security.ProtectionDomain.getCodeSource() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCodeSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#implies(java.security.Permission) public boolean
     * java.security.ProtectionDomain.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#implies(java.security.Permission) public boolean
     * java.security.ProtectionDomain.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#implies(java.security.Permission) public boolean
     *      java.security.ProtectionDomain.implies(java.security.Permission) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_implies_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getPrincipals() public final java.security.Principal[]
     * java.security.ProtectionDomain.getPrincipals()}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getPrincipals() public final java.security.Principal[]
     * java.security.ProtectionDomain.getPrincipals()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#getPrincipals() public final java.security.Principal[]
     *      java.security.ProtectionDomain.getPrincipals() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrincipals()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#toString() public java.lang.String
     * java.security.ProtectionDomain.toString()}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#toString() public java.lang.String
     * java.security.ProtectionDomain.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#toString() public java.lang.String java.security.ProtectionDomain.toString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getClassLoader() public final java.lang.ClassLoader
     * java.security.ProtectionDomain.getClassLoader()}.
     *
     * <p>
     * Test method for {@link java.security.ProtectionDomain#getClassLoader() public final java.lang.ClassLoader
     * java.security.ProtectionDomain.getClassLoader()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.ProtectionDomain#getClassLoader() public final java.lang.ClassLoader
     *      java.security.ProtectionDomain.getClassLoader() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassLoader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
