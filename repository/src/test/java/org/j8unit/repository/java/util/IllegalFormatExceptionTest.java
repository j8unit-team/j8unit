package org.j8unit.repository.java.util;

import java.util.IllegalFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IllegalFormatException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.IllegalFormatExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalFormatExceptionTest
implements IllegalFormatExceptionTests<IllegalFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatException]

    @Override
    public IllegalFormatException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.IllegalFormatException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.IllegalFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.IllegalFormatException]

}
