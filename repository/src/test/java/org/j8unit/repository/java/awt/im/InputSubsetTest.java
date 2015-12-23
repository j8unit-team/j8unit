package org.j8unit.repository.java.awt.im;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InputSubsetTest
implements org.j8unit.repository.java.awt.im.InputSubsetTests<java.awt.im.InputSubset> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.awt.im.InputSubset.LATIN_DIGITS, //
                                java.awt.im.InputSubset.FULLWIDTH_LATIN, //
                                java.awt.im.InputSubset.SIMPLIFIED_HANZI, //
                                java.awt.im.InputSubset.FULLWIDTH_DIGITS, //
                                java.awt.im.InputSubset.TRADITIONAL_HANZI, //
                                java.awt.im.InputSubset.HALFWIDTH_KATAKANA, //
                                java.awt.im.InputSubset.LATIN, //
                                java.awt.im.InputSubset.HANJA, //
                                java.awt.im.InputSubset.KANJI);
    }

    @Parameter(0)
    public java.awt.im.InputSubset sut;

    @Override
    public java.awt.im.InputSubset createNewSUT() {
        return this.sut;
    }

}
