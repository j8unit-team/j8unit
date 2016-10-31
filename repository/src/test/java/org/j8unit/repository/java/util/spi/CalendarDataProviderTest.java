package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarDataProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarDataProviderTest
implements org.j8unit.repository.java.util.spi.CalendarDataProviderTests<CalendarDataProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

    @Override
    public CalendarDataProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.CalendarDataProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.CalendarDataProvider]

}
