package org.j8unit.repository.java.awt.font;

import java.awt.font.TextMeasurer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextMeasurer} (by simply reusing the
 * J8Unit test interface {@link TextMeasurerTests}).
 */

@RunWith(J8Unit4.class)
public class TextMeasurerTest
implements TextMeasurerTests<TextMeasurer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.TextMeasurer]

    @Override
    public TextMeasurer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.TextMeasurer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.TextMeasurer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.TextMeasurer]

}
