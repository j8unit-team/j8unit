package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RespectBindingFeatureTest
implements org.j8unit.repository.javax.xml.ws.RespectBindingFeatureTests<javax.xml.ws.RespectBindingFeature> {

    @Override
    public javax.xml.ws.RespectBindingFeature createNewSUT() {
        return new javax.xml.ws.RespectBindingFeature();
    }

}