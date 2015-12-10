package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectExceptionTest
implements org.j8unit.repository.java.net.ConnectExceptionTests<java.net.ConnectException> {

    @Override
    public java.net.ConnectException createNewSUT() {
        return new java.net.ConnectException();
    }

}
