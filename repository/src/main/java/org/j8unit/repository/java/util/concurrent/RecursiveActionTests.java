package org.j8unit.repository.java.util.concurrent;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.concurrent.RecursiveAction class java.util.concurrent.RecursiveAction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.RecursiveActionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RecursiveActionTests<SUT extends java.util.concurrent.RecursiveAction>
extends org.j8unit.repository.java.util.concurrent.ForkJoinTaskTests<SUT,java.lang.Void>
{

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RecursiveAction#getRawResult() public final java.lang.Void java.util.concurrent.RecursiveAction.getRawResult()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRawResult() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
