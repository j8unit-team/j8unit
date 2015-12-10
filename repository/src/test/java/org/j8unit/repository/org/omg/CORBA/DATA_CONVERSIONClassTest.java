package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DATA_CONVERSIONClassTest
implements org.j8unit.repository.org.omg.CORBA.DATA_CONVERSIONClassTests<org.omg.CORBA.DATA_CONVERSION> {

    @Override
    public Class<org.omg.CORBA.DATA_CONVERSION> createNewSUT() {
        return org.omg.CORBA.DATA_CONVERSION.class;
    }

}
