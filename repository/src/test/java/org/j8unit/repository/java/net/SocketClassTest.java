package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketClassTest
implements org.j8unit.repository.java.net.SocketClassTests<java.net.Socket> {

    @Override
    public Class<java.net.Socket> createNewSUT() {
        return java.net.Socket.class;
    }

}
