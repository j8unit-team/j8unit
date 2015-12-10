package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_POLICY_TYPEClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICY_TYPEClassTests<org.omg.CORBA.BAD_POLICY_TYPE> {

    @Override
    public Class<org.omg.CORBA.BAD_POLICY_TYPE> createNewSUT() {
        return org.omg.CORBA.BAD_POLICY_TYPE.class;
    }

}
