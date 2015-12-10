package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateFormatSymbolsProviderClassTest
implements org.j8unit.repository.java.text.spi.DateFormatSymbolsProviderClassTests<java.text.spi.DateFormatSymbolsProvider> {

    @Override
    public Class<java.text.spi.DateFormatSymbolsProvider> createNewSUT() {
        return java.text.spi.DateFormatSymbolsProvider.class;
    }

}
