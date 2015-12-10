package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EOFExceptionClassTest
implements org.j8unit.repository.java.io.EOFExceptionClassTests<java.io.EOFException> {

    @Override
    public Class<java.io.EOFException> createNewSUT() {
        return java.io.EOFException.class;
    }

}
