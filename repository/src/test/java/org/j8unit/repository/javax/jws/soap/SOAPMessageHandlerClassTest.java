package org.j8unit.repository.javax.jws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageHandlerClassTest
implements org.j8unit.repository.javax.jws.soap.SOAPMessageHandlerClassTests<javax.jws.soap.SOAPMessageHandler> {

    @Override
    public Class<javax.jws.soap.SOAPMessageHandler> createNewSUT() {
        return javax.jws.soap.SOAPMessageHandler.class;
    }

}
