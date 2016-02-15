package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.datatype.DatatypeConfigurationException class
 * javax.xml.datatype.DatatypeConfigurationException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link DatatypeConfigurationExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.datatype.DatatypeConfigurationException class javax.xml.datatype.DatatypeConfigurationException (the
 *      hereby targeted class-under-test class)
 * @see DatatypeConfigurationExceptionClassTests DatatypeConfigurationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConfigurationExceptionTests<SUT extends javax.xml.datatype.DatatypeConfigurationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
