package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EndpointContextClassTest
implements org.j8unit.repository.javax.xml.ws.EndpointContextClassTests<javax.xml.ws.EndpointContext> {

    @Override
    public Class<javax.xml.ws.EndpointContext> createNewSUT() {
        return javax.xml.ws.EndpointContext.class;
    }

}
