package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.ServiceMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceModeClassTest
implements org.j8unit.repository.javax.xml.ws.ServiceModeClassTests<ServiceMode> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.ServiceMode]

    @Override
    public Class<ServiceMode> createNewSUT() {
        return ServiceMode.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.ServiceMode]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.ServiceMode]

}
