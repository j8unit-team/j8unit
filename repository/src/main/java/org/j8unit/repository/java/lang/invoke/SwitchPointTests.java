package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.invoke.SwitchPoint class java.lang.invoke.SwitchPoint}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SwitchPointClassTests}.
 * </p>
 *
 * @see java.lang.invoke.SwitchPoint class java.lang.invoke.SwitchPoint (the hereby targeted class-under-test class)
 * @see SwitchPointClassTests SwitchPointClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwitchPointTests<SUT extends java.lang.invoke.SwitchPoint>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.invoke.SwitchPoint#hasBeenInvalidated() public boolean
     * java.lang.invoke.SwitchPoint.hasBeenInvalidated()}.
     *
     * <p>
     * Test method for {@link java.lang.invoke.SwitchPoint#hasBeenInvalidated() public boolean
     * java.lang.invoke.SwitchPoint.hasBeenInvalidated()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.SwitchPoint#hasBeenInvalidated() public boolean
     *      java.lang.invoke.SwitchPoint.hasBeenInvalidated() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasBeenInvalidated()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.SwitchPoint#guardWithTest(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     * public java.lang.invoke.MethodHandle
     * java.lang.invoke.SwitchPoint.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     *
     * <p>
     * Test method for
     * {@link java.lang.invoke.SwitchPoint#guardWithTest(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     * public java.lang.invoke.MethodHandle
     * java.lang.invoke.SwitchPoint.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.invoke.SwitchPoint#guardWithTest(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     *      public java.lang.invoke.MethodHandle
     *      java.lang.invoke.SwitchPoint.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_guardWithTest_MethodHandle_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
