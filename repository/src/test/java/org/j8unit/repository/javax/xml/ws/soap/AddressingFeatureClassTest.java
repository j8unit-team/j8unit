package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AddressingFeatureClassTest
implements org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureClassTests<javax.xml.ws.soap.AddressingFeature> {

    @RunWith(J8Unit4.class)
    public static class ResponsesClassTest
    implements org.j8unit.repository.javax.xml.ws.soap.AddressingFeatureClassTests.ResponsesClassTests<javax.xml.ws.soap.AddressingFeature.Responses> {

        @Override
        public Class<javax.xml.ws.soap.AddressingFeature.Responses> createNewSUT() {
            return javax.xml.ws.soap.AddressingFeature.Responses.class;
        }

    }

    @Override
    public Class<javax.xml.ws.soap.AddressingFeature> createNewSUT() {
        return javax.xml.ws.soap.AddressingFeature.class;
    }

}
