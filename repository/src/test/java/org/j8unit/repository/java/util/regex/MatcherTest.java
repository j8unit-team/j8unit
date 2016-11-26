package org.j8unit.repository.java.util.regex;

import java.util.regex.Matcher;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Matcher} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.regex.MatcherTests}).
 */
@RunWith(J8Unit4.class)
public class MatcherTest
implements MatcherTests<Matcher> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.regex.Matcher]

    @Override
    public Matcher createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.regex.Matcher], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.regex.Matcher]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.regex.Matcher]

}
