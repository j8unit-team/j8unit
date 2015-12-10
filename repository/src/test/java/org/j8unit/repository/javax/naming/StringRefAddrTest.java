package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringRefAddrTest
implements org.j8unit.repository.javax.naming.StringRefAddrTests<javax.naming.StringRefAddr> {

    @Override
    public javax.naming.StringRefAddr createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.StringRefAddr] available.");
    }

}
