package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarDataProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarDataProviderClassTest
implements org.j8unit.repository.java.util.spi.CalendarDataProviderClassTests<CalendarDataProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.CalendarDataProvider]

    @Override
    public Class<CalendarDataProvider> createNewSUT() {
        return CalendarDataProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.CalendarDataProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.CalendarDataProvider]

}
