package org.j8unit.repository.java.util.spi;

import java.util.spi.CalendarNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarNameProviderTest
implements org.j8unit.repository.java.util.spi.CalendarNameProviderTests<CalendarNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.CalendarNameProvider]

    @Override
    public CalendarNameProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.CalendarNameProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.CalendarNameProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.CalendarNameProvider]

}
