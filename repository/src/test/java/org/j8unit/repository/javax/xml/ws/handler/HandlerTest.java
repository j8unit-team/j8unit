package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerTest<C extends MessageContext>
implements org.j8unit.repository.javax.xml.ws.handler.HandlerTests<Handler<C>, C> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.Handler]

    @Override
    public Handler<C> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.Handler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.Handler]

}
