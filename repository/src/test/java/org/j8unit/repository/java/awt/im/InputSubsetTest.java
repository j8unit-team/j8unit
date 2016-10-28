package org.j8unit.repository.java.awt.im;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.im.InputSubset;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class InputSubsetTest
implements org.j8unit.repository.java.awt.im.InputSubsetTests<InputSubset> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputSubset]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InputSubset.LATIN_DIGITS, //
                                InputSubset.FULLWIDTH_LATIN, //
                                InputSubset.SIMPLIFIED_HANZI, //
                                InputSubset.FULLWIDTH_DIGITS, //
                                InputSubset.TRADITIONAL_HANZI, //
                                InputSubset.HALFWIDTH_KATAKANA, //
                                InputSubset.LATIN, //
                                InputSubset.HANJA, //
                                InputSubset.KANJI);
    }

    @Parameter(0)
    public InputSubset sut;

    @Override
    public InputSubset createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputSubset]

}
