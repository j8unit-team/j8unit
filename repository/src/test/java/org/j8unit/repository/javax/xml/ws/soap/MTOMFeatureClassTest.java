package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MTOMFeatureClassTest
implements org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureClassTests<javax.xml.ws.soap.MTOMFeature> {

    @Override
    public Class<javax.xml.ws.soap.MTOMFeature> createNewSUT() {
        return javax.xml.ws.soap.MTOMFeature.class;
    }

}
