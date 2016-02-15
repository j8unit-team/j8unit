package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.parsers.ParserConfigurationException class
 * javax.xml.parsers.ParserConfigurationException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ParserConfigurationExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.parsers.ParserConfigurationException class javax.xml.parsers.ParserConfigurationException (the hereby
 *      targeted class-under-test class)
 * @see ParserConfigurationExceptionClassTests ParserConfigurationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserConfigurationExceptionTests<SUT extends javax.xml.parsers.ParserConfigurationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
