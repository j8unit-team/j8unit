package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CSSTest
implements org.j8unit.repository.javax.swing.text.html.CSSTests<javax.swing.text.html.CSS> {

    @Override
    public javax.swing.text.html.CSS createNewSUT() {
        return new javax.swing.text.html.CSS();
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AttributeTest
    implements org.j8unit.repository.javax.swing.text.html.CSSTests.AttributeTests<javax.swing.text.html.CSS.Attribute> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.swing.text.html.CSS.Attribute.LIST_STYLE_POSITION, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND_IMAGE, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_RIGHT_WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND_POSITION, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_BOTTOM_WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.MARGIN_TOP, //
                                    javax.swing.text.html.CSS.Attribute.FONT_FAMILY, //
                                    javax.swing.text.html.CSS.Attribute.DISPLAY, //
                                    javax.swing.text.html.CSS.Attribute.TEXT_INDENT, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_BOTTOM_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.PADDING, //
                                    javax.swing.text.html.CSS.Attribute.WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.LINE_HEIGHT, //
                                    javax.swing.text.html.CSS.Attribute.FLOAT, //
                                    javax.swing.text.html.CSS.Attribute.WORD_SPACING, //
                                    javax.swing.text.html.CSS.Attribute.CLEAR, //
                                    javax.swing.text.html.CSS.Attribute.TEXT_TRANSFORM, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_TOP_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.PADDING_BOTTOM, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_RIGHT, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_RIGHT_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.HEIGHT, //
                                    javax.swing.text.html.CSS.Attribute.FONT, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_BOTTOM, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_BOTTOM_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_TOP, //
                                    javax.swing.text.html.CSS.Attribute.FONT_SIZE, //
                                    javax.swing.text.html.CSS.Attribute.LIST_STYLE_TYPE, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.WHITE_SPACE, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_LEFT_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_LEFT_WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_RIGHT_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.TEXT_DECORATION, //
                                    javax.swing.text.html.CSS.Attribute.MARGIN_LEFT, //
                                    javax.swing.text.html.CSS.Attribute.PADDING_TOP, //
                                    javax.swing.text.html.CSS.Attribute.COLOR, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_LEFT, //
                                    javax.swing.text.html.CSS.Attribute.MARGIN_BOTTOM, //
                                    javax.swing.text.html.CSS.Attribute.FONT_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.LIST_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.TEXT_ALIGN, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_LEFT_STYLE, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_TOP_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.LIST_STYLE_IMAGE, //
                                    javax.swing.text.html.CSS.Attribute.FONT_VARIANT, //
                                    javax.swing.text.html.CSS.Attribute.MARGIN, //
                                    javax.swing.text.html.CSS.Attribute.BORDER_TOP_WIDTH, //
                                    javax.swing.text.html.CSS.Attribute.BORDER, //
                                    javax.swing.text.html.CSS.Attribute.PADDING_LEFT, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND_ATTACHMENT, //
                                    javax.swing.text.html.CSS.Attribute.MARGIN_RIGHT, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND_REPEAT, //
                                    javax.swing.text.html.CSS.Attribute.FONT_WEIGHT, //
                                    javax.swing.text.html.CSS.Attribute.LETTER_SPACING, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND, //
                                    javax.swing.text.html.CSS.Attribute.BACKGROUND_COLOR, //
                                    javax.swing.text.html.CSS.Attribute.PADDING_RIGHT, //
                                    javax.swing.text.html.CSS.Attribute.VERTICAL_ALIGN);
        }

        @Parameter(0)
        public javax.swing.text.html.CSS.Attribute sut;

        @Override
        public javax.swing.text.html.CSS.Attribute createNewSUT() {
            return this.sut;
        }

    }

}
