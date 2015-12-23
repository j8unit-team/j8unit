package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.soap.SOAPConstants interface javax.xml.soap.SOAPConstants},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.soap.SOAPConstantsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.soap.SOAPConstantsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.soap.SOAPConstants
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPConstantsTests<SUT extends javax.xml.soap.SOAPConstants>
extends RepositoryTests<SUT> {

}
