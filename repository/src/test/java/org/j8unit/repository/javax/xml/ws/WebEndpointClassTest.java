package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebEndpoint;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebEndpoint} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebEndpointClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebEndpointClassTest
implements WebEndpointClassTests<WebEndpoint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebEndpoint]

    @Override
    public Class<WebEndpoint> createNewSUT() {
        return WebEndpoint.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebEndpoint]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebEndpoint]

}
