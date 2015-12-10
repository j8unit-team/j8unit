package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPExceptionTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPExceptionTests<javax.xml.ws.http.HTTPException> {

    @Override
    public javax.xml.ws.http.HTTPException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.ws.http.HTTPException] available.");
    }

}
