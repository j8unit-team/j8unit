package org.j8unit.repository.java.util.prefs;

import java.util.prefs.InvalidPreferencesFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidPreferencesFormatException}
 * (by simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.prefs.InvalidPreferencesFormatExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidPreferencesFormatExceptionTest
implements InvalidPreferencesFormatExceptionTests<InvalidPreferencesFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.InvalidPreferencesFormatException]

    @Override
    public InvalidPreferencesFormatException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.prefs.InvalidPreferencesFormatException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.InvalidPreferencesFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.InvalidPreferencesFormatException]

}
