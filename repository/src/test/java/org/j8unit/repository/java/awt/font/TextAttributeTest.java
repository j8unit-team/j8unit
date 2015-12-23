package org.j8unit.repository.java.awt.font;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TextAttributeTest
implements org.j8unit.repository.java.awt.font.TextAttributeTests<java.awt.font.TextAttribute> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.font.TextAttribute.SIZE, //
                                java.awt.font.TextAttribute.SWAP_COLORS, //
                                java.awt.font.TextAttribute.INPUT_METHOD_UNDERLINE, //
                                java.awt.font.TextAttribute.NUMERIC_SHAPING, //
                                java.awt.font.TextAttribute.FONT, //
                                java.awt.font.TextAttribute.FAMILY, //
                                java.awt.font.TextAttribute.BACKGROUND, //
                                java.awt.font.TextAttribute.UNDERLINE, //
                                java.awt.font.TextAttribute.WIDTH, //
                                java.awt.font.TextAttribute.INPUT_METHOD_HIGHLIGHT, //
                                java.awt.font.TextAttribute.TRACKING, //
                                java.awt.font.TextAttribute.STRIKETHROUGH, //
                                java.awt.font.TextAttribute.JUSTIFICATION, //
                                java.awt.font.TextAttribute.KERNING, //
                                java.awt.font.TextAttribute.POSTURE, //
                                java.awt.font.TextAttribute.SUPERSCRIPT, //
                                java.awt.font.TextAttribute.CHAR_REPLACEMENT, //
                                java.awt.font.TextAttribute.BIDI_EMBEDDING, //
                                java.awt.font.TextAttribute.RUN_DIRECTION, //
                                java.awt.font.TextAttribute.FOREGROUND, //
                                java.awt.font.TextAttribute.WEIGHT, //
                                java.awt.font.TextAttribute.TRANSFORM, //
                                java.awt.font.TextAttribute.LIGATURES);
    }

    @Parameter(0)
    public java.awt.font.TextAttribute sut;

    @Override
    public java.awt.font.TextAttribute createNewSUT() {
        return this.sut;
    }

}
