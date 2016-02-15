package org.j8unit.repository.javax.swing.colorchooser;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.colorchooser.ColorChooserComponentFactory class
 * javax.swing.colorchooser.ColorChooserComponentFactory}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ColorChooserComponentFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.colorchooser.ColorChooserComponentFactory class
 *      javax.swing.colorchooser.ColorChooserComponentFactory (the hereby targeted class-under-test class)
 * @see ColorChooserComponentFactoryClassTests ColorChooserComponentFactoryClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ColorChooserComponentFactoryTests<SUT extends javax.swing.colorchooser.ColorChooserComponentFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
