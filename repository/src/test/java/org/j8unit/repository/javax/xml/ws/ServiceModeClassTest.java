package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceModeClassTest
implements org.j8unit.repository.javax.xml.ws.ServiceModeClassTests<javax.xml.ws.ServiceMode> {

    @Override
    public Class<javax.xml.ws.ServiceMode> createNewSUT() {
        return javax.xml.ws.ServiceMode.class;
    }

}
