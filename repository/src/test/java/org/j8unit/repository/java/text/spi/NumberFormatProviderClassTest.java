package org.j8unit.repository.java.text.spi;

import java.text.spi.NumberFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NumberFormatProvider} (by simply reusing
 * the J8Unit test interface {@link NumberFormatProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class NumberFormatProviderClassTest
implements NumberFormatProviderClassTests<NumberFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.spi.NumberFormatProvider]

    @Override
    public Class<NumberFormatProvider> createNewSUT() {
        return NumberFormatProvider.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.spi.NumberFormatProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.spi.NumberFormatProvider]

}
