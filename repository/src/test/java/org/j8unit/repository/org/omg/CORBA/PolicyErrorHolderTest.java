package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorHolderTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorHolderTests<org.omg.CORBA.PolicyErrorHolder> {

    @Override
    public org.omg.CORBA.PolicyErrorHolder createNewSUT() {
        return new org.omg.CORBA.PolicyErrorHolder();
    }

}
