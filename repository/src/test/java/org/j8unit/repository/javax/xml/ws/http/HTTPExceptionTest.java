package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTTPException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.http.HTTPExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class HTTPExceptionTest
implements HTTPExceptionTests<HTTPException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.http.HTTPException]

    @Override
    public HTTPException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.http.HTTPException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.http.HTTPException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.http.HTTPException]

}
