package org.j8unit.repository.java.nio.charset.spi;

import java.nio.charset.spi.CharsetProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetProviderClassTest
implements org.j8unit.repository.java.nio.charset.spi.CharsetProviderClassTests<CharsetProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

    @Override
    public Class<CharsetProvider> createNewSUT() {
        return CharsetProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.spi.CharsetProvider]

}
