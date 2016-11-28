package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.ExceptionDetailMessage;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExceptionDetailMessage} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.ExceptionDetailMessageTests}).
 */
@RunWith(J8Unit4.class)
public class ExceptionDetailMessageTest
implements ExceptionDetailMessageTests<ExceptionDetailMessage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.ExceptionDetailMessage]

    @Override
    public ExceptionDetailMessage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.ExceptionDetailMessage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.ExceptionDetailMessage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.ExceptionDetailMessage]

}
