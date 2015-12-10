package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderClassTest
implements org.j8unit.repository.javax.xml.ws.spi.ProviderClassTests<javax.xml.ws.spi.Provider> {

    @Override
    public Class<javax.xml.ws.spi.Provider> createNewSUT() {
        return javax.xml.ws.spi.Provider.class;
    }

}
