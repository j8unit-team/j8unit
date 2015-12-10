package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.ProtocolExceptionClassTests<javax.xml.ws.ProtocolException> {

    @Override
    public Class<javax.xml.ws.ProtocolException> createNewSUT() {
        return javax.xml.ws.ProtocolException.class;
    }

}
