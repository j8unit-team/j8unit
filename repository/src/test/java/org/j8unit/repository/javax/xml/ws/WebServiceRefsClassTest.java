package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceRefs;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceRefs} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebServiceRefsClassTests}).
 */
@RunWith(J8Unit4.class)
public class WebServiceRefsClassTest
implements WebServiceRefsClassTests<WebServiceRefs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceRefs]

    @Override
    public Class<WebServiceRefs> createNewSUT() {
        return WebServiceRefs.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceRefs]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceRefs]

}
