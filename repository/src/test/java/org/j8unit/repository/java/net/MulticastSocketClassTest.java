package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MulticastSocketClassTest
implements org.j8unit.repository.java.net.MulticastSocketClassTests<java.net.MulticastSocket> {

    @Override
    public Class<java.net.MulticastSocket> createNewSUT() {
        return java.net.MulticastSocket.class;
    }

}
