package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPathExceptionClassTest
implements org.j8unit.repository.java.nio.file.InvalidPathExceptionClassTests<java.nio.file.InvalidPathException> {

    @Override
    public Class<java.nio.file.InvalidPathException> createNewSUT() {
        return java.nio.file.InvalidPathException.class;
    }

}
