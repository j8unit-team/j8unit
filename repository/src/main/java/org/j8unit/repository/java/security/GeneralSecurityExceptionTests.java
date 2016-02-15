package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.GeneralSecurityException class
 * java.security.GeneralSecurityException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link GeneralSecurityExceptionClassTests}.
 * </p>
 *
 * @see java.security.GeneralSecurityException class java.security.GeneralSecurityException (the hereby targeted
 *      class-under-test class)
 * @see GeneralSecurityExceptionClassTests GeneralSecurityExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GeneralSecurityExceptionTests<SUT extends java.security.GeneralSecurityException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
