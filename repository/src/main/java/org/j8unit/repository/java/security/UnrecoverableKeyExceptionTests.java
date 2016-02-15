package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.UnrecoverableKeyException class
 * java.security.UnrecoverableKeyException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnrecoverableKeyExceptionClassTests}.
 * </p>
 *
 * @see java.security.UnrecoverableKeyException class java.security.UnrecoverableKeyException (the hereby targeted
 *      class-under-test class)
 * @see UnrecoverableKeyExceptionClassTests UnrecoverableKeyExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnrecoverableKeyExceptionTests<SUT extends java.security.UnrecoverableKeyException>
extends UnrecoverableEntryExceptionTests<SUT> {

}
