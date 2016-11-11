package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Provider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Provider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.ProviderTests}).
 */

@RunWith(J8Unit4.class)
public class ProviderTest<T>
implements ProviderTests<Provider<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Provider]

    @Override
    public Provider<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Provider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Provider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Provider]

}
