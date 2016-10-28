package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.RequestWrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestWrapperClassTest
implements org.j8unit.repository.javax.xml.ws.RequestWrapperClassTests<RequestWrapper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.RequestWrapper]

    @Override
    public Class<RequestWrapper> createNewSUT() {
        return RequestWrapper.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.RequestWrapper]

}
