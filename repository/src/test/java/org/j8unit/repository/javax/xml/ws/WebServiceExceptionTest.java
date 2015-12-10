package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceExceptionTest
implements org.j8unit.repository.javax.xml.ws.WebServiceExceptionTests<javax.xml.ws.WebServiceException> {

    @Override
    public javax.xml.ws.WebServiceException createNewSUT() {
        return new javax.xml.ws.WebServiceException();
    }

}
