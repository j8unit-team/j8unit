package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceContext} (by simply reusing the
 * J8Unit test interface {@link WebServiceContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceContextClassTest
implements WebServiceContextClassTests<WebServiceContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceContext]

    @Override
    public Class<WebServiceContext> createNewSUT() {
        return WebServiceContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceContext]

}
