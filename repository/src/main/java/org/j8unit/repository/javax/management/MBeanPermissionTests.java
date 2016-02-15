package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanPermission class javax.management.MBeanPermission}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link MBeanPermissionClassTests}.
 * </p>
 *
 * @see javax.management.MBeanPermission class javax.management.MBeanPermission (the hereby targeted class-under-test
 *      class)
 * @see MBeanPermissionClassTests MBeanPermissionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanPermissionTests<SUT extends javax.management.MBeanPermission>
extends org.j8unit.repository.java.security.PermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanPermission#getActions() public java.lang.String
     * javax.management.MBeanPermission.getActions()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanPermission#getActions() public java.lang.String
     * javax.management.MBeanPermission.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanPermission#getActions() public java.lang.String
     *      javax.management.MBeanPermission.getActions() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanPermission#implies(java.security.Permission) public boolean
     * javax.management.MBeanPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanPermission#implies(java.security.Permission) public boolean
     * javax.management.MBeanPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanPermission#implies(java.security.Permission) public boolean
     *      javax.management.MBeanPermission.implies(java.security.Permission) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanPermission#hashCode() public int
     * javax.management.MBeanPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanPermission#hashCode() public int
     * javax.management.MBeanPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanPermission#hashCode() public int javax.management.MBeanPermission.hashCode() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.management.MBeanPermission#equals(Object) public boolean
     * javax.management.MBeanPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanPermission#equals(Object) public boolean
     * javax.management.MBeanPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanPermission#equals(Object) public boolean
     *      javax.management.MBeanPermission.equals(java.lang.Object) (the hereby targeted method-under-test)
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
