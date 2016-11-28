package org.j8unit.repository.java.awt.font;

import java.awt.font.TextAttribute;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link TextAttribute
 * public final class java.awt.font.TextAttribute}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.awt.font.TextAttributeClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextAttributeTests<SUT extends TextAttribute>
extends AttributeTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextAttribute]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.TextAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.TextAttribute]

}
