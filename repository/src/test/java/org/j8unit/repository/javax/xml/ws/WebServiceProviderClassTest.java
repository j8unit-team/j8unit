package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebServiceProvider} (by simply reusing
 * the J8Unit test interface {@link WebServiceProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebServiceProviderClassTest
implements WebServiceProviderClassTests<WebServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.WebServiceProvider]

    @Override
    public Class<WebServiceProvider> createNewSUT() {
        return WebServiceProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.WebServiceProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.WebServiceProvider]

}
