package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.InvokeHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvokeHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvokeHandlerClassTest
implements InvokeHandlerClassTests<InvokeHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.InvokeHandler]

    @Override
    public Class<InvokeHandler> createNewSUT() {
        return InvokeHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.InvokeHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.InvokeHandler]

}
