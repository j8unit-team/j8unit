package org.j8unit.repository.java.text.spi;

import java.text.spi.BreakIteratorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BreakIteratorProviderTest
implements org.j8unit.repository.java.text.spi.BreakIteratorProviderTests<BreakIteratorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.BreakIteratorProvider]

    @Override
    public BreakIteratorProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.BreakIteratorProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.BreakIteratorProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.BreakIteratorProvider]

}
