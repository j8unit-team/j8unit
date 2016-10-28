package org.j8unit.repository.java.nio.file;

import java.nio.file.NotDirectoryException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotDirectoryExceptionTest
implements org.j8unit.repository.java.nio.file.NotDirectoryExceptionTests<NotDirectoryException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.NotDirectoryException]

    @Override
    public NotDirectoryException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.NotDirectoryException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.NotDirectoryException]

}
