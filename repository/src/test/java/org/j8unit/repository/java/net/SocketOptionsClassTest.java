package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketOptionsClassTest
implements org.j8unit.repository.java.net.SocketOptionsClassTests<java.net.SocketOptions> {

    @Override
    public Class<java.net.SocketOptions> createNewSUT() {
        return java.net.SocketOptions.class;
    }

}
