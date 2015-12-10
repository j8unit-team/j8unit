package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceRefClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceRefClassTests<javax.xml.ws.WebServiceRef> {

    @Override
    public Class<javax.xml.ws.WebServiceRef> createNewSUT() {
        return javax.xml.ws.WebServiceRef.class;
    }

}
