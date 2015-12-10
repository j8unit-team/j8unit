package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketImplFactoryClassTest
implements org.j8unit.repository.java.net.SocketImplFactoryClassTests<java.net.SocketImplFactory> {

    @Override
    public Class<java.net.SocketImplFactory> createNewSUT() {
        return java.net.SocketImplFactory.class;
    }

}
