package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceContextTest
implements org.j8unit.repository.javax.xml.ws.WebServiceContextTests<WebServiceContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceContext]

    @Override
    public WebServiceContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebServiceContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebServiceContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebServiceContext]

}
