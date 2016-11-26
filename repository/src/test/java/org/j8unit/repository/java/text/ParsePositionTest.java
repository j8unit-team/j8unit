package org.j8unit.repository.java.text;

import java.text.ParsePosition;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParsePosition} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.ParsePositionTests}).
 */
@RunWith(J8Unit4.class)
public class ParsePositionTest
implements ParsePositionTests<ParsePosition> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.ParsePosition]

    @Override
    public ParsePosition createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.ParsePosition], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.ParsePosition]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.ParsePosition]

}
