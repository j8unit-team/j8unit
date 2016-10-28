package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceRefs;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceRefsClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceRefsClassTests<WebServiceRefs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceRefs]

    @Override
    public Class<WebServiceRefs> createNewSUT() {
        return WebServiceRefs.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceRefs]

}
