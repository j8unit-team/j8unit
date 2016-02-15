package org.j8unit.repository.java.security;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.Policy class java.security.Policy}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link PolicyClassTests}.
 * </p>
 *
 * @see java.security.Policy class java.security.Policy (the hereby targeted class-under-test class)
 * @see PolicyClassTests PolicyClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicyTests<SUT extends java.security.Policy>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.Policy#implies(java.security.ProtectionDomain, java.security.Permission)
     * public boolean java.security.Policy.implies(java.security.ProtectionDomain,java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.Policy#implies(java.security.ProtectionDomain, java.security.Permission)
     * public boolean java.security.Policy.implies(java.security.ProtectionDomain,java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#implies(java.security.ProtectionDomain, java.security.Permission) public boolean
     *      java.security.Policy.implies(java.security.ProtectionDomain,java.security.Permission) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_implies_ProtectionDomain_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#getProvider() public java.security.Provider
     * java.security.Policy.getProvider()}.
     *
     * <p>
     * Test method for {@link java.security.Policy#getProvider() public java.security.Provider
     * java.security.Policy.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#getProvider() public java.security.Provider java.security.Policy.getProvider() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#refresh() public void java.security.Policy.refresh()}.
     *
     * <p>
     * Test method for {@link java.security.Policy#refresh() public void java.security.Policy.refresh()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#refresh() public void java.security.Policy.refresh() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_refresh()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#getParameters() public java.security.Policy$Parameters
     * java.security.Policy.getParameters()}.
     *
     * <p>
     * Test method for {@link java.security.Policy#getParameters() public java.security.Policy$Parameters
     * java.security.Policy.getParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#getParameters() public java.security.Policy$Parameters
     *      java.security.Policy.getParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#getType() public java.lang.String java.security.Policy.getType()}.
     *
     * <p>
     * Test method for {@link java.security.Policy#getType() public java.lang.String java.security.Policy.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#getType() public java.lang.String java.security.Policy.getType() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#getPermissions(java.security.CodeSource) public
     * java.security.PermissionCollection java.security.Policy.getPermissions(java.security.CodeSource)}.
     *
     * <p>
     * Test method for {@link java.security.Policy#getPermissions(java.security.CodeSource) public
     * java.security.PermissionCollection java.security.Policy.getPermissions(java.security.CodeSource)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#getPermissions(java.security.CodeSource) public java.security.PermissionCollection
     *      java.security.Policy.getPermissions(java.security.CodeSource) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermissions_CodeSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.Policy#getPermissions(java.security.ProtectionDomain) public
     * java.security.PermissionCollection java.security.Policy.getPermissions(java.security.ProtectionDomain)}.
     *
     * <p>
     * Test method for {@link java.security.Policy#getPermissions(java.security.ProtectionDomain) public
     * java.security.PermissionCollection java.security.Policy.getPermissions(java.security.ProtectionDomain)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.Policy#getPermissions(java.security.ProtectionDomain) public
     *      java.security.PermissionCollection java.security.Policy.getPermissions(java.security.ProtectionDomain) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermissions_ProtectionDomain()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.Policy.Parameters interface
     * java.security.Policy$Parameters}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link PolicyClassTests.ParametersClassTests}.
     * </p>
     *
     * @see java.security.Policy.Parameters interface java.security.Policy$Parameters (the hereby targeted
     *      class-under-test class)
     * @see PolicyClassTests.ParametersClassTests PolicyClassTests.ParametersClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParametersTests<SUT extends java.security.Policy.Parameters>
    extends RepositoryTests<SUT> {

    }

}
