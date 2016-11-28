package org.j8unit.repository.javax.xml.ws.wsaddressing;

import javax.xml.ws.wsaddressing.W3CEndpointReference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link W3CEndpointReference} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.wsaddressing.W3CEndpointReferenceTests}).
 */
@RunWith(J8Unit4.class)
public class W3CEndpointReferenceTest
implements W3CEndpointReferenceTests<W3CEndpointReference> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReference]

    @Override
    public W3CEndpointReference createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.wsaddressing.W3CEndpointReference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReference]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.wsaddressing.W3CEndpointReference]

}
