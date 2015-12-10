package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceProviderClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceProviderClassTests<javax.xml.ws.WebServiceProvider> {

    @Override
    public Class<javax.xml.ws.WebServiceProvider> createNewSUT() {
        return javax.xml.ws.WebServiceProvider.class;
    }

}
