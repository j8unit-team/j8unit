package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPathExceptionTest
implements org.j8unit.repository.java.nio.file.InvalidPathExceptionTests<java.nio.file.InvalidPathException> {

    @Override
    public java.nio.file.InvalidPathException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.InvalidPathException] available.");
    }

}
