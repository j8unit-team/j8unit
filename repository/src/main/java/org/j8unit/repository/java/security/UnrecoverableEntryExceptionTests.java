package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.UnrecoverableEntryException class
 * java.security.UnrecoverableEntryException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnrecoverableEntryExceptionClassTests}.
 * </p>
 *
 * @see java.security.UnrecoverableEntryException class java.security.UnrecoverableEntryException (the hereby targeted
 *      class-under-test class)
 * @see UnrecoverableEntryExceptionClassTests UnrecoverableEntryExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnrecoverableEntryExceptionTests<SUT extends java.security.UnrecoverableEntryException>
extends GeneralSecurityExceptionTests<SUT> {

}
