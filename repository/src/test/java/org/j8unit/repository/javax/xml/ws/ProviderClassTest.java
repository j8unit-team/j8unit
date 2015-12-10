package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ProviderClassTest
implements org.j8unit.repository.javax.xml.ws.ProviderClassTests<javax.xml.ws.Provider> {

    @Override
    public Class<javax.xml.ws.Provider> createNewSUT() {
        return javax.xml.ws.Provider.class;
    }

}
