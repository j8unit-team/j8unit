package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ResponseHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ResponseHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.portable.ResponseHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class ResponseHandlerTest
implements ResponseHandlerTests<ResponseHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ResponseHandler]

    @Override
    public ResponseHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.ResponseHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.ResponseHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.ResponseHandler]

}
