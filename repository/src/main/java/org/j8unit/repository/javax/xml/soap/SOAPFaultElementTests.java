package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.SOAPFaultElement interface
 * javax.xml.soap.SOAPFaultElement}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.soap.SOAPFaultElementTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.SOAPFaultElementClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.SOAPFaultElement
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPFaultElementTests<SUT extends javax.xml.soap.SOAPFaultElement>
extends org.j8unit.repository.javax.xml.soap.SOAPElementTests<SUT> {

}
