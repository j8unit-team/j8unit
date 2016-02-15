package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.AccessControlContext class
 * java.security.AccessControlContext}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link AccessControlContextClassTests}.
 * </p>
 *
 * @see java.security.AccessControlContext class java.security.AccessControlContext (the hereby targeted
 *      class-under-test class)
 * @see AccessControlContextClassTests AccessControlContextClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessControlContextTests<SUT extends java.security.AccessControlContext>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AccessControlContext#checkPermission(java.security.Permission) public void
     * java.security.AccessControlContext.checkPermission(java.security.Permission) throws
     * java.security.AccessControlException}.
     *
     * <p>
     * Test method for {@link java.security.AccessControlContext#checkPermission(java.security.Permission) public void
     * java.security.AccessControlContext.checkPermission(java.security.Permission) throws
     * java.security.AccessControlException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AccessControlContext#checkPermission(java.security.Permission) public void
     *      java.security.AccessControlContext.checkPermission(java.security.Permission) throws
     *      java.security.AccessControlException (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.AccessControlContext#hashCode() public int
     * java.security.AccessControlContext.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.AccessControlContext#hashCode() public int
     * java.security.AccessControlContext.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AccessControlContext#hashCode() public int java.security.AccessControlContext.hashCode() (the
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
     * Test method for {@link java.security.AccessControlContext#equals(Object) public boolean
     * java.security.AccessControlContext.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.AccessControlContext#equals(Object) public boolean
     * java.security.AccessControlContext.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AccessControlContext#equals(Object) public boolean
     *      java.security.AccessControlContext.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.AccessControlContext#getDomainCombiner() public java.security.DomainCombiner
     * java.security.AccessControlContext.getDomainCombiner()}.
     *
     * <p>
     * Test method for {@link java.security.AccessControlContext#getDomainCombiner() public java.security.DomainCombiner
     * java.security.AccessControlContext.getDomainCombiner()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.AccessControlContext#getDomainCombiner() public java.security.DomainCombiner
     *      java.security.AccessControlContext.getDomainCombiner() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDomainCombiner()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
