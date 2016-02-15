package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.attribute.SupportedValuesAttribute interface
 * javax.print.attribute.SupportedValuesAttribute}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link SupportedValuesAttributeClassTests}.
 * </p>
 *
 * @see javax.print.attribute.SupportedValuesAttribute interface javax.print.attribute.SupportedValuesAttribute (the
 *      hereby targeted class-under-test class)
 * @see SupportedValuesAttributeClassTests SupportedValuesAttributeClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SupportedValuesAttributeTests<SUT extends javax.print.attribute.SupportedValuesAttribute>
extends AttributeTests<SUT> {

}
