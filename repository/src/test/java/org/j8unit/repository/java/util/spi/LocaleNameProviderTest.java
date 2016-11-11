package org.j8unit.repository.java.util.spi;

import java.util.spi.LocaleNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LocaleNameProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.spi.LocaleNameProviderTests}).
 */

@RunWith(J8Unit4.class)
public class LocaleNameProviderTest
implements LocaleNameProviderTests<LocaleNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.LocaleNameProvider]

    @Override
    public LocaleNameProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.LocaleNameProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.LocaleNameProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.LocaleNameProvider]

}
