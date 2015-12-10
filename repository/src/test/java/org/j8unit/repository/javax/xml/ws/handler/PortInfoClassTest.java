package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortInfoClassTest
implements org.j8unit.repository.javax.xml.ws.handler.PortInfoClassTests<javax.xml.ws.handler.PortInfo> {

    @Override
    public Class<javax.xml.ws.handler.PortInfo> createNewSUT() {
        return javax.xml.ws.handler.PortInfo.class;
    }

}
