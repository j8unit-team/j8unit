package org.j8unit.repository.java.net;

import java.net.Inet6Address;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Inet6AddressTest
implements org.j8unit.repository.java.net.Inet6AddressTests<Inet6Address> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Inet6Address]

    @Override
    public Inet6Address createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.Inet6Address], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Inet6Address]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Inet6Address]

}
