package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketExceptionClassTest
implements org.j8unit.repository.java.net.SocketExceptionClassTests<java.net.SocketException> {

    @Override
    public Class<java.net.SocketException> createNewSUT() {
        return java.net.SocketException.class;
    }

}
