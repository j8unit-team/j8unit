package org.j8unit.repository.javax.xml.ws.handler.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageContextClassTest
implements org.j8unit.repository.javax.xml.ws.handler.soap.SOAPMessageContextClassTests<javax.xml.ws.handler.soap.SOAPMessageContext> {

    @Override
    public Class<javax.xml.ws.handler.soap.SOAPMessageContext> createNewSUT() {
        return javax.xml.ws.handler.soap.SOAPMessageContext.class;
    }

}
