package org.j8unit.repository.java.net;

import java.net.Inet4Address;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet4AddressTest
implements org.j8unit.repository.java.net.Inet4AddressTests<Inet4Address> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Inet4Address]

    @Override
    public Inet4Address createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.Inet4Address], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Inet4Address]

}
