package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystemLoopException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemLoopExceptionTest
implements org.j8unit.repository.java.nio.file.FileSystemLoopExceptionTests<FileSystemLoopException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystemLoopException]

    @Override
    public FileSystemLoopException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.FileSystemLoopException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystemLoopException]

}
