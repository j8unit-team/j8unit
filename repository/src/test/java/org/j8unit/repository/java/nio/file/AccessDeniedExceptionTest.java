package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessDeniedExceptionTest
implements org.j8unit.repository.java.nio.file.AccessDeniedExceptionTests<java.nio.file.AccessDeniedException> {

    @Override
    public java.nio.file.AccessDeniedException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.nio.file.AccessDeniedException] available.");
    }

}
