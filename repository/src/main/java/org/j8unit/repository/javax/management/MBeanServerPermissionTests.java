package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanServerPermission class
 * javax.management.MBeanServerPermission}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MBeanServerPermissionClassTests}.
 * </p>
 *
 * @see javax.management.MBeanServerPermission class javax.management.MBeanServerPermission (the hereby targeted
 *      class-under-test class)
 * @see MBeanServerPermissionClassTests MBeanServerPermissionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerPermissionTests<SUT extends javax.management.MBeanServerPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerPermission#newPermissionCollection() public
     * java.security.PermissionCollection javax.management.MBeanServerPermission.newPermissionCollection()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerPermission#newPermissionCollection() public
     * java.security.PermissionCollection javax.management.MBeanServerPermission.newPermissionCollection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerPermission#newPermissionCollection() public java.security.PermissionCollection
     *      javax.management.MBeanServerPermission.newPermissionCollection() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanServerPermission#equals(Object) public boolean
     * javax.management.MBeanServerPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerPermission#equals(Object) public boolean
     * javax.management.MBeanServerPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerPermission#equals(Object) public boolean
     *      javax.management.MBeanServerPermission.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanServerPermission#hashCode() public int
     * javax.management.MBeanServerPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerPermission#hashCode() public int
     * javax.management.MBeanServerPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerPermission#hashCode() public int
     *      javax.management.MBeanServerPermission.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanServerPermission#implies(java.security.Permission) public boolean
     * javax.management.MBeanServerPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerPermission#implies(java.security.Permission) public boolean
     * javax.management.MBeanServerPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerPermission#implies(java.security.Permission) public boolean
     *      javax.management.MBeanServerPermission.implies(java.security.Permission) (the hereby targeted
     *      method-under-test)
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
