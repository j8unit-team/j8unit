package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.invoke.CallSite class java.lang.invoke.CallSite}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CallSiteClassTests}.
 * </p>
 *
 * @see java.lang.invoke.CallSite class java.lang.invoke.CallSite (the hereby targeted class-under-test class)
 * @see CallSiteClassTests CallSiteClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CallSiteTests<SUT extends java.lang.invoke.CallSite>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#getTarget() public abstract java.lang.invoke.MethodHandle
     * java.lang.invoke.CallSite.getTarget()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#getTarget() public abstract java.lang.invoke.MethodHandle
     * java.lang.invoke.CallSite.getTarget()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.CallSite#getTarget() public abstract java.lang.invoke.MethodHandle
     *      java.lang.invoke.CallSite.getTarget() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#type() public java.lang.invoke.MethodType
     * java.lang.invoke.CallSite.type()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#type() public java.lang.invoke.MethodType
     * java.lang.invoke.CallSite.type()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.CallSite#type() public java.lang.invoke.MethodType java.lang.invoke.CallSite.type() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#dynamicInvoker() public abstract java.lang.invoke.MethodHandle
     * java.lang.invoke.CallSite.dynamicInvoker()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#dynamicInvoker() public abstract java.lang.invoke.MethodHandle
     * java.lang.invoke.CallSite.dynamicInvoker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.CallSite#dynamicInvoker() public abstract java.lang.invoke.MethodHandle
     *      java.lang.invoke.CallSite.dynamicInvoker() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dynamicInvoker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#setTarget(java.lang.invoke.MethodHandle) public abstract void
     * java.lang.invoke.CallSite.setTarget(java.lang.invoke.MethodHandle)}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.CallSite#setTarget(java.lang.invoke.MethodHandle) public abstract void
     * java.lang.invoke.CallSite.setTarget(java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.CallSite#setTarget(java.lang.invoke.MethodHandle) public abstract void
     *      java.lang.invoke.CallSite.setTarget(java.lang.invoke.MethodHandle) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTarget_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
