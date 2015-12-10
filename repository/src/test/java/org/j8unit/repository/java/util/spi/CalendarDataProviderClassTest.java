package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarDataProviderClassTest
implements org.j8unit.repository.java.util.spi.CalendarDataProviderClassTests<java.util.spi.CalendarDataProvider> {

    @Override
    public Class<java.util.spi.CalendarDataProvider> createNewSUT() {
        return java.util.spi.CalendarDataProvider.class;
    }

}
