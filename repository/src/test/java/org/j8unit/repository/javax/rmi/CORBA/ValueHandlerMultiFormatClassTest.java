package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueHandlerMultiFormatClassTest
implements org.j8unit.repository.javax.rmi.CORBA.ValueHandlerMultiFormatClassTests<javax.rmi.CORBA.ValueHandlerMultiFormat> {

    @Override
    public Class<javax.rmi.CORBA.ValueHandlerMultiFormat> createNewSUT() {
        return javax.rmi.CORBA.ValueHandlerMultiFormat.class;
    }

}
