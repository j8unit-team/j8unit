package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class REBINDClassTest
implements org.j8unit.repository.org.omg.CORBA.REBINDClassTests<org.omg.CORBA.REBIND> {

    @Override
    public Class<org.omg.CORBA.REBIND> createNewSUT() {
        return org.omg.CORBA.REBIND.class;
    }

}
