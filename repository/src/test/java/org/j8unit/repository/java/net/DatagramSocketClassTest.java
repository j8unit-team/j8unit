package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramSocketClassTest
implements org.j8unit.repository.java.net.DatagramSocketClassTests<java.net.DatagramSocket> {

    @Override
    public Class<java.net.DatagramSocket> createNewSUT() {
        return java.net.DatagramSocket.class;
    }

}
