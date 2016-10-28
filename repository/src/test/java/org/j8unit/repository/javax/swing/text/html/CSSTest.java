package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.CSS;
import javax.swing.text.html.CSS.Attribute;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class CSSTest
implements FactoryBasedJ8UnitTest<CSS>, org.j8unit.repository.javax.swing.text.html.CSSTests<CSS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.CSS]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(CSS::new);
    }

    @Parameter(0)
    public Callable<CSS> sutFactory;

    @Override
    public Callable<CSS> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.CSS]

    @RunWith(J8Unit4.class)
    public static class AttributeTest
    implements org.j8unit.repository.javax.swing.text.html.CSSTests.AttributeTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.CSS$Attribute]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(Attribute.LIST_STYLE_POSITION, //
                                                       Attribute.BACKGROUND_IMAGE, //
                                                       Attribute.BORDER_RIGHT_WIDTH, //
                                                       Attribute.BACKGROUND_POSITION, //
                                                       Attribute.BORDER_BOTTOM_WIDTH, //
                                                       Attribute.BORDER_WIDTH, //
                                                       Attribute.MARGIN_TOP, //
                                                       Attribute.FONT_FAMILY, //
                                                       Attribute.DISPLAY, //
                                                       Attribute.TEXT_INDENT, //
                                                       Attribute.BORDER_BOTTOM_STYLE, //
                                                       Attribute.PADDING, //
                                                       Attribute.WIDTH, //
                                                       Attribute.LINE_HEIGHT, //
                                                       Attribute.FLOAT, //
                                                       Attribute.WORD_SPACING, //
                                                       Attribute.CLEAR, //
                                                       Attribute.TEXT_TRANSFORM, //
                                                       Attribute.BORDER_TOP_STYLE, //
                                                       Attribute.PADDING_BOTTOM, //
                                                       Attribute.BORDER_RIGHT, //
                                                       Attribute.BORDER_RIGHT_STYLE, //
                                                       Attribute.HEIGHT, //
                                                       Attribute.FONT, //
                                                       Attribute.BORDER_BOTTOM, //
                                                       Attribute.BORDER_BOTTOM_COLOR, //
                                                       Attribute.BORDER_TOP, //
                                                       Attribute.FONT_SIZE, //
                                                       Attribute.LIST_STYLE_TYPE, //
                                                       Attribute.BORDER_STYLE, //
                                                       Attribute.WHITE_SPACE, //
                                                       Attribute.BORDER_LEFT_COLOR, //
                                                       Attribute.BORDER_LEFT_WIDTH, //
                                                       Attribute.BORDER_RIGHT_COLOR, //
                                                       Attribute.TEXT_DECORATION, //
                                                       Attribute.MARGIN_LEFT, //
                                                       Attribute.PADDING_TOP, //
                                                       Attribute.COLOR, //
                                                       Attribute.BORDER_LEFT, //
                                                       Attribute.MARGIN_BOTTOM, //
                                                       Attribute.FONT_STYLE, //
                                                       Attribute.LIST_STYLE, //
                                                       Attribute.TEXT_ALIGN, //
                                                       Attribute.BORDER_COLOR, //
                                                       Attribute.BORDER_LEFT_STYLE, //
                                                       Attribute.BORDER_TOP_COLOR, //
                                                       Attribute.LIST_STYLE_IMAGE, //
                                                       Attribute.FONT_VARIANT, //
                                                       Attribute.MARGIN, //
                                                       Attribute.BORDER_TOP_WIDTH, //
                                                       Attribute.BORDER, //
                                                       Attribute.PADDING_LEFT, //
                                                       Attribute.BACKGROUND_ATTACHMENT, //
                                                       Attribute.MARGIN_RIGHT, //
                                                       Attribute.BACKGROUND_REPEAT, //
                                                       Attribute.FONT_WEIGHT, //
                                                       Attribute.LETTER_SPACING, //
                                                       Attribute.BACKGROUND, //
                                                       Attribute.BACKGROUND_COLOR, //
                                                       Attribute.PADDING_RIGHT, //
                                                       Attribute.VERTICAL_ALIGN);
        }

        @Parameter(0)
        public Attribute sut;

        @Override
        public Attribute createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.CSS$Attribute]

    }

}
