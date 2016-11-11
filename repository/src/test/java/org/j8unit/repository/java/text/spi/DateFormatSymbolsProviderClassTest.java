package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatSymbolsProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateFormatSymbolsProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.spi.DateFormatSymbolsProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class DateFormatSymbolsProviderClassTest
implements DateFormatSymbolsProviderClassTests<DateFormatSymbolsProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.DateFormatSymbolsProvider]

    @Override
    public Class<DateFormatSymbolsProvider> createNewSUT() {
        return DateFormatSymbolsProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.DateFormatSymbolsProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.DateFormatSymbolsProvider]

}
