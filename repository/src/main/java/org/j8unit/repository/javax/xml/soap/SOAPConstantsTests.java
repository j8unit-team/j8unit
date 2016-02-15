package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SOAPConstants interface javax.xml.soap.SOAPConstants}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SOAPConstantsClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SOAPConstants interface javax.xml.soap.SOAPConstants (the hereby targeted class-under-test class)
 * @see SOAPConstantsClassTests SOAPConstantsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPConstantsTests<SUT extends javax.xml.soap.SOAPConstants>
extends RepositoryTests<SUT> {

}
