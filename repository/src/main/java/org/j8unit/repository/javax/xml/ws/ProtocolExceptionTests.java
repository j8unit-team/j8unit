package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.ProtocolException class javax.xml.ws.ProtocolException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.ProtocolExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.ProtocolException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProtocolExceptionTests<SUT extends javax.xml.ws.ProtocolException>
extends org.j8unit.repository.javax.xml.ws.WebServiceExceptionTests<SUT> {

}
