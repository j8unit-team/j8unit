package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EndpointReferenceClassTest
implements org.j8unit.repository.javax.xml.ws.EndpointReferenceClassTests<javax.xml.ws.EndpointReference> {

    @Override
    public Class<javax.xml.ws.EndpointReference> createNewSUT() {
        return javax.xml.ws.EndpointReference.class;
    }

}
