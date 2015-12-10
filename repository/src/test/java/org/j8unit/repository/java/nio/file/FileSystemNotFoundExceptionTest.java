package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemNotFoundExceptionTest
implements org.j8unit.repository.java.nio.file.FileSystemNotFoundExceptionTests<java.nio.file.FileSystemNotFoundException> {

    @Override
    public java.nio.file.FileSystemNotFoundException createNewSUT() {
        return new java.nio.file.FileSystemNotFoundException();
    }

}
