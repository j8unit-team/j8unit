package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTML.Attribute;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTML.UnknownTag;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class HTMLTest
implements FactoryBasedJ8UnitTest<HTML>, HTMLTests<HTML> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTML]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(HTML::new);
    }

    @Parameter(0)
    public Callable<HTML> sutFactory;

    @Override
    public Callable<HTML> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTML]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTML]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Attribute} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.HTMLTests.AttributeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AttributeTest
    implements AttributeTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTML$Attribute]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(Attribute.CODEBASE, //
                                                       Attribute.ALIGN, //
                                                       Attribute.LINK, //
                                                       Attribute.CONTENT, //
                                                       Attribute.CLASSID, //
                                                       Attribute.CODETYPE, //
                                                       Attribute.CELLPADDING, //
                                                       Attribute.MARGINWIDTH, //
                                                       Attribute.SRC, //
                                                       Attribute.SHAPES, //
                                                       Attribute.NOSHADE, //
                                                       Attribute.BGCOLOR, //
                                                       Attribute.PROMPT, //
                                                       Attribute.USEMAP, //
                                                       Attribute.WIDTH, //
                                                       Attribute.COORDS, //
                                                       Attribute.LANG, //
                                                       Attribute.COLSPAN, //
                                                       Attribute.N, //
                                                       Attribute.COMMENT, //
                                                       Attribute.COMPACT, //
                                                       Attribute.DECLARE, //
                                                       Attribute.CODE, //
                                                       Attribute.ACTION, //
                                                       Attribute.ENDTAG, //
                                                       Attribute.ISMAP, //
                                                       Attribute.NOHREF, //
                                                       Attribute.REL, //
                                                       Attribute.VERSION, //
                                                       Attribute.TITLE, //
                                                       Attribute.START, //
                                                       Attribute.ROWSPAN, //
                                                       Attribute.FACE, //
                                                       Attribute.MARGINHEIGHT, //
                                                       Attribute.ROWS, //
                                                       Attribute.CLEAR, //
                                                       Attribute.HEIGHT, //
                                                       Attribute.DIR, //
                                                       Attribute.COLS, //
                                                       Attribute.DUMMY, //
                                                       Attribute.FRAMEBORDER, //
                                                       Attribute.NOWRAP, //
                                                       Attribute.COLOR, //
                                                       Attribute.ARCHIVE, //
                                                       Attribute.ID, //
                                                       Attribute.TYPE, //
                                                       Attribute.TARGET, //
                                                       Attribute.REV, //
                                                       Attribute.ALT, //
                                                       Attribute.HALIGN, //
                                                       Attribute.VALUETYPE, //
                                                       Attribute.VALUE, //
                                                       Attribute.CLASS, //
                                                       Attribute.ENCTYPE, //
                                                       Attribute.TEXT, //
                                                       Attribute.HREF, //
                                                       Attribute.HSPACE, //
                                                       Attribute.CHECKED, //
                                                       Attribute.ALINK, //
                                                       Attribute.VLINK, //
                                                       Attribute.MULTIPLE, //
                                                       Attribute.SELECTED, //
                                                       Attribute.BORDER, //
                                                       Attribute.SHAPE, //
                                                       Attribute.DATA, //
                                                       Attribute.VALIGN, //
                                                       Attribute.STANDBY, //
                                                       Attribute.METHOD, //
                                                       Attribute.NORESIZE, //
                                                       Attribute.LANGUAGE, //
                                                       Attribute.LOWSRC, //
                                                       Attribute.SIZE, //
                                                       Attribute.VSPACE, //
                                                       Attribute.STYLE, //
                                                       Attribute.SCROLLING, //
                                                       Attribute.MAXLENGTH, //
                                                       Attribute.CELLSPACING, //
                                                       Attribute.HTTPEQUIV, //
                                                       Attribute.BACKGROUND, //
                                                       Attribute.NAME);
        }

        @Parameter(0)
        public Attribute sut;

        @Override
        public Attribute createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTML$Attribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTML$Attribute]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Tag} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TagTest
    implements TagTests<Tag> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTML$Tag]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(/* new Tag(), */ //
                                                       Tag.ADDRESS, //
                                                       Tag.SCRIPT, //
                                                       Tag.BASEFONT, //
                                                       Tag.BODY, //
                                                       Tag.MAP, //
                                                       Tag.ISINDEX, //
                                                       Tag.META, //
                                                       Tag.SUB, //
                                                       Tag.IMG, //
                                                       Tag.APPLET, //
                                                       Tag.OBJECT, //
                                                       Tag.SUP, //
                                                       Tag.EM, //
                                                       Tag.OPTION, //
                                                       Tag.STYLE, //
                                                       Tag.UL, //
                                                       Tag.CENTER, //
                                                       Tag.DT, //
                                                       Tag.TABLE, //
                                                       Tag.AREA, //
                                                       Tag.IMPLIED, //
                                                       Tag.BLOCKQUOTE, //
                                                       Tag.NOFRAMES, //
                                                       Tag.VAR, //
                                                       Tag.DD, //
                                                       Tag.TT, //
                                                       Tag.INPUT, //
                                                       Tag.PRE, //
                                                       Tag.DFN, //
                                                       Tag.DL, //
                                                       Tag.HR, //
                                                       Tag.HTML, //
                                                       Tag.TH, //
                                                       Tag.DIV, //
                                                       Tag.TD, //
                                                       Tag.CODE, //
                                                       Tag.CAPTION, //
                                                       Tag.LI, //
                                                       Tag.STRONG, //
                                                       Tag.TR, //
                                                       Tag.MENU, //
                                                       Tag.TITLE, //
                                                       Tag.FORM, //
                                                       Tag.BIG, //
                                                       Tag.TEXTAREA, //
                                                       Tag.H5, //
                                                       Tag.DIR, //
                                                       Tag.H4, //
                                                       Tag.SPAN, //
                                                       Tag.FONT, //
                                                       Tag.H6, //
                                                       Tag.SELECT, //
                                                       Tag.H1, //
                                                       Tag.H3, //
                                                       Tag.PARAM, //
                                                       Tag.H2, //
                                                       Tag.U, //
                                                       Tag.SAMP, //
                                                       Tag.BR, //
                                                       Tag.P, //
                                                       Tag.S, //
                                                       Tag.SMALL, //
                                                       Tag.OL, //
                                                       Tag.LINK, //
                                                       Tag.CONTENT, //
                                                       Tag.STRIKE, //
                                                       Tag.A, //
                                                       Tag.HEAD, //
                                                       Tag.B, //
                                                       Tag.FRAME, //
                                                       Tag.FRAMESET, //
                                                       Tag.KBD, //
                                                       Tag.BASE, //
                                                       Tag.COMMENT, //
                                                       Tag.I, //
                                                       Tag.CITE);
        }

        @Parameter(0)
        public Tag sut;

        @Override
        public Tag createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTML$Tag]

        /**
         * @see HTMLBugs.TagBugs#toStringReturnsNull() {@code new HTML.Tag().toString()} returns {@code null} illegally!
         *
         * @since 0.9.4
         */
        @Override
        public void toStringMustReturnNotNull() {
            HTMLTests.TagTests.super.toStringMustReturnNotNull();
        }

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTML$Tag]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownTag} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.HTMLTests.UnknownTagTests}).
     */

    @RunWith(J8Unit4.class)
    public static class UnknownTagTest
    implements UnknownTagTests<UnknownTag> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.HTML$UnknownTag]

        @Override
        public UnknownTag createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.HTML.UnknownTag], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.HTML$UnknownTag]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.HTML$UnknownTag]

    }

}
