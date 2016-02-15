package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.ClosedSelectorException class
 * java.nio.channels.ClosedSelectorException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ClosedSelectorExceptionClassTests}.
 * </p>
 *
 * @see java.nio.channels.ClosedSelectorException class java.nio.channels.ClosedSelectorException (the hereby targeted
 *      class-under-test class)
 * @see ClosedSelectorExceptionClassTests ClosedSelectorExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClosedSelectorExceptionTests<SUT extends java.nio.channels.ClosedSelectorException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
