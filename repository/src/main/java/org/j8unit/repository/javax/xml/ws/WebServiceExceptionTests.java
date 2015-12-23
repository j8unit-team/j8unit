package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.WebServiceException class
 * javax.xml.ws.WebServiceException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.WebServiceExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.WebServiceExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.WebServiceException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceExceptionTests<SUT extends javax.xml.ws.WebServiceException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
