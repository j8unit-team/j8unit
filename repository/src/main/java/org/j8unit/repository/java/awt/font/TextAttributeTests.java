package org.j8unit.repository.java.awt.font;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.font.TextAttribute class java.awt.font.TextAttribute},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.font.TextAttributeTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.font.TextAttributeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.font.TextAttribute
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextAttributeTests<SUT extends java.awt.font.TextAttribute>
extends org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests<SUT> {

}
