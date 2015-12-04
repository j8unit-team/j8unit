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
 * Test class for {@link java.util.concurrent.ScheduledFuture interface java.util.concurrent.ScheduledFuture},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ScheduledFutureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ScheduledFutureTests<SUT extends java.util.concurrent.ScheduledFuture<V>, V>
extends org.j8unit.repository.java.util.concurrent.DelayedTests<SUT>,
        org.j8unit.repository.java.util.concurrent.FutureTests<SUT,V>
{

}
