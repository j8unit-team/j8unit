package org.j8unit.repository.java.text.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateFormatProviderClassTest
implements org.j8unit.repository.java.text.spi.DateFormatProviderClassTests<java.text.spi.DateFormatProvider> {

    @Override
    public Class<java.text.spi.DateFormatProvider> createNewSUT() {
        return java.text.spi.DateFormatProvider.class;
    }

}
