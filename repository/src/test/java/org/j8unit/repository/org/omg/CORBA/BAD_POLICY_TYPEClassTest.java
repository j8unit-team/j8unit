package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY_TYPE;

@RunWith(J8Unit4.class)
public class BAD_POLICY_TYPEClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICY_TYPEClassTests<BAD_POLICY_TYPE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_POLICY_TYPE]

    @Override
    public Class<BAD_POLICY_TYPE> createNewSUT() {
        return BAD_POLICY_TYPE.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_POLICY_TYPE]

}
