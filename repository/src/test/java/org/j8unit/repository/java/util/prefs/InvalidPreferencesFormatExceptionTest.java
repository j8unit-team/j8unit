package org.j8unit.repository.java.util.prefs;

import java.util.prefs.InvalidPreferencesFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPreferencesFormatExceptionTest
implements org.j8unit.repository.java.util.prefs.InvalidPreferencesFormatExceptionTests<InvalidPreferencesFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.InvalidPreferencesFormatException]

    @Override
    public InvalidPreferencesFormatException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.prefs.InvalidPreferencesFormatException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.InvalidPreferencesFormatException]

}
