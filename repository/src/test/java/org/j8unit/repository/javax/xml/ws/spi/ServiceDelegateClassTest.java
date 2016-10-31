package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.ServiceDelegate;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceDelegateClassTest
implements org.j8unit.repository.javax.xml.ws.spi.ServiceDelegateClassTests<ServiceDelegate> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.spi.ServiceDelegate]

    @Override
    public Class<ServiceDelegate> createNewSUT() {
        return ServiceDelegate.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.spi.ServiceDelegate]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.spi.ServiceDelegate]

}
