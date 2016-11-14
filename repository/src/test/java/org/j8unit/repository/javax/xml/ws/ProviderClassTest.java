package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Provider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Provider} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.ProviderClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ProviderClassTest
implements ProviderClassTests<Provider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Provider]

    @Override
    public Class<Provider> createNewSUT() {
        return Provider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Provider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Provider]

}
