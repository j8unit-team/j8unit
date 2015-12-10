package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NetworkInterfaceTest
implements org.j8unit.repository.java.net.NetworkInterfaceTests<java.net.NetworkInterface> {

    @Override
    public java.net.NetworkInterface createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.NetworkInterface] available.");
    }

}
