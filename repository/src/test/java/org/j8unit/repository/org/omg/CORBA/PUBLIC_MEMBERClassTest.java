package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;

@RunWith(J8Unit4.class)
public class PUBLIC_MEMBERClassTest
implements org.j8unit.repository.org.omg.CORBA.PUBLIC_MEMBERClassTests<PUBLIC_MEMBER> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PUBLIC_MEMBER]

    @Override
    public Class<PUBLIC_MEMBER> createNewSUT() {
        return PUBLIC_MEMBER.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PUBLIC_MEMBER]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PUBLIC_MEMBER]

}
