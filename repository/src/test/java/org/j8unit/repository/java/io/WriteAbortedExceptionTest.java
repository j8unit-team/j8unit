package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WriteAbortedExceptionTest
implements org.j8unit.repository.java.io.WriteAbortedExceptionTests<java.io.WriteAbortedException> {

    @Override
    public java.io.WriteAbortedException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.io.WriteAbortedException] available.");
    }

}
