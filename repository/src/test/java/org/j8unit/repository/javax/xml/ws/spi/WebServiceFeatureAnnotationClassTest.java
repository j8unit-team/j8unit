package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceFeatureAnnotation} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.ws.spi.WebServiceFeatureAnnotationClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceFeatureAnnotationClassTest
implements WebServiceFeatureAnnotationClassTests<WebServiceFeatureAnnotation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

    @Override
    public Class<WebServiceFeatureAnnotation> createNewSUT() {
        return WebServiceFeatureAnnotation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

}
