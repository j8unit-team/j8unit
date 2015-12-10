package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebEndpointClassTest
implements org.j8unit.repository.javax.xml.ws.WebEndpointClassTests<javax.xml.ws.WebEndpoint> {

    @Override
    public Class<javax.xml.ws.WebEndpoint> createNewSUT() {
        return javax.xml.ws.WebEndpoint.class;
    }

}
