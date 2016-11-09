package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateFormatProvider} (by simply reusing
 * the J8Unit test interface {@link DateFormatProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class DateFormatProviderClassTest
implements DateFormatProviderClassTests<DateFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.DateFormatProvider]

    @Override
    public Class<DateFormatProvider> createNewSUT() {
        return DateFormatProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.DateFormatProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.DateFormatProvider]

}
