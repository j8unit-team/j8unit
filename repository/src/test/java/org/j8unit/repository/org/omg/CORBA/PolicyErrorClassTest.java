package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorClassTests<org.omg.CORBA.PolicyError> {

    @Override
    public Class<org.omg.CORBA.PolicyError> createNewSUT() {
        return org.omg.CORBA.PolicyError.class;
    }

}
