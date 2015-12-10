package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceFeatureClassTest
implements org.j8unit.repository.javax.xml.ws.WebServiceFeatureClassTests<javax.xml.ws.WebServiceFeature> {

    @Override
    public Class<javax.xml.ws.WebServiceFeature> createNewSUT() {
        return javax.xml.ws.WebServiceFeature.class;
    }

}
