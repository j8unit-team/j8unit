package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogicalMessageClassTest
implements org.j8unit.repository.javax.xml.ws.LogicalMessageClassTests<javax.xml.ws.LogicalMessage> {

    @Override
    public Class<javax.xml.ws.LogicalMessage> createNewSUT() {
        return javax.xml.ws.LogicalMessage.class;
    }

}
