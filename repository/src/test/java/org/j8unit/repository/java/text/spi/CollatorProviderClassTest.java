package org.j8unit.repository.java.text.spi;

import java.text.spi.CollatorProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollatorProviderClassTest
implements org.j8unit.repository.java.text.spi.CollatorProviderClassTests<CollatorProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.CollatorProvider]

    @Override
    public Class<CollatorProvider> createNewSUT() {
        return CollatorProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.CollatorProvider]

}
