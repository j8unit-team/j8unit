package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertStoreException class
 * java.security.cert.CertStoreException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CertStoreExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertStoreException class java.security.cert.CertStoreException (the hereby targeted
 *      class-under-test class)
 * @see CertStoreExceptionClassTests CertStoreExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertStoreExceptionTests<SUT extends java.security.cert.CertStoreException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
