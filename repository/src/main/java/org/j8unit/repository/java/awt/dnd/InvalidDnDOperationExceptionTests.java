package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.dnd.InvalidDnDOperationException class
 * java.awt.dnd.InvalidDnDOperationException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidDnDOperationExceptionClassTests}.
 * </p>
 *
 * @see java.awt.dnd.InvalidDnDOperationException class java.awt.dnd.InvalidDnDOperationException (the hereby targeted
 *      class-under-test class)
 * @see InvalidDnDOperationExceptionClassTests InvalidDnDOperationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidDnDOperationExceptionTests<SUT extends java.awt.dnd.InvalidDnDOperationException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
