package org.j8unit.repository.java.util;

import java.util.IllegalFormatWidthException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IllegalFormatWidthException} (by
 * simply reusing the J8Unit test interface {@link IllegalFormatWidthExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalFormatWidthExceptionTest
implements IllegalFormatWidthExceptionTests<IllegalFormatWidthException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatWidthException]

    @Override
    public IllegalFormatWidthException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.IllegalFormatWidthException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.IllegalFormatWidthException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.IllegalFormatWidthException]

}
