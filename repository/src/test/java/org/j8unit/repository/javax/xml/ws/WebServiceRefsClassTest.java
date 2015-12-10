package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceRefsClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceRefsClassTests<javax.xml.ws.WebServiceRefs> {

    @Override
    public Class<javax.xml.ws.WebServiceRefs> createNewSUT() {
        return javax.xml.ws.WebServiceRefs.class;
    }

}
