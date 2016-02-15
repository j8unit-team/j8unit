package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SOAPBodyElement interface javax.xml.soap.SOAPBodyElement}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link SOAPBodyElementClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SOAPBodyElement interface javax.xml.soap.SOAPBodyElement (the hereby targeted class-under-test
 *      class)
 * @see SOAPBodyElementClassTests SOAPBodyElementClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPBodyElementTests<SUT extends javax.xml.soap.SOAPBodyElement>
extends SOAPElementTests<SUT> {

}
