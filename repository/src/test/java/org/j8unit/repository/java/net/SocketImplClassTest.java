package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketImplClassTest
implements org.j8unit.repository.java.net.SocketImplClassTests<java.net.SocketImpl> {

    @Override
    public Class<java.net.SocketImpl> createNewSUT() {
        return java.net.SocketImpl.class;
    }

}
