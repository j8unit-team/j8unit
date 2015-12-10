package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class HandlerClassTest
implements org.j8unit.repository.javax.xml.ws.handler.HandlerClassTests<javax.xml.ws.handler.Handler> {

    @Override
    public Class<javax.xml.ws.handler.Handler> createNewSUT() {
        return javax.xml.ws.handler.Handler.class;
    }

}
