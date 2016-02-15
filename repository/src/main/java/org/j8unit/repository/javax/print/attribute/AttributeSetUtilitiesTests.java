package org.j8unit.repository.javax.print.attribute;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.attribute.AttributeSetUtilities class
 * javax.print.attribute.AttributeSetUtilities}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AttributeSetUtilitiesClassTests}.
 * </p>
 *
 * @see javax.print.attribute.AttributeSetUtilities class javax.print.attribute.AttributeSetUtilities (the hereby
 *      targeted class-under-test class)
 * @see AttributeSetUtilitiesClassTests AttributeSetUtilitiesClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeSetUtilitiesTests<SUT extends javax.print.attribute.AttributeSetUtilities>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
