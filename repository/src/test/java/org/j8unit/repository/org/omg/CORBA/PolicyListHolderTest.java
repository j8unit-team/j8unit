package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyListHolderTest
implements org.j8unit.repository.org.omg.CORBA.PolicyListHolderTests<org.omg.CORBA.PolicyListHolder> {

    @Override
    public org.omg.CORBA.PolicyListHolder createNewSUT() {
        return new org.omg.CORBA.PolicyListHolder();
    }

}
