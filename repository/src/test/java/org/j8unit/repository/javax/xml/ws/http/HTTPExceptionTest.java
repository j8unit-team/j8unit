package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPExceptionTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPExceptionTests<HTTPException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.http.HTTPException]

    @Override
    public HTTPException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.http.HTTPException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.http.HTTPException]

}
