package org.j8unit.repository.java.util.regex;

import java.util.regex.MatchResult;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MatchResult} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.regex.MatchResultTests}).
 */

@RunWith(J8Unit4.class)
public class MatchResultTest
implements MatchResultTests<MatchResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.regex.MatchResult]

    @Override
    public MatchResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.regex.MatchResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.regex.MatchResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.regex.MatchResult]

}
