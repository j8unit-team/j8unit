package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPMessageHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageHandlerClassTest
implements org.j8unit.repository.javax.jws.soap.SOAPMessageHandlerClassTests<SOAPMessageHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPMessageHandler]

    @Override
    public Class<SOAPMessageHandler> createNewSUT() {
        return SOAPMessageHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.soap.SOAPMessageHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPMessageHandler]

}
