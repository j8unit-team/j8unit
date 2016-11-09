package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Response;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Response} (by simply reusing the
 * J8Unit test interface {@link ResponseTests}).
 */

@RunWith(J8Unit4.class)
public class ResponseTest<T>
implements ResponseTests<Response<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Response]

    @Override
    public Response<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Response], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Response]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Response]

}
