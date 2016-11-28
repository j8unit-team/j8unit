package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AttributeSet;
import javax.swing.text.AttributeSet.CharacterAttribute;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.AttributeSet.ParagraphAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.AttributeSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttributeSetClassTest
implements AttributeSetClassTests<AttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet]

    @Override
    public Class<AttributeSet> createNewSUT() {
        return AttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FontAttribute} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FontAttributeClassTest
    implements FontAttributeClassTests<FontAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$FontAttribute]

        @Override
        public Class<FontAttribute> createNewSUT() {
            return FontAttribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AttributeSet$FontAttribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$FontAttribute]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ParagraphAttribute} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ParagraphAttributeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ParagraphAttributeClassTest
    implements ParagraphAttributeClassTests<ParagraphAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$ParagraphAttribute]

        @Override
        public Class<ParagraphAttribute> createNewSUT() {
            return ParagraphAttribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AttributeSet$ParagraphAttribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$ParagraphAttribute]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ColorAttribute} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ColorAttributeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ColorAttributeClassTest
    implements ColorAttributeClassTests<ColorAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$ColorAttribute]

        @Override
        public Class<ColorAttribute> createNewSUT() {
            return ColorAttribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AttributeSet$ColorAttribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$ColorAttribute]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CharacterAttribute} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CharacterAttributeClassTest
    implements CharacterAttributeClassTests<CharacterAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$CharacterAttribute]

        @Override
        public Class<CharacterAttribute> createNewSUT() {
            return CharacterAttribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.AttributeSet$CharacterAttribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$CharacterAttribute]

    }

}
