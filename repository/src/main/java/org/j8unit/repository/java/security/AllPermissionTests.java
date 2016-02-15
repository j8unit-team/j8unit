package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.AllPermission class java.security.AllPermission}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AllPermissionClassTests}.
 * </p>
 *
 * @see java.security.AllPermission class java.security.AllPermission (the hereby targeted class-under-test class)
 * @see AllPermissionClassTests AllPermissionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AllPermissionTests<SUT extends java.security.AllPermission>
extends PermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AllPermission#implies(java.security.Permission) public boolean
     * java.security.AllPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.AllPermission#implies(java.security.Permission) public boolean
     * java.security.AllPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AllPermission#implies(java.security.Permission) public boolean
     *      java.security.AllPermission.implies(java.security.Permission) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.AllPermission#getActions() public java.lang.String
     * java.security.AllPermission.getActions()}.
     *
     * <p>
     * Test method for {@link java.security.AllPermission#getActions() public java.lang.String
     * java.security.AllPermission.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AllPermission#getActions() public java.lang.String java.security.AllPermission.getActions()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AllPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.security.AllPermission.newPermissionCollection()}.
     *
     * <p>
     * Test method for {@link java.security.AllPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.security.AllPermission.newPermissionCollection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AllPermission#newPermissionCollection() public java.security.PermissionCollection
     *      java.security.AllPermission.newPermissionCollection() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_newPermissionCollection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AllPermission#hashCode() public int java.security.AllPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.AllPermission#hashCode() public int java.security.AllPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AllPermission#hashCode() public int java.security.AllPermission.hashCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AllPermission#equals(Object) public boolean
     * java.security.AllPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.AllPermission#equals(Object) public boolean
     * java.security.AllPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AllPermission#equals(Object) public boolean
     *      java.security.AllPermission.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
