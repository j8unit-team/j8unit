package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyHelperClassTests<org.omg.CORBA.PolicyHelper> {

    @Override
    public Class<org.omg.CORBA.PolicyHelper> createNewSUT() {
        return org.omg.CORBA.PolicyHelper.class;
    }

}
