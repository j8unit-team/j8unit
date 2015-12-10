package org.j8unit.repository.java.rmi.dgc;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LeaseClassTest
implements org.j8unit.repository.java.rmi.dgc.LeaseClassTests<java.rmi.dgc.Lease> {

    @Override
    public Class<java.rmi.dgc.Lease> createNewSUT() {
        return java.rmi.dgc.Lease.class;
    }

}
