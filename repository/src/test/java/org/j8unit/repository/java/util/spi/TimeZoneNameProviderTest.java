package org.j8unit.repository.java.util.spi;

import java.util.spi.TimeZoneNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneNameProviderTest
implements org.j8unit.repository.java.util.spi.TimeZoneNameProviderTests<TimeZoneNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.TimeZoneNameProvider]

    @Override
    public TimeZoneNameProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.TimeZoneNameProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.TimeZoneNameProvider]

}
