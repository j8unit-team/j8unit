package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CalendarNameProviderClassTest
implements org.j8unit.repository.java.util.spi.CalendarNameProviderClassTests<java.util.spi.CalendarNameProvider> {

    @Override
    public Class<java.util.spi.CalendarNameProvider> createNewSUT() {
        return java.util.spi.CalendarNameProvider.class;
    }

}
