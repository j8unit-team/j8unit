package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotActiveExceptionTest
implements org.j8unit.repository.java.io.NotActiveExceptionTests<java.io.NotActiveException> {

    @Override
    public java.io.NotActiveException createNewSUT() {
        return new java.io.NotActiveException();
    }

}
