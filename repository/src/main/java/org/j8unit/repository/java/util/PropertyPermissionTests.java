package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.PropertyPermission class java.util.PropertyPermission}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PropertyPermissionClassTests}.
 * </p>
 *
 * @see java.util.PropertyPermission class java.util.PropertyPermission (the hereby targeted class-under-test class)
 * @see PropertyPermissionClassTests PropertyPermissionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyPermissionTests<SUT extends java.util.PropertyPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.PropertyPermission#implies(java.security.Permission) public boolean
     * java.util.PropertyPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.util.PropertyPermission#implies(java.security.Permission) public boolean
     * java.util.PropertyPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PropertyPermission#implies(java.security.Permission) public boolean
     *      java.util.PropertyPermission.implies(java.security.Permission) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.PropertyPermission#getActions() public java.lang.String
     * java.util.PropertyPermission.getActions()}.
     *
     * <p>
     * Test method for {@link java.util.PropertyPermission#getActions() public java.lang.String
     * java.util.PropertyPermission.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PropertyPermission#getActions() public java.lang.String java.util.PropertyPermission.getActions()
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
     * Test method for {@link java.util.PropertyPermission#equals(Object) public boolean
     * java.util.PropertyPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.PropertyPermission#equals(Object) public boolean
     * java.util.PropertyPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PropertyPermission#equals(Object) public boolean
     *      java.util.PropertyPermission.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.PropertyPermission#hashCode() public int
     * java.util.PropertyPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.PropertyPermission#hashCode() public int
     * java.util.PropertyPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PropertyPermission#hashCode() public int java.util.PropertyPermission.hashCode() (the hereby
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
     * Test method for {@link java.util.PropertyPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.util.PropertyPermission.newPermissionCollection()}.
     *
     * <p>
     * Test method for {@link java.util.PropertyPermission#newPermissionCollection() public
     * java.security.PermissionCollection java.util.PropertyPermission.newPermissionCollection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PropertyPermission#newPermissionCollection() public java.security.PermissionCollection
     *      java.util.PropertyPermission.newPermissionCollection() (the hereby targeted method-under-test)
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

}
