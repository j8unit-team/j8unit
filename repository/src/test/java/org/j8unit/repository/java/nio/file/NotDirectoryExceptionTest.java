package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotDirectoryExceptionTest
implements org.j8unit.repository.java.nio.file.NotDirectoryExceptionTests<java.nio.file.NotDirectoryException> {

    @Override
    public java.nio.file.NotDirectoryException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.NotDirectoryException] available.");
    }

}
