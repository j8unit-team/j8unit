package org.j8unit.repository.java.text;

import java.text.ChoiceFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChoiceFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.ChoiceFormatTests}).
 */

@RunWith(J8Unit4.class)
public class ChoiceFormatTest
implements ChoiceFormatTests<ChoiceFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.ChoiceFormat]

    @Override
    public ChoiceFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.ChoiceFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.ChoiceFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.ChoiceFormat]

}
