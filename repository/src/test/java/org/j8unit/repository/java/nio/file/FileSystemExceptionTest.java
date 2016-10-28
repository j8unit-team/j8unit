package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystemException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemExceptionTest
implements org.j8unit.repository.java.nio.file.FileSystemExceptionTests<FileSystemException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystemException]

    @Override
    public FileSystemException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.FileSystemException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileSystemException]

}
