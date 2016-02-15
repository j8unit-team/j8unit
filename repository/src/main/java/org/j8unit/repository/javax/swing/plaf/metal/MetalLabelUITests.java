package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalLabelUI class
 * javax.swing.plaf.metal.MetalLabelUI}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MetalLabelUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalLabelUI class javax.swing.plaf.metal.MetalLabelUI (the hereby targeted
 *      class-under-test class)
 * @see MetalLabelUIClassTests MetalLabelUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalLabelUITests<SUT extends javax.swing.plaf.metal.MetalLabelUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicLabelUITests<SUT> {

}
