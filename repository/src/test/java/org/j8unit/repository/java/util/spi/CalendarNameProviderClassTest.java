package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarNameProviderClassTest
implements org.j8unit.repository.java.util.spi.CalendarNameProviderClassTests<CalendarNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.CalendarNameProvider]

    @Override
    public Class<CalendarNameProvider> createNewSUT() {
        return CalendarNameProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.CalendarNameProvider]

}
