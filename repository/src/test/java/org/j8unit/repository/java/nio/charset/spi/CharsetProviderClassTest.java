package org.j8unit.repository.java.nio.charset.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetProviderClassTest
implements org.j8unit.repository.java.nio.charset.spi.CharsetProviderClassTests<java.nio.charset.spi.CharsetProvider> {

    @Override
    public Class<java.nio.charset.spi.CharsetProvider> createNewSUT() {
        return java.nio.charset.spi.CharsetProvider.class;
    }

}
