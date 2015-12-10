package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyHolderClassTests<org.omg.CORBA.PolicyHolder> {

    @Override
    public Class<org.omg.CORBA.PolicyHolder> createNewSUT() {
        return org.omg.CORBA.PolicyHolder.class;
    }

}
