package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTTPExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.http.HTTPExceptionClassTests<javax.xml.ws.http.HTTPException> {

    @Override
    public Class<javax.xml.ws.http.HTTPException> createNewSUT() {
        return javax.xml.ws.http.HTTPException.class;
    }

}
