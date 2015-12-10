package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DATA_CONVERSIONTest
implements org.j8unit.repository.org.omg.CORBA.DATA_CONVERSIONTests<org.omg.CORBA.DATA_CONVERSION> {

    @Override
    public org.omg.CORBA.DATA_CONVERSION createNewSUT() {
        return new org.omg.CORBA.DATA_CONVERSION();
    }

}
