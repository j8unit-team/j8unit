package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.LogicalMessage;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogicalMessageClassTest
implements org.j8unit.repository.javax.xml.ws.LogicalMessageClassTests<LogicalMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.LogicalMessage]

    @Override
    public Class<LogicalMessage> createNewSUT() {
        return LogicalMessage.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.LogicalMessage]

}
