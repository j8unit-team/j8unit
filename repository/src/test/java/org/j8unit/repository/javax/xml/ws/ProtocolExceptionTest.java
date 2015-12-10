package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolExceptionTest
implements org.j8unit.repository.javax.xml.ws.ProtocolExceptionTests<javax.xml.ws.ProtocolException> {

    @Override
    public javax.xml.ws.ProtocolException createNewSUT() {
        return new javax.xml.ws.ProtocolException();
    }

}
