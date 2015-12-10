package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PUBLIC_MEMBERClassTest
implements org.j8unit.repository.org.omg.CORBA.PUBLIC_MEMBERClassTests<org.omg.CORBA.PUBLIC_MEMBER> {

    @Override
    public Class<org.omg.CORBA.PUBLIC_MEMBER> createNewSUT() {
        return org.omg.CORBA.PUBLIC_MEMBER.class;
    }

}
