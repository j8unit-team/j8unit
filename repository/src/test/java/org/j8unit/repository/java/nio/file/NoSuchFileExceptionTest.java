package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchFileExceptionTest
implements org.j8unit.repository.java.nio.file.NoSuchFileExceptionTests<java.nio.file.NoSuchFileException> {

    @Override
    public java.nio.file.NoSuchFileException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.NoSuchFileException] available.");
    }

}
