package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet4AddressTest
implements org.j8unit.repository.java.net.Inet4AddressTests<java.net.Inet4Address> {

    @Override
    public java.net.Inet4Address createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.Inet4Address] available.");
    }

}
