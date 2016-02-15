package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.ParseConversionEvent interface
 * javax.xml.bind.ParseConversionEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ParseConversionEventClassTests}.
 * </p>
 *
 * @see javax.xml.bind.ParseConversionEvent interface javax.xml.bind.ParseConversionEvent (the hereby targeted
 *      class-under-test class)
 * @see ParseConversionEventClassTests ParseConversionEventClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParseConversionEventTests<SUT extends javax.xml.bind.ParseConversionEvent>
extends ValidationEventTests<SUT> {

}
