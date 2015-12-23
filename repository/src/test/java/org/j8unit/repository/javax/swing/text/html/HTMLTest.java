package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class HTMLTest
implements org.j8unit.repository.javax.swing.text.html.HTMLTests<javax.swing.text.html.HTML> {

    @Override
    public javax.swing.text.html.HTML createNewSUT() {
        return new javax.swing.text.html.HTML();
    }

    @RunWith(J8Unit4.class)
    public static class UnknownTagTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.UnknownTagTests<javax.swing.text.html.HTML.UnknownTag> {

        @Override
        public javax.swing.text.html.HTML.UnknownTag createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.HTML.UnknownTag] available.");
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TagTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests<javax.swing.text.html.HTML.Tag> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.swing.text.html.HTML.Tag.ADDRESS, //
                                    javax.swing.text.html.HTML.Tag.SCRIPT, //
                                    javax.swing.text.html.HTML.Tag.BASEFONT, //
                                    javax.swing.text.html.HTML.Tag.BODY, //
                                    javax.swing.text.html.HTML.Tag.MAP, //
                                    javax.swing.text.html.HTML.Tag.ISINDEX, //
                                    javax.swing.text.html.HTML.Tag.META, //
                                    javax.swing.text.html.HTML.Tag.SUB, //
                                    javax.swing.text.html.HTML.Tag.IMG, //
                                    javax.swing.text.html.HTML.Tag.APPLET, //
                                    javax.swing.text.html.HTML.Tag.OBJECT, //
                                    javax.swing.text.html.HTML.Tag.SUP, //
                                    javax.swing.text.html.HTML.Tag.EM, //
                                    javax.swing.text.html.HTML.Tag.OPTION, //
                                    javax.swing.text.html.HTML.Tag.STYLE, //
                                    javax.swing.text.html.HTML.Tag.UL, //
                                    javax.swing.text.html.HTML.Tag.CENTER, //
                                    javax.swing.text.html.HTML.Tag.DT, //
                                    javax.swing.text.html.HTML.Tag.TABLE, //
                                    javax.swing.text.html.HTML.Tag.AREA, //
                                    javax.swing.text.html.HTML.Tag.IMPLIED, //
                                    javax.swing.text.html.HTML.Tag.BLOCKQUOTE, //
                                    javax.swing.text.html.HTML.Tag.NOFRAMES, //
                                    javax.swing.text.html.HTML.Tag.VAR, //
                                    javax.swing.text.html.HTML.Tag.DD, //
                                    javax.swing.text.html.HTML.Tag.TT, //
                                    javax.swing.text.html.HTML.Tag.INPUT, //
                                    javax.swing.text.html.HTML.Tag.PRE, //
                                    javax.swing.text.html.HTML.Tag.DFN, //
                                    javax.swing.text.html.HTML.Tag.DL, //
                                    javax.swing.text.html.HTML.Tag.HR, //
                                    javax.swing.text.html.HTML.Tag.HTML, //
                                    javax.swing.text.html.HTML.Tag.TH, //
                                    javax.swing.text.html.HTML.Tag.DIV, //
                                    javax.swing.text.html.HTML.Tag.TD, //
                                    javax.swing.text.html.HTML.Tag.CODE, //
                                    javax.swing.text.html.HTML.Tag.CAPTION, //
                                    javax.swing.text.html.HTML.Tag.LI, //
                                    javax.swing.text.html.HTML.Tag.STRONG, //
                                    javax.swing.text.html.HTML.Tag.TR, //
                                    javax.swing.text.html.HTML.Tag.MENU, //
                                    javax.swing.text.html.HTML.Tag.TITLE, //
                                    javax.swing.text.html.HTML.Tag.FORM, //
                                    javax.swing.text.html.HTML.Tag.BIG, //
                                    javax.swing.text.html.HTML.Tag.TEXTAREA, //
                                    javax.swing.text.html.HTML.Tag.H5, //
                                    javax.swing.text.html.HTML.Tag.DIR, //
                                    javax.swing.text.html.HTML.Tag.H4, //
                                    javax.swing.text.html.HTML.Tag.SPAN, //
                                    javax.swing.text.html.HTML.Tag.FONT, //
                                    javax.swing.text.html.HTML.Tag.H6, //
                                    javax.swing.text.html.HTML.Tag.SELECT, //
                                    javax.swing.text.html.HTML.Tag.H1, //
                                    javax.swing.text.html.HTML.Tag.H3, //
                                    javax.swing.text.html.HTML.Tag.PARAM, //
                                    javax.swing.text.html.HTML.Tag.H2, //
                                    javax.swing.text.html.HTML.Tag.U, //
                                    javax.swing.text.html.HTML.Tag.SAMP, //
                                    javax.swing.text.html.HTML.Tag.BR, //
                                    javax.swing.text.html.HTML.Tag.P, //
                                    javax.swing.text.html.HTML.Tag.S, //
                                    javax.swing.text.html.HTML.Tag.SMALL, //
                                    javax.swing.text.html.HTML.Tag.OL, //
                                    javax.swing.text.html.HTML.Tag.LINK, //
                                    javax.swing.text.html.HTML.Tag.CONTENT, //
                                    javax.swing.text.html.HTML.Tag.STRIKE, //
                                    javax.swing.text.html.HTML.Tag.A, //
                                    javax.swing.text.html.HTML.Tag.HEAD, //
                                    javax.swing.text.html.HTML.Tag.B, //
                                    javax.swing.text.html.HTML.Tag.FRAME, //
                                    javax.swing.text.html.HTML.Tag.FRAMESET, //
                                    javax.swing.text.html.HTML.Tag.KBD, //
                                    javax.swing.text.html.HTML.Tag.BASE, //
                                    javax.swing.text.html.HTML.Tag.COMMENT, //
                                    javax.swing.text.html.HTML.Tag.I, //
                                    javax.swing.text.html.HTML.Tag.CITE);
        }

        @Parameter(0)
        public javax.swing.text.html.HTML.Tag sut;

        @Override
        public javax.swing.text.html.HTML.Tag createNewSUT() {
            return this.sut;
        }

        /**
         * {@code new HTML.Tag().toString()} returns {@code null} illegally.
         */
        @Override
        @Test
        @Category(JavaBug.class)
        public void toStringMustReturnNotNull() {
            org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests.super.toStringMustReturnNotNull();
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AttributeTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLTests.AttributeTests<javax.swing.text.html.HTML.Attribute> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.swing.text.html.HTML.Attribute.CODEBASE, //
                                    javax.swing.text.html.HTML.Attribute.ALIGN, //
                                    javax.swing.text.html.HTML.Attribute.LINK, //
                                    javax.swing.text.html.HTML.Attribute.CONTENT, //
                                    javax.swing.text.html.HTML.Attribute.CLASSID, //
                                    javax.swing.text.html.HTML.Attribute.CODETYPE, //
                                    javax.swing.text.html.HTML.Attribute.CELLPADDING, //
                                    javax.swing.text.html.HTML.Attribute.MARGINWIDTH, //
                                    javax.swing.text.html.HTML.Attribute.SRC, //
                                    javax.swing.text.html.HTML.Attribute.SHAPES, //
                                    javax.swing.text.html.HTML.Attribute.NOSHADE, //
                                    javax.swing.text.html.HTML.Attribute.BGCOLOR, //
                                    javax.swing.text.html.HTML.Attribute.PROMPT, //
                                    javax.swing.text.html.HTML.Attribute.USEMAP, //
                                    javax.swing.text.html.HTML.Attribute.WIDTH, //
                                    javax.swing.text.html.HTML.Attribute.COORDS, //
                                    javax.swing.text.html.HTML.Attribute.LANG, //
                                    javax.swing.text.html.HTML.Attribute.COLSPAN, //
                                    javax.swing.text.html.HTML.Attribute.N, //
                                    javax.swing.text.html.HTML.Attribute.COMMENT, //
                                    javax.swing.text.html.HTML.Attribute.COMPACT, //
                                    javax.swing.text.html.HTML.Attribute.DECLARE, //
                                    javax.swing.text.html.HTML.Attribute.CODE, //
                                    javax.swing.text.html.HTML.Attribute.ACTION, //
                                    javax.swing.text.html.HTML.Attribute.ENDTAG, //
                                    javax.swing.text.html.HTML.Attribute.ISMAP, //
                                    javax.swing.text.html.HTML.Attribute.NOHREF, //
                                    javax.swing.text.html.HTML.Attribute.REL, //
                                    javax.swing.text.html.HTML.Attribute.VERSION, //
                                    javax.swing.text.html.HTML.Attribute.TITLE, //
                                    javax.swing.text.html.HTML.Attribute.START, //
                                    javax.swing.text.html.HTML.Attribute.ROWSPAN, //
                                    javax.swing.text.html.HTML.Attribute.FACE, //
                                    javax.swing.text.html.HTML.Attribute.MARGINHEIGHT, //
                                    javax.swing.text.html.HTML.Attribute.ROWS, //
                                    javax.swing.text.html.HTML.Attribute.CLEAR, //
                                    javax.swing.text.html.HTML.Attribute.HEIGHT, //
                                    javax.swing.text.html.HTML.Attribute.DIR, //
                                    javax.swing.text.html.HTML.Attribute.COLS, //
                                    javax.swing.text.html.HTML.Attribute.DUMMY, //
                                    javax.swing.text.html.HTML.Attribute.FRAMEBORDER, //
                                    javax.swing.text.html.HTML.Attribute.NOWRAP, //
                                    javax.swing.text.html.HTML.Attribute.COLOR, //
                                    javax.swing.text.html.HTML.Attribute.ARCHIVE, //
                                    javax.swing.text.html.HTML.Attribute.ID, //
                                    javax.swing.text.html.HTML.Attribute.TYPE, //
                                    javax.swing.text.html.HTML.Attribute.TARGET, //
                                    javax.swing.text.html.HTML.Attribute.REV, //
                                    javax.swing.text.html.HTML.Attribute.ALT, //
                                    javax.swing.text.html.HTML.Attribute.HALIGN, //
                                    javax.swing.text.html.HTML.Attribute.VALUETYPE, //
                                    javax.swing.text.html.HTML.Attribute.VALUE, //
                                    javax.swing.text.html.HTML.Attribute.CLASS, //
                                    javax.swing.text.html.HTML.Attribute.ENCTYPE, //
                                    javax.swing.text.html.HTML.Attribute.TEXT, //
                                    javax.swing.text.html.HTML.Attribute.HREF, //
                                    javax.swing.text.html.HTML.Attribute.HSPACE, //
                                    javax.swing.text.html.HTML.Attribute.CHECKED, //
                                    javax.swing.text.html.HTML.Attribute.ALINK, //
                                    javax.swing.text.html.HTML.Attribute.VLINK, //
                                    javax.swing.text.html.HTML.Attribute.MULTIPLE, //
                                    javax.swing.text.html.HTML.Attribute.SELECTED, //
                                    javax.swing.text.html.HTML.Attribute.BORDER, //
                                    javax.swing.text.html.HTML.Attribute.SHAPE, //
                                    javax.swing.text.html.HTML.Attribute.DATA, //
                                    javax.swing.text.html.HTML.Attribute.VALIGN, //
                                    javax.swing.text.html.HTML.Attribute.STANDBY, //
                                    javax.swing.text.html.HTML.Attribute.METHOD, //
                                    javax.swing.text.html.HTML.Attribute.NORESIZE, //
                                    javax.swing.text.html.HTML.Attribute.LANGUAGE, //
                                    javax.swing.text.html.HTML.Attribute.LOWSRC, //
                                    javax.swing.text.html.HTML.Attribute.SIZE, //
                                    javax.swing.text.html.HTML.Attribute.VSPACE, //
                                    javax.swing.text.html.HTML.Attribute.STYLE, //
                                    javax.swing.text.html.HTML.Attribute.SCROLLING, //
                                    javax.swing.text.html.HTML.Attribute.MAXLENGTH, //
                                    javax.swing.text.html.HTML.Attribute.CELLSPACING, //
                                    javax.swing.text.html.HTML.Attribute.HTTPEQUIV, //
                                    javax.swing.text.html.HTML.Attribute.BACKGROUND, //
                                    javax.swing.text.html.HTML.Attribute.NAME);
        }

        @Parameter(0)
        public javax.swing.text.html.HTML.Attribute sut;

        @Override
        public javax.swing.text.html.HTML.Attribute createNewSUT() {
            return this.sut;
        }

    }

}
