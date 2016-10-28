package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ValueHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueHandlerClassTest
implements org.j8unit.repository.javax.rmi.CORBA.ValueHandlerClassTests<ValueHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.ValueHandler]

    @Override
    public Class<ValueHandler> createNewSUT() {
        return ValueHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.ValueHandler]

}
