package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedFileSystemExceptionClassTest
implements org.j8unit.repository.java.nio.file.ClosedFileSystemExceptionClassTests<java.nio.file.ClosedFileSystemException> {

    @Override
    public Class<java.nio.file.ClosedFileSystemException> createNewSUT() {
        return java.nio.file.ClosedFileSystemException.class;
    }

}
