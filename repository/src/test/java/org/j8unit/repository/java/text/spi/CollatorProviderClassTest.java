package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollatorProviderClassTest
implements org.j8unit.repository.java.text.spi.CollatorProviderClassTests<java.text.spi.CollatorProvider> {

    @Override
    public Class<java.text.spi.CollatorProvider> createNewSUT() {
        return java.text.spi.CollatorProvider.class;
    }

}
