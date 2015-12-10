package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemExceptionTest
implements org.j8unit.repository.java.nio.file.FileSystemExceptionTests<java.nio.file.FileSystemException> {

    @Override
    public java.nio.file.FileSystemException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.FileSystemException] available.");
    }

}
