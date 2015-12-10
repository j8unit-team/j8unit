package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_POLICYClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICYClassTests<org.omg.CORBA.BAD_POLICY> {

    @Override
    public Class<org.omg.CORBA.BAD_POLICY> createNewSUT() {
        return org.omg.CORBA.BAD_POLICY.class;
    }

}
