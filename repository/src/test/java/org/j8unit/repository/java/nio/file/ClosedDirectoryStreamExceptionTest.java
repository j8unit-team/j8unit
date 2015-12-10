package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedDirectoryStreamExceptionTest
implements org.j8unit.repository.java.nio.file.ClosedDirectoryStreamExceptionTests<java.nio.file.ClosedDirectoryStreamException> {

    @Override
    public java.nio.file.ClosedDirectoryStreamException createNewSUT() {
        return new java.nio.file.ClosedDirectoryStreamException();
    }

}
