package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPHandlerTest<T extends SOAPMessageContext>
implements org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerTests<SOAPHandler<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPHandler]

    @Override
    public SOAPHandler<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.soap.SOAPHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPHandler]

}
