package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseWrapperClassTest
implements org.j8unit.repository.javax.xml.ws.ResponseWrapperClassTests<javax.xml.ws.ResponseWrapper> {

    @Override
    public Class<javax.xml.ws.ResponseWrapper> createNewSUT() {
        return javax.xml.ws.ResponseWrapper.class;
    }

}
