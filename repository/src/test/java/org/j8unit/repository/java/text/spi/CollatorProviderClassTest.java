package org.j8unit.repository.java.text.spi;

import java.text.spi.CollatorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CollatorProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.spi.CollatorProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class CollatorProviderClassTest
implements CollatorProviderClassTests<CollatorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.CollatorProvider]

    @Override
    public Class<CollatorProvider> createNewSUT() {
        return CollatorProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.CollatorProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.CollatorProvider]

}
