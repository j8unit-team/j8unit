package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_POLICY_VALUEClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICY_VALUEClassTests<org.omg.CORBA.BAD_POLICY_VALUE> {

    @Override
    public Class<org.omg.CORBA.BAD_POLICY_VALUE> createNewSUT() {
        return org.omg.CORBA.BAD_POLICY_VALUE.class;
    }

}
