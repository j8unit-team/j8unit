package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY;

@RunWith(J8Unit4.class)
public class BAD_POLICYClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICYClassTests<BAD_POLICY> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_POLICY]

    @Override
    public Class<BAD_POLICY> createNewSUT() {
        return BAD_POLICY.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BAD_POLICY]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_POLICY]

}
