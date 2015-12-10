package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyOperationsClassTests<org.omg.CORBA.PolicyOperations> {

    @Override
    public Class<org.omg.CORBA.PolicyOperations> createNewSUT() {
        return org.omg.CORBA.PolicyOperations.class;
    }

}
