package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.WebServiceException class javax.xml.ws.WebServiceException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link WebServiceExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.ws.WebServiceException class javax.xml.ws.WebServiceException (the hereby targeted class-under-test
 *      class)
 * @see WebServiceExceptionClassTests WebServiceExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebServiceExceptionTests<SUT extends javax.xml.ws.WebServiceException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
