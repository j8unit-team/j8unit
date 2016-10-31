package org.j8unit.repository.java.text.spi;

import java.text.spi.BreakIteratorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BreakIteratorProviderClassTest
implements org.j8unit.repository.java.text.spi.BreakIteratorProviderClassTests<BreakIteratorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.BreakIteratorProvider]

    @Override
    public Class<BreakIteratorProvider> createNewSUT() {
        return BreakIteratorProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.BreakIteratorProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.BreakIteratorProvider]

}
