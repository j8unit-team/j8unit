package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceClientClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceClientClassTests<javax.xml.ws.WebServiceClient> {

    @Override
    public Class<javax.xml.ws.WebServiceClient> createNewSUT() {
        return javax.xml.ws.WebServiceClient.class;
    }

}
