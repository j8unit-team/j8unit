package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramPacketClassTest
implements org.j8unit.repository.java.net.DatagramPacketClassTests<java.net.DatagramPacket> {

    @Override
    public Class<java.net.DatagramPacket> createNewSUT() {
        return java.net.DatagramPacket.class;
    }

}
