package org.j8unit.repository.java.lang.invoke;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.invoke.SwitchPoint class java.lang.invoke.SwitchPoint},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.invoke.SwitchPointClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SwitchPointTests<SUT extends java.lang.invoke.SwitchPoint>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.invoke.SwitchPoint#hasBeenInvalidated() public boolean java.lang.invoke.SwitchPoint.hasBeenInvalidated()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasBeenInvalidated() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.SwitchPoint#guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle) public java.lang.invoke.MethodHandle java.lang.invoke.SwitchPoint.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_guardWithTest_MethodHandle_MethodHandle() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
