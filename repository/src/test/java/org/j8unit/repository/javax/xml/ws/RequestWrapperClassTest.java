package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.RequestWrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RequestWrapper} (by simply reusing the
 * J8Unit test interface {@link RequestWrapperClassTests}).
 */

@RunWith(J8Unit4.class)
public class RequestWrapperClassTest
implements RequestWrapperClassTests<RequestWrapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.RequestWrapper]

    @Override
    public Class<RequestWrapper> createNewSUT() {
        return RequestWrapper.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.RequestWrapper]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.RequestWrapper]

}
