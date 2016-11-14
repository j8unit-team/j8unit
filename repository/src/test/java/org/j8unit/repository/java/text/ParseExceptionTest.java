package org.j8unit.repository.java.text;

import java.text.ParseException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParseException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.text.ParseExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class ParseExceptionTest
implements ParseExceptionTests<ParseException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.ParseException]

    @Override
    public ParseException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.ParseException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.ParseException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.ParseException]

}
