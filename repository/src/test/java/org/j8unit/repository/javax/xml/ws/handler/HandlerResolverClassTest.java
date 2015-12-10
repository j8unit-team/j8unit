package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerResolverClassTest
implements org.j8unit.repository.javax.xml.ws.handler.HandlerResolverClassTests<javax.xml.ws.handler.HandlerResolver> {

    @Override
    public Class<javax.xml.ws.handler.HandlerResolver> createNewSUT() {
        return javax.xml.ws.handler.HandlerResolver.class;
    }

}
