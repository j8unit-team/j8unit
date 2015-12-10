package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemAlreadyExistsExceptionClassTest
implements org.j8unit.repository.java.nio.file.FileSystemAlreadyExistsExceptionClassTests<java.nio.file.FileSystemAlreadyExistsException> {

    @Override
    public Class<java.nio.file.FileSystemAlreadyExistsException> createNewSUT() {
        return java.nio.file.FileSystemAlreadyExistsException.class;
    }

}
