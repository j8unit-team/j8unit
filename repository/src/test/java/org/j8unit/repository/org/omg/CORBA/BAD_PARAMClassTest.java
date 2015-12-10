package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_PARAMClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_PARAMClassTests<org.omg.CORBA.BAD_PARAM> {

    @Override
    public Class<org.omg.CORBA.BAD_PARAM> createNewSUT() {
        return org.omg.CORBA.BAD_PARAM.class;
    }

}
