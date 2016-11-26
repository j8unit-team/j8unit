package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ValueHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ValueHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.rmi.CORBA.ValueHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ValueHandlerClassTest
implements ValueHandlerClassTests<ValueHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.ValueHandler]

    @Override
    public Class<ValueHandler> createNewSUT() {
        return ValueHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.ValueHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.ValueHandler]

}
