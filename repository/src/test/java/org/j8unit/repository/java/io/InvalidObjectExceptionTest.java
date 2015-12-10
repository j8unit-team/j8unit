package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidObjectExceptionTest
implements org.j8unit.repository.java.io.InvalidObjectExceptionTests<java.io.InvalidObjectException> {

    @Override
    public java.io.InvalidObjectException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.io.InvalidObjectException] available.");
    }

}
