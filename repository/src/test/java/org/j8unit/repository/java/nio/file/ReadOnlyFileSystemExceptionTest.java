package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadOnlyFileSystemExceptionTest
implements org.j8unit.repository.java.nio.file.ReadOnlyFileSystemExceptionTests<java.nio.file.ReadOnlyFileSystemException> {

    @Override
    public java.nio.file.ReadOnlyFileSystemException createNewSUT() {
        return new java.nio.file.ReadOnlyFileSystemException();
    }

}
