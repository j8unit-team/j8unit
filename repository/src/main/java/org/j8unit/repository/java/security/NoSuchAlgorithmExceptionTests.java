package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.NoSuchAlgorithmException class
 * java.security.NoSuchAlgorithmException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NoSuchAlgorithmExceptionClassTests}.
 * </p>
 *
 * @see java.security.NoSuchAlgorithmException class java.security.NoSuchAlgorithmException (the hereby targeted
 *      class-under-test class)
 * @see NoSuchAlgorithmExceptionClassTests NoSuchAlgorithmExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchAlgorithmExceptionTests<SUT extends java.security.NoSuchAlgorithmException>
extends GeneralSecurityExceptionTests<SUT> {

}
