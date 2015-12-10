package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyListHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyListHolderClassTests<org.omg.CORBA.PolicyListHolder> {

    @Override
    public Class<org.omg.CORBA.PolicyListHolder> createNewSUT() {
        return org.omg.CORBA.PolicyListHolder.class;
    }

}
