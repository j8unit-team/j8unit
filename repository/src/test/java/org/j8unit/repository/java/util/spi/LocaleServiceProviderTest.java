package org.j8unit.repository.java.util.spi;

import java.util.spi.LocaleServiceProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocaleServiceProviderTest
implements org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<LocaleServiceProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.spi.LocaleServiceProvider]

    @Override
    public LocaleServiceProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.spi.LocaleServiceProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.spi.LocaleServiceProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.spi.LocaleServiceProvider]

}
