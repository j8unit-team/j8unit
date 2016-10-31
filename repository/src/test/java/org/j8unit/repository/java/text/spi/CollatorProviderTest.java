package org.j8unit.repository.java.text.spi;

import java.text.spi.CollatorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollatorProviderTest
implements org.j8unit.repository.java.text.spi.CollatorProviderTests<CollatorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.CollatorProvider]

    @Override
    public CollatorProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.CollatorProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.CollatorProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.CollatorProvider]

}
