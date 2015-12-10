package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeSetClassTest
implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests<javax.swing.text.AttributeSet> {

    @RunWith(J8Unit4.class)
    public static class CharacterAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.CharacterAttributeClassTests<javax.swing.text.AttributeSet.CharacterAttribute> {

        @Override
        public Class<javax.swing.text.AttributeSet.CharacterAttribute> createNewSUT() {
            return javax.swing.text.AttributeSet.CharacterAttribute.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ColorAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ColorAttributeClassTests<javax.swing.text.AttributeSet.ColorAttribute> {

        @Override
        public Class<javax.swing.text.AttributeSet.ColorAttribute> createNewSUT() {
            return javax.swing.text.AttributeSet.ColorAttribute.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FontAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.FontAttributeClassTests<javax.swing.text.AttributeSet.FontAttribute> {

        @Override
        public Class<javax.swing.text.AttributeSet.FontAttribute> createNewSUT() {
            return javax.swing.text.AttributeSet.FontAttribute.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParagraphAttributeClassTest
    implements org.j8unit.repository.javax.swing.text.AttributeSetClassTests.ParagraphAttributeClassTests<javax.swing.text.AttributeSet.ParagraphAttribute> {

        @Override
        public Class<javax.swing.text.AttributeSet.ParagraphAttribute> createNewSUT() {
            return javax.swing.text.AttributeSet.ParagraphAttribute.class;
        }

    }

    @Override
    public Class<javax.swing.text.AttributeSet> createNewSUT() {
        return javax.swing.text.AttributeSet.class;
    }

}
