package org.j8unit.repository.java.util;

import java.util.IllegalFormatCodePointException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IllegalFormatCodePointException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.IllegalFormatCodePointExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalFormatCodePointExceptionTest
implements IllegalFormatCodePointExceptionTests<IllegalFormatCodePointException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatCodePointException]

    @Override
    public IllegalFormatCodePointException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.IllegalFormatCodePointException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.IllegalFormatCodePointException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.IllegalFormatCodePointException]

}
