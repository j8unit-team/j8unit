package org.j8unit.repository.javax.jws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageHandlersClassTest
implements org.j8unit.repository.javax.jws.soap.SOAPMessageHandlersClassTests<javax.jws.soap.SOAPMessageHandlers> {

    @Override
    public Class<javax.jws.soap.SOAPMessageHandlers> createNewSUT() {
        return javax.jws.soap.SOAPMessageHandlers.class;
    }

}
