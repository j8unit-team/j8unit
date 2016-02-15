package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.NoSuchPaddingException class
 * javax.crypto.NoSuchPaddingException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NoSuchPaddingExceptionClassTests}.
 * </p>
 *
 * @see javax.crypto.NoSuchPaddingException class javax.crypto.NoSuchPaddingException (the hereby targeted
 *      class-under-test class)
 * @see NoSuchPaddingExceptionClassTests NoSuchPaddingExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchPaddingExceptionTests<SUT extends javax.crypto.NoSuchPaddingException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
