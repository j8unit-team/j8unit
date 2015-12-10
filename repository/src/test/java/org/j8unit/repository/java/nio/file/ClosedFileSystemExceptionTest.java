package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedFileSystemExceptionTest
implements org.j8unit.repository.java.nio.file.ClosedFileSystemExceptionTests<java.nio.file.ClosedFileSystemException> {

    @Override
    public java.nio.file.ClosedFileSystemException createNewSUT() {
        return new java.nio.file.ClosedFileSystemException();
    }

}
