package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BreakIteratorProviderClassTest
implements org.j8unit.repository.java.text.spi.BreakIteratorProviderClassTests<java.text.spi.BreakIteratorProvider> {

    @Override
    public Class<java.text.spi.BreakIteratorProvider> createNewSUT() {
        return java.text.spi.BreakIteratorProvider.class;
    }

}
