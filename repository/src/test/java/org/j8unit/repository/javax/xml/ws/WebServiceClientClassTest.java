package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceClient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceClientClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceClientClassTests<WebServiceClient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceClient]

    @Override
    public Class<WebServiceClient> createNewSUT() {
        return WebServiceClient.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceClient]

}
