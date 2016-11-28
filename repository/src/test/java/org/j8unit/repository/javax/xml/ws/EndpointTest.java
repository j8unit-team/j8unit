package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Endpoint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Endpoint} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.EndpointTests}).
 */
@RunWith(J8Unit4.class)
public class EndpointTest
implements EndpointTests<Endpoint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Endpoint]

    @Override
    public Endpoint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Endpoint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Endpoint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Endpoint]

}
