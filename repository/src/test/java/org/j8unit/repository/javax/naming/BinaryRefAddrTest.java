package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BinaryRefAddrTest
implements org.j8unit.repository.javax.naming.BinaryRefAddrTests<javax.naming.BinaryRefAddr> {

    @Override
    public javax.naming.BinaryRefAddr createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.BinaryRefAddr] available.");
    }

}
