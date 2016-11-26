package org.j8unit.repository.java.nio.file;

import java.nio.file.InvalidPathException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidPathException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.InvalidPathExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidPathExceptionTest
implements InvalidPathExceptionTests<InvalidPathException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.InvalidPathException]

    @Override
    public InvalidPathException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.InvalidPathException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.InvalidPathException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.InvalidPathException]

}
