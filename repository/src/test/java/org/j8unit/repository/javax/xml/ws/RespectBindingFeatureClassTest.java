package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RespectBindingFeatureClassTest
implements org.j8unit.repository.javax.xml.ws.RespectBindingFeatureClassTests<javax.xml.ws.RespectBindingFeature> {

    @Override
    public Class<javax.xml.ws.RespectBindingFeature> createNewSUT() {
        return javax.xml.ws.RespectBindingFeature.class;
    }

}
