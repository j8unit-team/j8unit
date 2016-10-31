package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebEndpoint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebEndpointTest
implements org.j8unit.repository.javax.xml.ws.WebEndpointTests<WebEndpoint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebEndpoint]

    @Override
    public WebEndpoint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebEndpoint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebEndpoint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebEndpoint]

}
