package org.j8unit.repository.javax.security.cert;

import javax.security.cert.CertificateEncodingException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link CertificateEncodingException public class javax.security.cert.CertificateEncodingException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.security.cert.CertificateEncodingExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateEncodingExceptionTests<SUT extends CertificateEncodingException>
extends CertificateExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.cert.CertificateEncodingException]

}
