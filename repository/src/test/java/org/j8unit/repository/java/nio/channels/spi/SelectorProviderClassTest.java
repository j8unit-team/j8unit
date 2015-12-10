package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectorProviderClassTest
implements org.j8unit.repository.java.nio.channels.spi.SelectorProviderClassTests<java.nio.channels.spi.SelectorProvider> {

    @Override
    public Class<java.nio.channels.spi.SelectorProvider> createNewSUT() {
        return java.nio.channels.spi.SelectorProvider.class;
    }

}
