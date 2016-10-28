package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceContextClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceContextClassTests<WebServiceContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceContext]

    @Override
    public Class<WebServiceContext> createNewSUT() {
        return WebServiceContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceContext]

}
