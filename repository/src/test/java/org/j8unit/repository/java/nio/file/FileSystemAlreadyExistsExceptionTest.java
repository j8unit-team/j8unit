package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemAlreadyExistsExceptionTest
implements org.j8unit.repository.java.nio.file.FileSystemAlreadyExistsExceptionTests<java.nio.file.FileSystemAlreadyExistsException> {

    @Override
    public java.nio.file.FileSystemAlreadyExistsException createNewSUT() {
        return new java.nio.file.FileSystemAlreadyExistsException();
    }

}
