package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPEnvelope;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPEnvelope} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPEnvelopeTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPEnvelopeTest
implements SOAPEnvelopeTests<SOAPEnvelope> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPEnvelope]

    @Override
    public SOAPEnvelope createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPEnvelope], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.soap.SOAPEnvelope]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.soap.SOAPEnvelope]

}
