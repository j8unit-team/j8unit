package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceRef;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceRefTest
implements org.j8unit.repository.javax.xml.ws.WebServiceRefTests<WebServiceRef> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceRef]

    @Override
    public WebServiceRef createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebServiceRef], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceRef]

}
