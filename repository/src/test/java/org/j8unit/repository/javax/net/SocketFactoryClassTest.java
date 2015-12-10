package org.j8unit.repository.javax.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketFactoryClassTest
implements org.j8unit.repository.javax.net.SocketFactoryClassTests<javax.net.SocketFactory> {

    @Override
    public Class<javax.net.SocketFactory> createNewSUT() {
        return javax.net.SocketFactory.class;
    }

}
