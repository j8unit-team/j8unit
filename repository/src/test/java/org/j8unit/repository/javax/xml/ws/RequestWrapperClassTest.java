package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestWrapperClassTest
implements org.j8unit.repository.javax.xml.ws.RequestWrapperClassTests<javax.xml.ws.RequestWrapper> {

    @Override
    public Class<javax.xml.ws.RequestWrapper> createNewSUT() {
        return javax.xml.ws.RequestWrapper.class;
    }

}
