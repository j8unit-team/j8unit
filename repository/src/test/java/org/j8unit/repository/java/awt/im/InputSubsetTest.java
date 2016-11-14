package org.j8unit.repository.java.awt.im;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.im.InputSubset;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InputSubset} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.im.InputSubsetTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InputSubsetTest
implements InputSubsetTests<InputSubset> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.im.InputSubset]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.im.InputSubset]

}
