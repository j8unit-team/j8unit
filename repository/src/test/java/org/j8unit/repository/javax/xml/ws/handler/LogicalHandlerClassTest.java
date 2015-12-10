package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LogicalHandlerClassTest
implements org.j8unit.repository.javax.xml.ws.handler.LogicalHandlerClassTests<javax.xml.ws.handler.LogicalHandler> {

    @Override
    public Class<javax.xml.ws.handler.LogicalHandler> createNewSUT() {
        return javax.xml.ws.handler.LogicalHandler.class;
    }

}
