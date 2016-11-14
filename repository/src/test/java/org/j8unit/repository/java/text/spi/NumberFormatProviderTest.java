package org.j8unit.repository.java.text.spi;

import java.text.spi.NumberFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NumberFormatProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.spi.NumberFormatProviderTests}).
 */

@RunWith(J8Unit4.class)
public class NumberFormatProviderTest
implements NumberFormatProviderTests<NumberFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.NumberFormatProvider]

    @Override
    public NumberFormatProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.NumberFormatProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.NumberFormatProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.NumberFormatProvider]

}
