package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AttributeSet;
import javax.swing.text.AttributeSet.CharacterAttribute;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.AttributeSet.ParagraphAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeSetClassTest
implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests<AttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet]

    @Override
    public Class<AttributeSet> createNewSUT() {
        return AttributeSet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet]

    @RunWith(J8Unit4.class)
    public static class CharacterAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests<CharacterAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$CharacterAttribute]

        @Override
        public Class<CharacterAttribute> createNewSUT() {
            return CharacterAttribute.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$CharacterAttribute]

    }

    @RunWith(J8Unit4.class)
    public static class ColorAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ColorAttributeClassTests<ColorAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$ColorAttribute]

        @Override
        public Class<ColorAttribute> createNewSUT() {
            return ColorAttribute.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$ColorAttribute]

    }

    @RunWith(J8Unit4.class)
    public static class ParagraphAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ParagraphAttributeClassTests<ParagraphAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$ParagraphAttribute]

        @Override
        public Class<ParagraphAttribute> createNewSUT() {
            return ParagraphAttribute.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$ParagraphAttribute]

    }

    @RunWith(J8Unit4.class)
    public static class FontAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests<FontAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.AttributeSet$FontAttribute]

        @Override
        public Class<FontAttribute> createNewSUT() {
            return FontAttribute.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.AttributeSet$FontAttribute]

    }

}
