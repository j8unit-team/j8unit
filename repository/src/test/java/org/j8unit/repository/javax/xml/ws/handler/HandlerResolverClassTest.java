package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.HandlerResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerResolverClassTest
implements org.j8unit.repository.javax.xml.ws.handler.HandlerResolverClassTests<HandlerResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.HandlerResolver]

    @Override
    public Class<HandlerResolver> createNewSUT() {
        return HandlerResolver.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.HandlerResolver]

}
