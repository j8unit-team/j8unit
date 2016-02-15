package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLKeyException class javax.net.ssl.SSLKeyException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SSLKeyExceptionClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLKeyException class javax.net.ssl.SSLKeyException (the hereby targeted class-under-test class)
 * @see SSLKeyExceptionClassTests SSLKeyExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLKeyExceptionTests<SUT extends javax.net.ssl.SSLKeyException>
extends SSLExceptionTests<SUT> {

}
