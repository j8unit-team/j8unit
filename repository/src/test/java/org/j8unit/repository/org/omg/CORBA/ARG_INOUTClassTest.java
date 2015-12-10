package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ARG_INOUTClassTest
implements org.j8unit.repository.org.omg.CORBA.ARG_INOUTClassTests<org.omg.CORBA.ARG_INOUT> {

    @Override
    public Class<org.omg.CORBA.ARG_INOUT> createNewSUT() {
        return org.omg.CORBA.ARG_INOUT.class;
    }

}
