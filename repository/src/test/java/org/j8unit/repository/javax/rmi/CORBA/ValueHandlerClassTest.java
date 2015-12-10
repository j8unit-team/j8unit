package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueHandlerClassTest
implements org.j8unit.repository.javax.rmi.CORBA.ValueHandlerClassTests<javax.rmi.CORBA.ValueHandler> {

    @Override
    public Class<javax.rmi.CORBA.ValueHandler> createNewSUT() {
        return javax.rmi.CORBA.ValueHandler.class;
    }

}
