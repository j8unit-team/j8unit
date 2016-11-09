package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.BindingProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingProvider} (by simply reusing the
 * J8Unit test interface {@link BindingProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingProviderClassTest
implements BindingProviderClassTests<BindingProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.BindingProvider]

    @Override
    public Class<BindingProvider> createNewSUT() {
        return BindingProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.BindingProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.BindingProvider]

}
