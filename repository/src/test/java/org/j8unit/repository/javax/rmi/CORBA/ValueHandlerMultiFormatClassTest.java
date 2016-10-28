package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ValueHandlerMultiFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueHandlerMultiFormatClassTest
implements org.j8unit.repository.javax.rmi.CORBA.ValueHandlerMultiFormatClassTests<ValueHandlerMultiFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

    @Override
    public Class<ValueHandlerMultiFormat> createNewSUT() {
        return ValueHandlerMultiFormat.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

}
