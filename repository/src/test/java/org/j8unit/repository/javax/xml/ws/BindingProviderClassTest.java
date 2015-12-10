package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingProviderClassTest
implements org.j8unit.repository.javax.xml.ws.BindingProviderClassTests<javax.xml.ws.BindingProvider> {

    @Override
    public Class<javax.xml.ws.BindingProvider> createNewSUT() {
        return javax.xml.ws.BindingProvider.class;
    }

}
