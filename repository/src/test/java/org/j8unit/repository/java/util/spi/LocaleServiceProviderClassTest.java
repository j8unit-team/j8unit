package org.j8unit.repository.java.util.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocaleServiceProviderClassTest
implements org.j8unit.repository.java.util.spi.LocaleServiceProviderClassTests<java.util.spi.LocaleServiceProvider> {

    @Override
    public Class<java.util.spi.LocaleServiceProvider> createNewSUT() {
        return java.util.spi.LocaleServiceProvider.class;
    }

}
