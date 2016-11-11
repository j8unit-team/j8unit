package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebServiceFeatureAnnotation} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.ws.spi.WebServiceFeatureAnnotationTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceFeatureAnnotationTest
implements WebServiceFeatureAnnotationTests<WebServiceFeatureAnnotation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

    @Override
    public WebServiceFeatureAnnotation createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.spi.WebServiceFeatureAnnotation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.spi.WebServiceFeatureAnnotation]

}
