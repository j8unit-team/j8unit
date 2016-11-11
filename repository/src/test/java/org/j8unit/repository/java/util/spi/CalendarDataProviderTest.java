package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarDataProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CalendarDataProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.spi.CalendarDataProviderTests}).
 */

@RunWith(J8Unit4.class)
public class CalendarDataProviderTest
implements CalendarDataProviderTests<CalendarDataProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

    @Override
    public CalendarDataProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.CalendarDataProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

}
