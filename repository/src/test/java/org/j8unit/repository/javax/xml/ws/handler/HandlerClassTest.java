package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.Handler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class HandlerClassTest
implements org.j8unit.repository.javax.xml.ws.handler.HandlerClassTests<Handler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.Handler]

    @Override
    public Class<Handler> createNewSUT() {
        return Handler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.Handler]

}
