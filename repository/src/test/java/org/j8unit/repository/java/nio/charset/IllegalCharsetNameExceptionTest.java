package org.j8unit.repository.java.nio.charset;

import java.nio.charset.IllegalCharsetNameException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IllegalCharsetNameException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalCharsetNameExceptionTest
implements IllegalCharsetNameExceptionTests<IllegalCharsetNameException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

    @Override
    public IllegalCharsetNameException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.IllegalCharsetNameException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

}
