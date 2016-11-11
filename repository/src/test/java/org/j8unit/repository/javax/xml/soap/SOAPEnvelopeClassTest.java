package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPEnvelope;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPEnvelope} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPEnvelopeClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPEnvelopeClassTest
implements SOAPEnvelopeClassTests<SOAPEnvelope> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPEnvelope]

    @Override
    public Class<SOAPEnvelope> createNewSUT() {
        return SOAPEnvelope.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPEnvelope]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPEnvelope]

}
