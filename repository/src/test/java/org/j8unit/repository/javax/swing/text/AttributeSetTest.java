package org.j8unit.repository.javax.swing.text;

import javax.swing.text.AttributeSet;
import javax.swing.text.AttributeSet.CharacterAttribute;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.AttributeSet.ParagraphAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttributeSet} (by simply reusing the
 * J8Unit test interface {@link AttributeSetTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeSetTest
implements AttributeSetTests<AttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AttributeSet]

    @Override
    public AttributeSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.AttributeSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AttributeSet]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FontAttribute} (by simply reusing
     * the J8Unit test interface {@link FontAttributeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FontAttributeTest
    implements FontAttributeTests<FontAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AttributeSet$FontAttribute]

        @Override
        public FontAttribute createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.AttributeSet.FontAttribute], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AttributeSet$FontAttribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AttributeSet$FontAttribute]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorAttribute} (by simply
     * reusing the J8Unit test interface {@link ColorAttributeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ColorAttributeTest
    implements ColorAttributeTests<ColorAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AttributeSet$ColorAttribute]

        @Override
        public ColorAttribute createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.AttributeSet.ColorAttribute], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AttributeSet$ColorAttribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AttributeSet$ColorAttribute]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ParagraphAttribute} (by simply
     * reusing the J8Unit test interface {@link ParagraphAttributeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParagraphAttributeTest
    implements ParagraphAttributeTests<ParagraphAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AttributeSet$ParagraphAttribute]

        @Override
        public ParagraphAttribute createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.AttributeSet.ParagraphAttribute], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AttributeSet$ParagraphAttribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AttributeSet$ParagraphAttribute]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link CharacterAttribute} (by simply
     * reusing the J8Unit test interface {@link CharacterAttributeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CharacterAttributeTest
    implements CharacterAttributeTests<CharacterAttribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.AttributeSet$CharacterAttribute]

        @Override
        public CharacterAttribute createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.AttributeSet.CharacterAttribute], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.AttributeSet$CharacterAttribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.AttributeSet$CharacterAttribute]

    }

}
