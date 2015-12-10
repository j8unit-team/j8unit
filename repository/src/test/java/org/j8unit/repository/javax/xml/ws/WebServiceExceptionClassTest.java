package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceExceptionClassTests<javax.xml.ws.WebServiceException> {

    @Override
    public Class<javax.xml.ws.WebServiceException> createNewSUT() {
        return javax.xml.ws.WebServiceException.class;
    }

}
