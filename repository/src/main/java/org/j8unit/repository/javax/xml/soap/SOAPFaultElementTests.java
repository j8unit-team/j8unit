package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPFaultElement;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link SOAPFaultElement public abstract interface javax.xml.soap.SOAPFaultElement}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.soap.SOAPFaultElementClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPFaultElementTests<SUT extends SOAPFaultElement>
extends org.j8unit.repository.javax.xml.soap.SOAPElementTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPFaultElement]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SOAPFaultElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SOAPFaultElement]
}
