package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceContextClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceContextClassTests<javax.xml.ws.WebServiceContext> {

    @Override
    public Class<javax.xml.ws.WebServiceContext> createNewSUT() {
        return javax.xml.ws.WebServiceContext.class;
    }

}
