package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ValueHandlerMultiFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueHandlerMultiFormat} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.rmi.CORBA.ValueHandlerMultiFormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class ValueHandlerMultiFormatClassTest
implements ValueHandlerMultiFormatClassTests<ValueHandlerMultiFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

    @Override
    public Class<ValueHandlerMultiFormat> createNewSUT() {
        return ValueHandlerMultiFormat.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

}
