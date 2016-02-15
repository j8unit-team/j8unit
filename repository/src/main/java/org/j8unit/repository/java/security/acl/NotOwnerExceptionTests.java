package org.j8unit.repository.java.security.acl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.acl.NotOwnerException class
 * java.security.acl.NotOwnerException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NotOwnerExceptionClassTests}.
 * </p>
 *
 * @see java.security.acl.NotOwnerException class java.security.acl.NotOwnerException (the hereby targeted
 *      class-under-test class)
 * @see NotOwnerExceptionClassTests NotOwnerExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotOwnerExceptionTests<SUT extends java.security.acl.NotOwnerException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
