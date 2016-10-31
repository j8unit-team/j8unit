package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebFault;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebFaultTest
implements org.j8unit.repository.javax.xml.ws.WebFaultTests<WebFault> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebFault]

    @Override
    public WebFault createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebFault], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebFault]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebFault]

}
