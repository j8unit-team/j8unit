package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IOExceptionTest
implements org.j8unit.repository.java.io.IOExceptionTests<java.io.IOException> {

    @Override
    public java.io.IOException createNewSUT() {
        return new java.io.IOException();
    }

}
