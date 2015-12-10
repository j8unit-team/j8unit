package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebFaultClassTest
implements org.j8unit.repository.javax.xml.ws.WebFaultClassTests<javax.xml.ws.WebFault> {

    @Override
    public Class<javax.xml.ws.WebFault> createNewSUT() {
        return javax.xml.ws.WebFault.class;
    }

}
