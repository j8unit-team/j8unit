package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ErrorHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ErrorHandler} (by simply reusing the
 * J8Unit test interface {@link ErrorHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class ErrorHandlerTest
implements ErrorHandlerTests<ErrorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ErrorHandler]

    @Override
    public ErrorHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ErrorHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ErrorHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ErrorHandler]

}
