package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CalendarNameProvider} (by simply reusing
 * the J8Unit test interface {@link CalendarNameProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CalendarNameProviderClassTest
implements CalendarNameProviderClassTests<CalendarNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.CalendarNameProvider]

    @Override
    public Class<CalendarNameProvider> createNewSUT() {
        return CalendarNameProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.CalendarNameProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.CalendarNameProvider]

}
