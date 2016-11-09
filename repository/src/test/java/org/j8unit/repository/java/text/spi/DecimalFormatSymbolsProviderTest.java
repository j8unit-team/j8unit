package org.j8unit.repository.java.text.spi;

import java.text.spi.DecimalFormatSymbolsProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DecimalFormatSymbolsProvider} (by
 * simply reusing the J8Unit test interface {@link DecimalFormatSymbolsProviderTests}).
 */

@RunWith(J8Unit4.class)
public class DecimalFormatSymbolsProviderTest
implements DecimalFormatSymbolsProviderTests<DecimalFormatSymbolsProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.DecimalFormatSymbolsProvider]

    @Override
    public DecimalFormatSymbolsProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.DecimalFormatSymbolsProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.DecimalFormatSymbolsProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.DecimalFormatSymbolsProvider]

}
