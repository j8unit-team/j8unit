package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterfaceAddressTest
implements org.j8unit.repository.java.net.InterfaceAddressTests<java.net.InterfaceAddress> {

    @Override
    public java.net.InterfaceAddress createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.InterfaceAddress] available.");
    }

}
