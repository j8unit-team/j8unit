package org.j8unit.repository.java.util.spi;

import java.util.spi.TimeZoneNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneNameProviderClassTest
implements org.j8unit.repository.java.util.spi.TimeZoneNameProviderClassTests<TimeZoneNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.TimeZoneNameProvider]

    @Override
    public Class<TimeZoneNameProvider> createNewSUT() {
        return TimeZoneNameProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.TimeZoneNameProvider]

}
