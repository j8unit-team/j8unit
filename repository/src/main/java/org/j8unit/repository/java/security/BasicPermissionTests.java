package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.BasicPermission class java.security.BasicPermission}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BasicPermissionClassTests}.
 * </p>
 *
 * @see java.security.BasicPermission class java.security.BasicPermission (the hereby targeted class-under-test class)
 * @see BasicPermissionClassTests BasicPermissionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicPermissionTests<SUT extends java.security.BasicPermission>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, PermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.BasicPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.security.BasicPermission.newPermissionCollection()}.
     *
     * <p>
     * Test method for {@link java.security.BasicPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.security.BasicPermission.newPermissionCollection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.BasicPermission#newPermissionCollection() public java.security.PermissionCollection
     *      java.security.BasicPermission.newPermissionCollection() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.BasicPermission#equals(Object) public boolean
     * java.security.BasicPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.BasicPermission#equals(Object) public boolean
     * java.security.BasicPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.BasicPermission#equals(Object) public boolean
     *      java.security.BasicPermission.equals(java.lang.Object) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.security.BasicPermission#hashCode() public int
     * java.security.BasicPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.BasicPermission#hashCode() public int
     * java.security.BasicPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.BasicPermission#hashCode() public int java.security.BasicPermission.hashCode() (the hereby
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
     * Test method for {@link java.security.BasicPermission#getActions() public java.lang.String
     * java.security.BasicPermission.getActions()}.
     *
     * <p>
     * Test method for {@link java.security.BasicPermission#getActions() public java.lang.String
     * java.security.BasicPermission.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.BasicPermission#getActions() public java.lang.String
     *      java.security.BasicPermission.getActions() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.BasicPermission#implies(java.security.Permission) public boolean
     * java.security.BasicPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.security.BasicPermission#implies(java.security.Permission) public boolean
     * java.security.BasicPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.BasicPermission#implies(java.security.Permission) public boolean
     *      java.security.BasicPermission.implies(java.security.Permission) (the hereby targeted method-under-test)
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

}
