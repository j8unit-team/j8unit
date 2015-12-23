package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.PrintRequestAttribute interface
 * javax.print.attribute.PrintRequestAttribute}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.attribute.PrintRequestAttributeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.PrintRequestAttribute
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintRequestAttributeTests<SUT extends javax.print.attribute.PrintRequestAttribute>
extends org.j8unit.repository.javax.print.attribute.AttributeTests<SUT> {

}
