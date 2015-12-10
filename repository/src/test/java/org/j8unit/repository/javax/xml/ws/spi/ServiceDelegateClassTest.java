package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceDelegateClassTest
implements org.j8unit.repository.javax.xml.ws.spi.ServiceDelegateClassTests<javax.xml.ws.spi.ServiceDelegate> {

    @Override
    public Class<javax.xml.ws.spi.ServiceDelegate> createNewSUT() {
        return javax.xml.ws.spi.ServiceDelegate.class;
    }

}
