package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.URLPermission class java.net.URLPermission}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link URLPermissionClassTests}.
 * </p>
 *
 * @see java.net.URLPermission class java.net.URLPermission (the hereby targeted class-under-test class)
 * @see URLPermissionClassTests URLPermissionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URLPermissionTests<SUT extends java.net.URLPermission>
extends org.j8unit.repository.java.security.PermissionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.URLPermission#hashCode() public int java.net.URLPermission.hashCode()}.
     *
     * <p>
     * Test method for {@link java.net.URLPermission#hashCode() public int java.net.URLPermission.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLPermission#hashCode() public int java.net.URLPermission.hashCode() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.net.URLPermission#equals(Object) public boolean
     * java.net.URLPermission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.net.URLPermission#equals(Object) public boolean
     * java.net.URLPermission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLPermission#equals(Object) public boolean java.net.URLPermission.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.net.URLPermission#implies(java.security.Permission) public boolean
     * java.net.URLPermission.implies(java.security.Permission)}.
     *
     * <p>
     * Test method for {@link java.net.URLPermission#implies(java.security.Permission) public boolean
     * java.net.URLPermission.implies(java.security.Permission)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLPermission#implies(java.security.Permission) public boolean
     *      java.net.URLPermission.implies(java.security.Permission) (the hereby targeted method-under-test)
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
     * Test method for {@link java.net.URLPermission#getActions() public java.lang.String
     * java.net.URLPermission.getActions()}.
     *
     * <p>
     * Test method for {@link java.net.URLPermission#getActions() public java.lang.String
     * java.net.URLPermission.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.URLPermission#getActions() public java.lang.String java.net.URLPermission.getActions() (the hereby
     *      targeted method-under-test)
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

}
