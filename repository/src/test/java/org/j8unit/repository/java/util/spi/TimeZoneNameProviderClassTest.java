package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneNameProviderClassTest
implements org.j8unit.repository.java.util.spi.TimeZoneNameProviderClassTests<java.util.spi.TimeZoneNameProvider> {

    @Override
    public Class<java.util.spi.TimeZoneNameProvider> createNewSUT() {
        return java.util.spi.TimeZoneNameProvider.class;
    }

}
