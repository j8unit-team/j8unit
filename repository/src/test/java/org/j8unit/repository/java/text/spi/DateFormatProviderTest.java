package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DateFormatProvider} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.spi.DateFormatProviderTests}).
 */
@RunWith(J8Unit4.class)
public class DateFormatProviderTest
implements DateFormatProviderTests<DateFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.DateFormatProvider]

    @Override
    public DateFormatProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.DateFormatProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.DateFormatProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.DateFormatProvider]

}
