package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ValueHandlerMultiFormat;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValueHandlerMultiFormat} (by simply
 * reusing the J8Unit test interface {@link ValueHandlerMultiFormatTests}).
 */

@RunWith(J8Unit4.class)
public class ValueHandlerMultiFormatTest
implements ValueHandlerMultiFormatTests<ValueHandlerMultiFormat> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

    @Override
    public ValueHandlerMultiFormat createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.rmi.CORBA.ValueHandlerMultiFormat], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.CORBA.ValueHandlerMultiFormat]

}
