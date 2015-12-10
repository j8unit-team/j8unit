package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleConstantsClassTest
implements org.j8unit.repository.javax.swing.text.StyleConstantsClassTests<javax.swing.text.StyleConstants> {

    @RunWith(J8Unit4.class)
    public static class CharacterConstantsClassTest
    implements
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.CharacterConstantsClassTests<javax.swing.text.StyleConstants.CharacterConstants> {

        @Override
        public Class<javax.swing.text.StyleConstants.CharacterConstants> createNewSUT() {
            return javax.swing.text.StyleConstants.CharacterConstants.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ColorConstantsClassTest
    implements org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ColorConstantsClassTests<javax.swing.text.StyleConstants.ColorConstants> {

        @Override
        public Class<javax.swing.text.StyleConstants.ColorConstants> createNewSUT() {
            return javax.swing.text.StyleConstants.ColorConstants.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FontConstantsClassTest
    implements org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.FontConstantsClassTests<javax.swing.text.StyleConstants.FontConstants> {

        @Override
        public Class<javax.swing.text.StyleConstants.FontConstants> createNewSUT() {
            return javax.swing.text.StyleConstants.FontConstants.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParagraphConstantsClassTest
    implements
    org.j8unit.repository.javax.swing.text.StyleConstantsClassTests.ParagraphConstantsClassTests<javax.swing.text.StyleConstants.ParagraphConstants> {

        @Override
        public Class<javax.swing.text.StyleConstants.ParagraphConstants> createNewSUT() {
            return javax.swing.text.StyleConstants.ParagraphConstants.class;
        }

    }

    @Override
    public Class<javax.swing.text.StyleConstants> createNewSUT() {
        return javax.swing.text.StyleConstants.class;
    }

}
