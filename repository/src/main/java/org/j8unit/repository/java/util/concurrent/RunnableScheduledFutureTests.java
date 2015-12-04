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
 * Test class for {@link java.util.concurrent.RunnableScheduledFuture interface java.util.concurrent.RunnableScheduledFuture},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.RunnableScheduledFutureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RunnableScheduledFutureTests<SUT extends java.util.concurrent.RunnableScheduledFuture<V>, V>
extends org.j8unit.repository.java.util.concurrent.RunnableFutureTests<SUT,V>,
        org.j8unit.repository.java.util.concurrent.ScheduledFutureTests<SUT,V>
{

    /**
     * <p>
     * Test method for {@link java.util.concurrent.RunnableScheduledFuture#isPeriodic() public abstract boolean java.util.concurrent.RunnableScheduledFuture.isPeriodic()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPeriodic() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
