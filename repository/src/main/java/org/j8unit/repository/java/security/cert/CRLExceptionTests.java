package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CRLException class java.security.cert.CRLException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link CRLExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CRLException class java.security.cert.CRLException (the hereby targeted class-under-test
 *      class)
 * @see CRLExceptionClassTests CRLExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CRLExceptionTests<SUT extends java.security.cert.CRLException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
