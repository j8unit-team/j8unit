package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebServiceProvider} (by simply
 * reusing the J8Unit test interface {@link WebServiceProviderTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceProviderTest
implements WebServiceProviderTests<WebServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServiceProvider]

    @Override
    public WebServiceProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.WebServiceProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebServiceProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebServiceProvider]

}
