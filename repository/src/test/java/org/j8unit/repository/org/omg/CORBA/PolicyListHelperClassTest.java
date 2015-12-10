package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyListHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyListHelperClassTests<org.omg.CORBA.PolicyListHelper> {

    @Override
    public Class<org.omg.CORBA.PolicyListHelper> createNewSUT() {
        return org.omg.CORBA.PolicyListHelper.class;
    }

}
