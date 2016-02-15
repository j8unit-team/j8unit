package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.InvalidAlgorithmParameterException class
 * java.security.InvalidAlgorithmParameterException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidAlgorithmParameterExceptionClassTests}.
 * </p>
 *
 * @see java.security.InvalidAlgorithmParameterException class java.security.InvalidAlgorithmParameterException (the
 *      hereby targeted class-under-test class)
 * @see InvalidAlgorithmParameterExceptionClassTests InvalidAlgorithmParameterExceptionClassTests (the complementary
 *      j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidAlgorithmParameterExceptionTests<SUT extends java.security.InvalidAlgorithmParameterException>
extends GeneralSecurityExceptionTests<SUT> {

}
