package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.ResponseWrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ResponseWrapper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.ResponseWrapperClassTests}).
 */

@RunWith(J8Unit4.class)
public class ResponseWrapperClassTest
implements ResponseWrapperClassTests<ResponseWrapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.ResponseWrapper]

    @Override
    public Class<ResponseWrapper> createNewSUT() {
        return ResponseWrapper.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.ResponseWrapper]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.ResponseWrapper]

}
