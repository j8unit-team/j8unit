package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.BorderFactory class javax.swing.BorderFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BorderFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.BorderFactory class javax.swing.BorderFactory (the hereby targeted class-under-test class)
 * @see BorderFactoryClassTests BorderFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BorderFactoryTests<SUT extends javax.swing.BorderFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
