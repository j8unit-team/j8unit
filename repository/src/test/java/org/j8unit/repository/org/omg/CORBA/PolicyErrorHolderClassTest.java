package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorHolderClassTests<org.omg.CORBA.PolicyErrorHolder> {

    @Override
    public Class<org.omg.CORBA.PolicyErrorHolder> createNewSUT() {
        return org.omg.CORBA.PolicyErrorHolder.class;
    }

}
