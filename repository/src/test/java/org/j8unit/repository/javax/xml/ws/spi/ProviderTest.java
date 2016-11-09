package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.Provider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Provider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.spi.ProviderTests}).
 */

@RunWith(J8Unit4.class)
public class ProviderTest
implements org.j8unit.repository.javax.xml.ws.spi.ProviderTests<Provider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.Provider]

    @Override
    public Provider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.spi.Provider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.spi.Provider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.spi.Provider]

}
