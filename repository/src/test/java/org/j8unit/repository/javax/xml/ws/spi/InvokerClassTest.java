package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvokerClassTest
implements org.j8unit.repository.javax.xml.ws.spi.InvokerClassTests<javax.xml.ws.spi.Invoker> {

    @Override
    public Class<javax.xml.ws.spi.Invoker> createNewSUT() {
        return javax.xml.ws.spi.Invoker.class;
    }

}
