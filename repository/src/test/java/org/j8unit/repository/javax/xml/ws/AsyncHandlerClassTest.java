package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AsyncHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.AsyncHandlerClassTests<javax.xml.ws.AsyncHandler> {

    @Override
    public Class<javax.xml.ws.AsyncHandler> createNewSUT() {
        return javax.xml.ws.AsyncHandler.class;
    }

}
