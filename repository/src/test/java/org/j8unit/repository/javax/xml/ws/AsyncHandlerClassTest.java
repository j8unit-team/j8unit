package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.AsyncHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AsyncHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.AsyncHandlerClassTests<AsyncHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.AsyncHandler]

    @Override
    public Class<AsyncHandler> createNewSUT() {
        return AsyncHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.AsyncHandler]

}
