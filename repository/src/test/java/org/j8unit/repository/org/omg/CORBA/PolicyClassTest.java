package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyClassTests<org.omg.CORBA.Policy> {

    @Override
    public Class<org.omg.CORBA.Policy> createNewSUT() {
        return org.omg.CORBA.Policy.class;
    }

}
