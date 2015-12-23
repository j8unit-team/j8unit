package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.XMLSignContext interface
 * javax.xml.crypto.dsig.XMLSignContext}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.XMLSignContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLSignContextTests<SUT extends javax.xml.crypto.dsig.XMLSignContext>
extends org.j8unit.repository.javax.xml.crypto.XMLCryptoContextTests<SUT> {

}
