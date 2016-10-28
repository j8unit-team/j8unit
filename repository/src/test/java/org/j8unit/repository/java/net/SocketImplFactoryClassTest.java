package org.j8unit.repository.java.net;

import java.net.SocketImplFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketImplFactoryClassTest
implements org.j8unit.repository.java.net.SocketImplFactoryClassTests<SocketImplFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketImplFactory]

    @Override
    public Class<SocketImplFactory> createNewSUT() {
        return SocketImplFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketImplFactory]

}
