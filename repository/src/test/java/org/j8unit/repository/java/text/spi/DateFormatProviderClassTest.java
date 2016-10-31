package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateFormatProviderClassTest
implements org.j8unit.repository.java.text.spi.DateFormatProviderClassTests<DateFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.DateFormatProvider]

    @Override
    public Class<DateFormatProvider> createNewSUT() {
        return DateFormatProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.DateFormatProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.DateFormatProvider]

}
