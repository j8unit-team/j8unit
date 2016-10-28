package org.j8unit.repository.java.awt.im;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.awt.im.InputMethodHighlight;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class InputMethodHighlightTest
implements org.j8unit.repository.java.awt.im.InputMethodHighlightTests<InputMethodHighlight> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputMethodHighlight]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(InputMethodHighlight.UNSELECTED_RAW_TEXT_HIGHLIGHT, //
                                InputMethodHighlight.SELECTED_RAW_TEXT_HIGHLIGHT, //
                                InputMethodHighlight.SELECTED_CONVERTED_TEXT_HIGHLIGHT, //
                                InputMethodHighlight.UNSELECTED_CONVERTED_TEXT_HIGHLIGHT);
    }

    @Parameter(0)
    public InputMethodHighlight sut;

    @Override
    public InputMethodHighlight createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.im.InputMethodHighlight]

}
