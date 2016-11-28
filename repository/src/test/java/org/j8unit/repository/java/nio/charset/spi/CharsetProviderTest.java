package org.j8unit.repository.java.nio.charset.spi;

import java.nio.charset.spi.CharsetProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CharsetProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.charset.spi.CharsetProviderTests}).
 */
@RunWith(J8Unit4.class)
public class CharsetProviderTest
implements CharsetProviderTests<CharsetProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.spi.CharsetProvider]

    @Override
    public CharsetProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.charset.spi.CharsetProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.spi.CharsetProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.spi.CharsetProvider]

}
