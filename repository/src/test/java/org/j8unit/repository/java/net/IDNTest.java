package org.j8unit.repository.java.net;

import java.net.IDN;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDNTest
implements org.j8unit.repository.java.net.IDNTests<IDN> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.IDN]

    @Override
    public IDN createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.IDN], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.IDN]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.IDN]

}
