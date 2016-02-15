package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.DefaultTextUI class javax.swing.text.DefaultTextUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DefaultTextUIClassTests}.
 * </p>
 *
 * @see javax.swing.text.DefaultTextUI class javax.swing.text.DefaultTextUI (the hereby targeted class-under-test class)
 * @see DefaultTextUIClassTests DefaultTextUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTextUITests<SUT extends javax.swing.text.DefaultTextUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTextUITests<SUT> {

}
