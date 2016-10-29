package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.font.TextAttribute;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TextAttributeTest
implements org.j8unit.repository.java.awt.font.TextAttributeTests<TextAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextAttribute]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TextAttribute.SIZE, //
                                TextAttribute.SWAP_COLORS, //
                                TextAttribute.INPUT_METHOD_UNDERLINE, //
                                TextAttribute.NUMERIC_SHAPING, //
                                TextAttribute.FONT, //
                                TextAttribute.FAMILY, //
                                TextAttribute.BACKGROUND, //
                                TextAttribute.UNDERLINE, //
                                TextAttribute.WIDTH, //
                                TextAttribute.INPUT_METHOD_HIGHLIGHT, //
                                TextAttribute.TRACKING, //
                                TextAttribute.STRIKETHROUGH, //
                                TextAttribute.JUSTIFICATION, //
                                TextAttribute.KERNING, //
                                TextAttribute.POSTURE, //
                                TextAttribute.SUPERSCRIPT, //
                                TextAttribute.CHAR_REPLACEMENT, //
                                TextAttribute.BIDI_EMBEDDING, //
                                TextAttribute.RUN_DIRECTION, //
                                TextAttribute.FOREGROUND, //
                                TextAttribute.WEIGHT, //
                                TextAttribute.TRANSFORM, //
                                TextAttribute.LIGATURES);
    }

    @Parameter(0)
    public TextAttribute sut;

    @Override
    public TextAttribute createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextAttribute]

}
