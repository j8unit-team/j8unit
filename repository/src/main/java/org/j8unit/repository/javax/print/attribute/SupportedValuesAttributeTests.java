package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.SupportedValuesAttribute interface
 * javax.print.attribute.SupportedValuesAttribute}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.print.attribute.SupportedValuesAttributeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.attribute.SupportedValuesAttributeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.SupportedValuesAttribute
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SupportedValuesAttributeTests<SUT extends javax.print.attribute.SupportedValuesAttribute>
extends org.j8unit.repository.javax.print.attribute.AttributeTests<SUT> {

}
