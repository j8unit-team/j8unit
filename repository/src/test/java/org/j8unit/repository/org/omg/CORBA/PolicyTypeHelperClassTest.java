package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PolicyTypeHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyTypeHelperClassTests<org.omg.CORBA.PolicyTypeHelper> {

    @Override
    public Class<org.omg.CORBA.PolicyTypeHelper> createNewSUT() {
        return org.omg.CORBA.PolicyTypeHelper.class;
    }

}
