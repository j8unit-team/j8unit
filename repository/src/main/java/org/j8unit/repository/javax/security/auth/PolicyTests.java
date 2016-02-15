package org.j8unit.repository.javax.security.auth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.Policy class javax.security.auth.Policy}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PolicyClassTests}.
 * </p>
 *
 * @see javax.security.auth.Policy class javax.security.auth.Policy (the hereby targeted class-under-test class)
 * @see PolicyClassTests PolicyClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicyTests<SUT extends javax.security.auth.Policy>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.Policy#getPermissions(javax.security.auth.Subject, java.security.CodeSource) public
     * abstract java.security.PermissionCollection
     * javax.security.auth.Policy.getPermissions(javax.security.auth.Subject,java.security.CodeSource)}.
     *
     * <p>
     * Test method for
     * {@link javax.security.auth.Policy#getPermissions(javax.security.auth.Subject, java.security.CodeSource) public
     * abstract java.security.PermissionCollection
     * javax.security.auth.Policy.getPermissions(javax.security.auth.Subject,java.security.CodeSource)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Policy#getPermissions(javax.security.auth.Subject, java.security.CodeSource) public
     *      abstract java.security.PermissionCollection
     *      javax.security.auth.Policy.getPermissions(javax.security.auth.Subject,java.security.CodeSource) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPermissions_Subject_CodeSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Policy#refresh() public abstract void
     * javax.security.auth.Policy.refresh()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Policy#refresh() public abstract void
     * javax.security.auth.Policy.refresh()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Policy#refresh() public abstract void javax.security.auth.Policy.refresh() (the hereby
     *      targeted method-under-test)
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

}
