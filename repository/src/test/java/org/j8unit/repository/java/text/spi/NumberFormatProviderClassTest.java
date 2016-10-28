package org.j8unit.repository.java.text.spi;

import java.text.spi.NumberFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatProviderClassTest
implements org.j8unit.repository.java.text.spi.NumberFormatProviderClassTests<NumberFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.NumberFormatProvider]

    @Override
    public Class<NumberFormatProvider> createNewSUT() {
        return NumberFormatProvider.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.NumberFormatProvider]

}
