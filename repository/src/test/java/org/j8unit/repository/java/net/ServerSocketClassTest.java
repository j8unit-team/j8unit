package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketClassTest
implements org.j8unit.repository.java.net.ServerSocketClassTests<java.net.ServerSocket> {

    @Override
    public Class<java.net.ServerSocket> createNewSUT() {
        return java.net.ServerSocket.class;
    }

}
