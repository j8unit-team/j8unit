package org.j8unit.repository.java.nio.charset.spi;

import java.nio.charset.spi.CharsetProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharsetProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.charset.spi.CharsetProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class CharsetProviderClassTest
implements CharsetProviderClassTests<CharsetProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

    @Override
    public Class<CharsetProvider> createNewSUT() {
        return CharsetProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

}
