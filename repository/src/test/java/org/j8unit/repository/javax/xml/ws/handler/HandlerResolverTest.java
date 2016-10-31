package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.HandlerResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerResolverTest
implements org.j8unit.repository.javax.xml.ws.handler.HandlerResolverTests<HandlerResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.HandlerResolver]

    @Override
    public HandlerResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.HandlerResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.HandlerResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.HandlerResolver]

}
