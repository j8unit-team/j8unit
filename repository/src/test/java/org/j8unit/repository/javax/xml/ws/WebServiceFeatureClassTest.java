package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceFeature;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceFeature} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebServiceFeatureClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceFeatureClassTest
implements WebServiceFeatureClassTests<WebServiceFeature> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceFeature]

    @Override
    public Class<WebServiceFeature> createNewSUT() {
        return WebServiceFeature.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceFeature]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceFeature]

}
