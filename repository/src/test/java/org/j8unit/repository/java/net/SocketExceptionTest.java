package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketExceptionTest
implements org.j8unit.repository.java.net.SocketExceptionTests<java.net.SocketException> {

    @Override
    public java.net.SocketException createNewSUT() {
        return new java.net.SocketException();
    }

}
