package org.j8unit.repository.java.util.spi;

import java.util.spi.TimeZoneNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TimeZoneNameProvider} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.spi.TimeZoneNameProviderClassTests}).
 */
@RunWith(J8Unit4.class)
public class TimeZoneNameProviderClassTest
implements TimeZoneNameProviderClassTests<TimeZoneNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.TimeZoneNameProvider]

    @Override
    public Class<TimeZoneNameProvider> createNewSUT() {
        return TimeZoneNameProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.TimeZoneNameProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.TimeZoneNameProvider]

}
