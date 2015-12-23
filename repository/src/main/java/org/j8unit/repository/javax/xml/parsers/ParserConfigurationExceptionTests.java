package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.parsers.ParserConfigurationException class
 * javax.xml.parsers.ParserConfigurationException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.xml.parsers.ParserConfigurationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.parsers.ParserConfigurationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.parsers.ParserConfigurationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserConfigurationExceptionTests<SUT extends javax.xml.parsers.ParserConfigurationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
