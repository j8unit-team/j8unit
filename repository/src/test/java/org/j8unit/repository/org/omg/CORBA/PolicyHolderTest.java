package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyHolderTest
implements org.j8unit.repository.org.omg.CORBA.PolicyHolderTests<org.omg.CORBA.PolicyHolder> {

    @Override
    public org.omg.CORBA.PolicyHolder createNewSUT() {
        return new org.omg.CORBA.PolicyHolder();
    }

}
