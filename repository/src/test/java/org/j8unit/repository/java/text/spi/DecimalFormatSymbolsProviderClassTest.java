package org.j8unit.repository.java.text.spi;

import java.text.spi.DecimalFormatSymbolsProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DecimalFormatSymbolsProvider} (by simply
 * reusing the J8Unit test interface {@link DecimalFormatSymbolsProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class DecimalFormatSymbolsProviderClassTest
implements DecimalFormatSymbolsProviderClassTests<DecimalFormatSymbolsProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.DecimalFormatSymbolsProvider]

    @Override
    public Class<DecimalFormatSymbolsProvider> createNewSUT() {
        return DecimalFormatSymbolsProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.DecimalFormatSymbolsProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.DecimalFormatSymbolsProvider]

}
