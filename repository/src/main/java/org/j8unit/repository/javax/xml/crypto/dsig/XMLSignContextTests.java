package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.XMLSignContext interface
 * javax.xml.crypto.dsig.XMLSignContext}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link XMLSignContextClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.XMLSignContext interface javax.xml.crypto.dsig.XMLSignContext (the hereby targeted
 *      class-under-test class)
 * @see XMLSignContextClassTests XMLSignContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLSignContextTests<SUT extends javax.xml.crypto.dsig.XMLSignContext>
extends org.j8unit.repository.javax.xml.crypto.XMLCryptoContextTests<SUT> {

}
