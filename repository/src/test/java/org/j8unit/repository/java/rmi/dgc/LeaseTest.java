package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LeaseTest
implements org.j8unit.repository.java.rmi.dgc.LeaseTests<java.rmi.dgc.Lease> {

    @Override
    public java.rmi.dgc.Lease createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.dgc.Lease] available.");
    }

}
