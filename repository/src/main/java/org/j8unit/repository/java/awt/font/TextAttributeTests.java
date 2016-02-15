package org.j8unit.repository.java.awt.font;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.font.TextAttribute class java.awt.font.TextAttribute}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TextAttributeClassTests}.
 * </p>
 *
 * @see java.awt.font.TextAttribute class java.awt.font.TextAttribute (the hereby targeted class-under-test class)
 * @see TextAttributeClassTests TextAttributeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextAttributeTests<SUT extends java.awt.font.TextAttribute>
extends org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests<SUT> {

}
