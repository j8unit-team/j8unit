package org.j8unit.repository.java.awt.geom;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.geom.IllegalPathStateException class
 * java.awt.geom.IllegalPathStateException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link IllegalPathStateExceptionClassTests}.
 * </p>
 *
 * @see java.awt.geom.IllegalPathStateException class java.awt.geom.IllegalPathStateException (the hereby targeted
 *      class-under-test class)
 * @see IllegalPathStateExceptionClassTests IllegalPathStateExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalPathStateExceptionTests<SUT extends java.awt.geom.IllegalPathStateException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
