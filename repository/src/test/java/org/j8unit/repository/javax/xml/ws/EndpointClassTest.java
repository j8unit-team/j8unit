package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EndpointClassTest
implements org.j8unit.repository.javax.xml.ws.EndpointClassTests<javax.xml.ws.Endpoint> {

    @Override
    public Class<javax.xml.ws.Endpoint> createNewSUT() {
        return javax.xml.ws.Endpoint.class;
    }

}
