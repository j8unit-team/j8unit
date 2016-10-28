package org.j8unit.repository.java.util.spi;

import java.util.spi.CurrencyNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrencyNameProviderClassTest
implements org.j8unit.repository.java.util.spi.CurrencyNameProviderClassTests<CurrencyNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.CurrencyNameProvider]

    @Override
    public Class<CurrencyNameProvider> createNewSUT() {
        return CurrencyNameProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.CurrencyNameProvider]

}
