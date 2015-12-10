package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageContextClassTest
implements org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests<javax.xml.ws.handler.MessageContext> {

    @RunWith(J8Unit4.class)
    public static class ScopeClassTest
    implements org.j8unit.repository.javax.xml.ws.handler.MessageContextClassTests.ScopeClassTests<javax.xml.ws.handler.MessageContext.Scope> {

        @Override
        public Class<javax.xml.ws.handler.MessageContext.Scope> createNewSUT() {
            return javax.xml.ws.handler.MessageContext.Scope.class;
        }

    }

    @Override
    public Class<javax.xml.ws.handler.MessageContext> createNewSUT() {
        return javax.xml.ws.handler.MessageContext.class;
    }

}
