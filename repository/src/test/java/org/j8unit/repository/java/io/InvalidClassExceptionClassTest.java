package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidClassExceptionClassTest
implements org.j8unit.repository.java.io.InvalidClassExceptionClassTests<java.io.InvalidClassException> {

    @Override
    public Class<java.io.InvalidClassException> createNewSUT() {
        return java.io.InvalidClassException.class;
    }

}
