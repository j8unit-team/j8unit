package org.j8unit.repository.java.nio.charset;

import java.nio.charset.MalformedInputException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MalformedInputException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.charset.MalformedInputExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class MalformedInputExceptionTest
implements MalformedInputExceptionTests<MalformedInputException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.MalformedInputException]

    @Override
    public MalformedInputException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.MalformedInputException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.MalformedInputException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.MalformedInputException]

}
