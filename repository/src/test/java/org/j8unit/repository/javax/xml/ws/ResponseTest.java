package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Response;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseTest<T>
implements org.j8unit.repository.javax.xml.ws.ResponseTests<Response<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Response]

    @Override
    public Response<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Response], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Response]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Response]

}
