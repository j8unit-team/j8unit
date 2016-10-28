package org.j8unit.repository.java.nio.channels.spi;

import java.nio.channels.spi.SelectorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectorProviderTest
implements org.j8unit.repository.java.nio.channels.spi.SelectorProviderTests<SelectorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.SelectorProvider]

    @Override
    public SelectorProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.spi.SelectorProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.spi.SelectorProvider]

}
