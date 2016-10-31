package org.j8unit.repository.java.util.spi;

import java.util.spi.LocaleNameProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocaleNameProviderClassTest
implements org.j8unit.repository.java.util.spi.LocaleNameProviderClassTests<LocaleNameProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.spi.LocaleNameProvider]

    @Override
    public Class<LocaleNameProvider> createNewSUT() {
        return LocaleNameProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.spi.LocaleNameProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.spi.LocaleNameProvider]

}
