package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorHelperClassTests<org.omg.CORBA.PolicyErrorHelper> {

    @Override
    public Class<org.omg.CORBA.PolicyErrorHelper> createNewSUT() {
        return org.omg.CORBA.PolicyErrorHelper.class;
    }

}
