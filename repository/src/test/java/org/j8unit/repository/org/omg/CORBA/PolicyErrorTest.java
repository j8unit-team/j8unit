package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorTests<org.omg.CORBA.PolicyError> {

    @Override
    public org.omg.CORBA.PolicyError createNewSUT() {
        return new org.omg.CORBA.PolicyError();
    }

}
