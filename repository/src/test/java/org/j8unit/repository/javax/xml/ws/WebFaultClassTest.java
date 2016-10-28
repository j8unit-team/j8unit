package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebFault;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebFaultClassTest
implements org.j8unit.repository.javax.xml.ws.WebFaultClassTests<WebFault> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebFault]

    @Override
    public Class<WebFault> createNewSUT() {
        return WebFault.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebFault]

}
