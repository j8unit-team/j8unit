package org.j8unit.repository.javax.xml.ws.handler.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SOAPHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerClassTests<javax.xml.ws.handler.soap.SOAPHandler> {

    @Override
    public Class<javax.xml.ws.handler.soap.SOAPHandler> createNewSUT() {
        return javax.xml.ws.handler.soap.SOAPHandler.class;
    }

}
