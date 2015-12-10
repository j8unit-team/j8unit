package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileAlreadyExistsExceptionClassTest
implements org.j8unit.repository.java.nio.file.FileAlreadyExistsExceptionClassTests<java.nio.file.FileAlreadyExistsException> {

    @Override
    public Class<java.nio.file.FileAlreadyExistsException> createNewSUT() {
        return java.nio.file.FileAlreadyExistsException.class;
    }

}
