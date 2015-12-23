package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.invoke.MutableCallSite class
 * java.lang.invoke.MutableCallSite}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.invoke.MutableCallSiteTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.invoke.MutableCallSiteClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.invoke.MutableCallSite
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MutableCallSiteTests<SUT extends java.lang.invoke.MutableCallSite>
extends org.j8unit.repository.java.lang.invoke.CallSiteTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#dynamicInvoker() public final
     * java.lang.invoke.MethodHandle java.lang.invoke.MutableCallSite.dynamicInvoker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MutableCallSite#dynamicInvoker()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_dynamicInvoker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#getTarget() public final java.lang.invoke.MethodHandle
     * java.lang.invoke.MutableCallSite.getTarget()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MutableCallSite#getTarget()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MutableCallSite#setTarget(java.lang.invoke.MethodHandle) public void
     * java.lang.invoke.MutableCallSite.setTarget(java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MutableCallSite#setTarget(java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setTarget_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
