package org.j8unit.repository.java.nio.file;

import java.nio.file.DirectoryIteratorException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DirectoryIteratorException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.file.DirectoryIteratorExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class DirectoryIteratorExceptionTest
implements DirectoryIteratorExceptionTests<DirectoryIteratorException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.DirectoryIteratorException]

    @Override
    public DirectoryIteratorException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.DirectoryIteratorException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.DirectoryIteratorException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.DirectoryIteratorException]

}
