package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceClient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceClient} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebServiceClientClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceClientClassTest
implements WebServiceClientClassTests<WebServiceClient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceClient]

    @Override
    public Class<WebServiceClient> createNewSUT() {
        return WebServiceClient.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceClient]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceClient]

}
