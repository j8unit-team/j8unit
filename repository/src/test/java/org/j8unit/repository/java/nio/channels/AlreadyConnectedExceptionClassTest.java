package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyConnectedExceptionClassTest
implements org.j8unit.repository.java.nio.channels.AlreadyConnectedExceptionClassTests<java.nio.channels.AlreadyConnectedException> {

    @Override
    public Class<java.nio.channels.AlreadyConnectedException> createNewSUT() {
        return java.nio.channels.AlreadyConnectedException.class;
    }

}
