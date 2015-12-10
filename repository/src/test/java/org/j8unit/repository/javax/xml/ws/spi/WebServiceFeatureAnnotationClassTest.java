package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServiceFeatureAnnotationClassTest
implements org.j8unit.repository.javax.xml.ws.spi.WebServiceFeatureAnnotationClassTests<javax.xml.ws.spi.WebServiceFeatureAnnotation> {

    @Override
    public Class<javax.xml.ws.spi.WebServiceFeatureAnnotation> createNewSUT() {
        return javax.xml.ws.spi.WebServiceFeatureAnnotation.class;
    }

}
