package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ARG_INClassTest
implements org.j8unit.repository.org.omg.CORBA.ARG_INClassTests<org.omg.CORBA.ARG_IN> {

    @Override
    public Class<org.omg.CORBA.ARG_IN> createNewSUT() {
        return org.omg.CORBA.ARG_IN.class;
    }

}
