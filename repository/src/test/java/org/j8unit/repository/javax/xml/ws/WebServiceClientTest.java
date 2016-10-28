package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceClient;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceClientTest
implements org.j8unit.repository.javax.xml.ws.WebServiceClientTests<WebServiceClient> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceClient]

    @Override
    public WebServiceClient createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebServiceClient], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceClient]

}
