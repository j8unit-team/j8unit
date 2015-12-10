package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MTOMFeatureTest
implements org.j8unit.repository.javax.xml.ws.soap.MTOMFeatureTests<javax.xml.ws.soap.MTOMFeature> {

    @Override
    public javax.xml.ws.soap.MTOMFeature createNewSUT() {
        return new javax.xml.ws.soap.MTOMFeature();
    }

}
