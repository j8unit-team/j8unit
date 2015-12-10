package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatProviderClassTest
implements org.j8unit.repository.java.text.spi.NumberFormatProviderClassTests<java.text.spi.NumberFormatProvider> {

    @Override
    public Class<java.text.spi.NumberFormatProvider> createNewSUT() {
        return java.text.spi.NumberFormatProvider.class;
    }

}
