package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicIconFactory class
 * javax.swing.plaf.basic.BasicIconFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BasicIconFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicIconFactory class javax.swing.plaf.basic.BasicIconFactory (the hereby targeted
 *      class-under-test class)
 * @see BasicIconFactoryClassTests BasicIconFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicIconFactoryTests<SUT extends javax.swing.plaf.basic.BasicIconFactory>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
