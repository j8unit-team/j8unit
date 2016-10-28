package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPMessageHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageHandlerTest
implements org.j8unit.repository.javax.jws.soap.SOAPMessageHandlerTests<SOAPMessageHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandler]

    @Override
    public SOAPMessageHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.soap.SOAPMessageHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandler]

}
