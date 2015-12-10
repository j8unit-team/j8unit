package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPEnvelopeClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPEnvelopeClassTests<javax.xml.soap.SOAPEnvelope> {

    @Override
    public Class<javax.xml.soap.SOAPEnvelope> createNewSUT() {
        return javax.xml.soap.SOAPEnvelope.class;
    }

}
