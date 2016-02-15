package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SSLHandshakeException class
 * javax.net.ssl.SSLHandshakeException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SSLHandshakeExceptionClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SSLHandshakeException class javax.net.ssl.SSLHandshakeException (the hereby targeted
 *      class-under-test class)
 * @see SSLHandshakeExceptionClassTests SSLHandshakeExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLHandshakeExceptionTests<SUT extends javax.net.ssl.SSLHandshakeException>
extends SSLExceptionTests<SUT> {

}
