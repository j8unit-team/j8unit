package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceRef;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceRef} (by simply reusing the
 * J8Unit test interface {@link WebServiceRefClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceRefClassTest
implements WebServiceRefClassTests<WebServiceRef> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceRef]

    @Override
    public Class<WebServiceRef> createNewSUT() {
        return WebServiceRef.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceRef]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceRef]

}
