package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.NoSuchProviderException class
 * java.security.NoSuchProviderException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NoSuchProviderExceptionClassTests}.
 * </p>
 *
 * @see java.security.NoSuchProviderException class java.security.NoSuchProviderException (the hereby targeted
 *      class-under-test class)
 * @see NoSuchProviderExceptionClassTests NoSuchProviderExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchProviderExceptionTests<SUT extends java.security.NoSuchProviderException>
extends GeneralSecurityExceptionTests<SUT> {

}
