package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.invoke.SwitchPoint class java.lang.invoke.SwitchPoint}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.invoke.SwitchPointClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SwitchPointTests<SUT extends java.lang.invoke.SwitchPoint>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.SwitchPoint#guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)
     * public java.lang.invoke.MethodHandle
     * java.lang.invoke.SwitchPoint.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link java.lang.invoke.SwitchPoint#hasBeenInvalidated() public boolean
     * java.lang.invoke.SwitchPoint.hasBeenInvalidated()}.
     * </p>
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

}
