package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.SOAPBodyElement interface
 * javax.xml.soap.SOAPBodyElement}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.soap.SOAPBodyElementTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.SOAPBodyElementClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.SOAPBodyElement
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPBodyElementTests<SUT extends javax.xml.soap.SOAPBodyElement>
extends org.j8unit.repository.javax.xml.soap.SOAPElementTests<SUT> {

}
