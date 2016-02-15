package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.AclEntry interface java.security.acl.AclEntry}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AclEntryClassTests}.
 * </p>
 *
 * @see java.security.acl.AclEntry interface java.security.acl.AclEntry (the hereby targeted class-under-test class)
 * @see AclEntryClassTests AclEntryClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AclEntryTests<SUT extends java.security.acl.AclEntry>
extends org.j8unit.repository.java.lang.CloneableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#setNegativePermissions() public abstract void
     * java.security.acl.AclEntry.setNegativePermissions()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#setNegativePermissions() public abstract void
     * java.security.acl.AclEntry.setNegativePermissions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#setNegativePermissions() public abstract void
     *      java.security.acl.AclEntry.setNegativePermissions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNegativePermissions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#removePermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.removePermission(java.security.acl.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#removePermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.removePermission(java.security.acl.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#removePermission(java.security.acl.Permission) public abstract boolean
     *      java.security.acl.AclEntry.removePermission(java.security.acl.Permission) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePermission_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#toString() public abstract java.lang.String
     * java.security.acl.AclEntry.toString()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#toString() public abstract java.lang.String
     * java.security.acl.AclEntry.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#toString() public abstract java.lang.String java.security.acl.AclEntry.toString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.security.acl.AclEntry#clone() public abstract java.lang.Object
     * java.security.acl.AclEntry.clone()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#clone() public abstract java.lang.Object
     * java.security.acl.AclEntry.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#clone() public abstract java.lang.Object java.security.acl.AclEntry.clone() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#addPermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.addPermission(java.security.acl.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#addPermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.addPermission(java.security.acl.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#addPermission(java.security.acl.Permission) public abstract boolean
     *      java.security.acl.AclEntry.addPermission(java.security.acl.Permission) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPermission_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#permissions() public abstract java.util.Enumeration
     * <java.security.acl.Permission> java.security.acl.AclEntry.permissions()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#permissions() public abstract java.util.Enumeration
     * java.security.acl.AclEntry.permissions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#permissions() public abstract java.util.Enumeration
     *      java.security.acl.AclEntry.permissions() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permissions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#setPrincipal(java.security.Principal) public abstract boolean
     * java.security.acl.AclEntry.setPrincipal(java.security.Principal)}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#setPrincipal(java.security.Principal) public abstract boolean
     * java.security.acl.AclEntry.setPrincipal(java.security.Principal)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#setPrincipal(java.security.Principal) public abstract boolean
     *      java.security.acl.AclEntry.setPrincipal(java.security.Principal) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPrincipal_Principal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#getPrincipal() public abstract java.security.Principal
     * java.security.acl.AclEntry.getPrincipal()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#getPrincipal() public abstract java.security.Principal
     * java.security.acl.AclEntry.getPrincipal()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#getPrincipal() public abstract java.security.Principal
     *      java.security.acl.AclEntry.getPrincipal() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrincipal()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#checkPermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.checkPermission(java.security.acl.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#checkPermission(java.security.acl.Permission) public abstract
     * boolean java.security.acl.AclEntry.checkPermission(java.security.acl.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#checkPermission(java.security.acl.Permission) public abstract boolean
     *      java.security.acl.AclEntry.checkPermission(java.security.acl.Permission) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPermission_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.acl.AclEntry#isNegative() public abstract boolean
     * java.security.acl.AclEntry.isNegative()}.
     *
     * <p>
     * Test method for {@link java.security.acl.AclEntry#isNegative() public abstract boolean
     * java.security.acl.AclEntry.isNegative()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.AclEntry#isNegative() public abstract boolean java.security.acl.AclEntry.isNegative() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNegative()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
