package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidMarkExceptionTest
implements org.j8unit.repository.java.nio.InvalidMarkExceptionTests<java.nio.InvalidMarkException> {

    @Override
    public java.nio.InvalidMarkException createNewSUT() {
        return new java.nio.InvalidMarkException();
    }

}
