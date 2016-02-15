package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.InvalidKeySpecException class
 * java.security.spec.InvalidKeySpecException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidKeySpecExceptionClassTests}.
 * </p>
 *
 * @see java.security.spec.InvalidKeySpecException class java.security.spec.InvalidKeySpecException (the hereby targeted
 *      class-under-test class)
 * @see InvalidKeySpecExceptionClassTests InvalidKeySpecExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidKeySpecExceptionTests<SUT extends java.security.spec.InvalidKeySpecException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
