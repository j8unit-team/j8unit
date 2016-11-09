package org.j8unit.repository.java.util.regex;

import java.util.regex.Pattern;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Pattern} (by simply reusing the
 * J8Unit test interface {@link PatternTests}).
 */

@RunWith(J8Unit4.class)
public class PatternTest
implements PatternTests<Pattern> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.regex.Pattern]

    @Override
    public Pattern createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.regex.Pattern], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.regex.Pattern]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.regex.Pattern]

}
