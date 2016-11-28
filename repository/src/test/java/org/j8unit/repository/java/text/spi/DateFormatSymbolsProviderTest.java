package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatSymbolsProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DateFormatSymbolsProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.spi.DateFormatSymbolsProviderTests}).
 */
@RunWith(J8Unit4.class)
public class DateFormatSymbolsProviderTest
implements DateFormatSymbolsProviderTests<DateFormatSymbolsProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.DateFormatSymbolsProvider]

    @Override
    public DateFormatSymbolsProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.DateFormatSymbolsProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.DateFormatSymbolsProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.DateFormatSymbolsProvider]

}
