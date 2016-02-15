package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.invoke.ConstantCallSite class java.lang.invoke.ConstantCallSite}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link ConstantCallSiteClassTests}
 * .
 * </p>
 *
 * @see java.lang.invoke.ConstantCallSite class java.lang.invoke.ConstantCallSite (the hereby targeted class-under-test
 *      class)
 * @see ConstantCallSiteClassTests ConstantCallSiteClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConstantCallSiteTests<SUT extends java.lang.invoke.ConstantCallSite>
extends CallSiteTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.invoke.ConstantCallSite#dynamicInvoker() public final
     * java.lang.invoke.MethodHandle java.lang.invoke.ConstantCallSite.dynamicInvoker()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.ConstantCallSite#dynamicInvoker() public final
     * java.lang.invoke.MethodHandle java.lang.invoke.ConstantCallSite.dynamicInvoker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.ConstantCallSite#dynamicInvoker() public final java.lang.invoke.MethodHandle
     *      java.lang.invoke.ConstantCallSite.dynamicInvoker() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.lang.invoke.ConstantCallSite#setTarget(java.lang.invoke.MethodHandle) public final
     * void java.lang.invoke.ConstantCallSite.setTarget(java.lang.invoke.MethodHandle)}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.ConstantCallSite#setTarget(java.lang.invoke.MethodHandle) public final
     * void java.lang.invoke.ConstantCallSite.setTarget(java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.ConstantCallSite#setTarget(java.lang.invoke.MethodHandle) public final void
     *      java.lang.invoke.ConstantCallSite.setTarget(java.lang.invoke.MethodHandle) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setTarget_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.ConstantCallSite#getTarget() public final java.lang.invoke.MethodHandle
     * java.lang.invoke.ConstantCallSite.getTarget()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.ConstantCallSite#getTarget() public final java.lang.invoke.MethodHandle
     * java.lang.invoke.ConstantCallSite.getTarget()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.ConstantCallSite#getTarget() public final java.lang.invoke.MethodHandle
     *      java.lang.invoke.ConstantCallSite.getTarget() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
