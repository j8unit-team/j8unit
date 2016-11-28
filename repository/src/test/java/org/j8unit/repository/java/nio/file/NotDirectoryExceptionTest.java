package org.j8unit.repository.java.nio.file;

import java.nio.file.NotDirectoryException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotDirectoryException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.NotDirectoryExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class NotDirectoryExceptionTest
implements NotDirectoryExceptionTests<NotDirectoryException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.NotDirectoryException]

    @Override
    public NotDirectoryException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.NotDirectoryException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.NotDirectoryException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.NotDirectoryException]

}
