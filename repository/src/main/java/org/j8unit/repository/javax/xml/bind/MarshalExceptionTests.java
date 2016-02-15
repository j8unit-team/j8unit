package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.MarshalException class javax.xml.bind.MarshalException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link MarshalExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.bind.MarshalException class javax.xml.bind.MarshalException (the hereby targeted class-under-test
 *      class)
 * @see MarshalExceptionClassTests MarshalExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MarshalExceptionTests<SUT extends javax.xml.bind.MarshalException>
extends JAXBExceptionTests<SUT> {

}
