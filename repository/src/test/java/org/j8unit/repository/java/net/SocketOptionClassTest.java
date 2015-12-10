package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SocketOptionClassTest
implements org.j8unit.repository.java.net.SocketOptionClassTests<java.net.SocketOption> {

    @Override
    public Class<java.net.SocketOption> createNewSUT() {
        return java.net.SocketOption.class;
    }

}
