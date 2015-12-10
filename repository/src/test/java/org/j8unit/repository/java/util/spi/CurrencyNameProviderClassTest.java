package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrencyNameProviderClassTest
implements org.j8unit.repository.java.util.spi.CurrencyNameProviderClassTests<java.util.spi.CurrencyNameProvider> {

    @Override
    public Class<java.util.spi.CurrencyNameProvider> createNewSUT() {
        return java.util.spi.CurrencyNameProvider.class;
    }

}
