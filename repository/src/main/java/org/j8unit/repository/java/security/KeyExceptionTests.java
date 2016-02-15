package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.KeyException class java.security.KeyException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyExceptionClassTests}.
 * </p>
 *
 * @see java.security.KeyException class java.security.KeyException (the hereby targeted class-under-test class)
 * @see KeyExceptionClassTests KeyExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyExceptionTests<SUT extends java.security.KeyException>
extends GeneralSecurityExceptionTests<SUT> {

}
