package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SOAPHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerClassTests<SOAPHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.soap.SOAPHandler]

    @Override
    public Class<SOAPHandler> createNewSUT() {
        return SOAPHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.soap.SOAPHandler]

}
