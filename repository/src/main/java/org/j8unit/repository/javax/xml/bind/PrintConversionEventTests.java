package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.PrintConversionEvent interface
 * javax.xml.bind.PrintConversionEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link PrintConversionEventClassTests}.
 * </p>
 *
 * @see javax.xml.bind.PrintConversionEvent interface javax.xml.bind.PrintConversionEvent (the hereby targeted
 *      class-under-test class)
 * @see PrintConversionEventClassTests PrintConversionEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintConversionEventTests<SUT extends javax.xml.bind.PrintConversionEvent>
extends ValidationEventTests<SUT> {

}
