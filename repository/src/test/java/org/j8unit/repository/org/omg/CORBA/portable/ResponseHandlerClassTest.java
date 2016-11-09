package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ResponseHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResponseHandler} (by simply reusing the
 * J8Unit test interface {@link ResponseHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ResponseHandlerClassTest
implements ResponseHandlerClassTests<ResponseHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.ResponseHandler]

    @Override
    public Class<ResponseHandler> createNewSUT() {
        return ResponseHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.ResponseHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.ResponseHandler]

}
