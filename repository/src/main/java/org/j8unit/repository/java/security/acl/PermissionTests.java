package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.Permission interface java.security.acl.Permission}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PermissionClassTests}.
 * </p>
 *
 * @see java.security.acl.Permission interface java.security.acl.Permission (the hereby targeted class-under-test class)
 * @see PermissionClassTests PermissionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PermissionTests<SUT extends java.security.acl.Permission>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.acl.Permission#equals(Object) public abstract boolean
     * java.security.acl.Permission.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.acl.Permission#equals(Object) public abstract boolean
     * java.security.acl.Permission.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Permission#equals(Object) public abstract boolean
     *      java.security.acl.Permission.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.security.acl.Permission#toString() public abstract java.lang.String
     * java.security.acl.Permission.toString()}.
     *
     * <p>
     * Test method for {@link java.security.acl.Permission#toString() public abstract java.lang.String
     * java.security.acl.Permission.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.acl.Permission#toString() public abstract java.lang.String
     *      java.security.acl.Permission.toString() (the hereby targeted method-under-test)
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

}
