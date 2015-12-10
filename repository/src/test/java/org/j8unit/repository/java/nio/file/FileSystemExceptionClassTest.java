package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemExceptionClassTest
implements org.j8unit.repository.java.nio.file.FileSystemExceptionClassTests<java.nio.file.FileSystemException> {

    @Override
    public Class<java.nio.file.FileSystemException> createNewSUT() {
        return java.nio.file.FileSystemException.class;
    }

}
