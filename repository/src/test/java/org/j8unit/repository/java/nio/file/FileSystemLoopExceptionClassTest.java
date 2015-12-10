package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemLoopExceptionClassTest
implements org.j8unit.repository.java.nio.file.FileSystemLoopExceptionClassTests<java.nio.file.FileSystemLoopException> {

    @Override
    public Class<java.nio.file.FileSystemLoopException> createNewSUT() {
        return java.nio.file.FileSystemLoopException.class;
    }

}
