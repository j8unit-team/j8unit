package org.j8unit.repository.javax.swing.text.html.parser;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.parser.DTDConstants interface
 * javax.swing.text.html.parser.DTDConstants}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DTDConstantsClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.parser.DTDConstants interface javax.swing.text.html.parser.DTDConstants (the hereby
 *      targeted class-under-test class)
 * @see DTDConstantsClassTests DTDConstantsClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DTDConstantsTests<SUT extends javax.swing.text.html.parser.DTDConstants>
extends RepositoryTests<SUT> {

}
