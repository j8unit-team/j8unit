package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyErrorCodeHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorCodeHelperClassTests<org.omg.CORBA.PolicyErrorCodeHelper> {

    @Override
    public Class<org.omg.CORBA.PolicyErrorCodeHelper> createNewSUT() {
        return org.omg.CORBA.PolicyErrorCodeHelper.class;
    }

}
