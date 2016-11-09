package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebFault;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebFault} (by simply reusing the J8Unit
 * test interface {@link WebFaultClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebFaultClassTest
implements WebFaultClassTests<WebFault> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebFault]

    @Override
    public Class<WebFault> createNewSUT() {
        return WebFault.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebFault]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebFault]

}
