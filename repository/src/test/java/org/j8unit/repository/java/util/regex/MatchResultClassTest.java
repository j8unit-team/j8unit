package org.j8unit.repository.java.util.regex;

import java.util.regex.MatchResult;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MatchResult} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.regex.MatchResultClassTests}).
 */
@RunWith(J8Unit4.class)
public class MatchResultClassTest
implements MatchResultClassTests<MatchResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.regex.MatchResult]

    @Override
    public Class<MatchResult> createNewSUT() {
        return MatchResult.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.regex.MatchResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.regex.MatchResult]

}
