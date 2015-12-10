package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DecimalFormatSymbolsProviderClassTest
implements org.j8unit.repository.java.text.spi.DecimalFormatSymbolsProviderClassTests<java.text.spi.DecimalFormatSymbolsProvider> {

    @Override
    public Class<java.text.spi.DecimalFormatSymbolsProvider> createNewSUT() {
        return java.text.spi.DecimalFormatSymbolsProvider.class;
    }

}
