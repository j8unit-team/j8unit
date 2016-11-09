package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceRefs;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebServiceRefs} (by simply reusing
 * the J8Unit test interface {@link WebServiceRefsTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceRefsTest
implements WebServiceRefsTests<WebServiceRefs> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceRefs]

    @Override
    public WebServiceRefs createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebServiceRefs], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebServiceRefs]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebServiceRefs]

}
