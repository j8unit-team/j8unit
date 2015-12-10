package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemNotFoundExceptionClassTest
implements org.j8unit.repository.java.nio.file.FileSystemNotFoundExceptionClassTests<java.nio.file.FileSystemNotFoundException> {

    @Override
    public Class<java.nio.file.FileSystemNotFoundException> createNewSUT() {
        return java.nio.file.FileSystemNotFoundException.class;
    }

}
