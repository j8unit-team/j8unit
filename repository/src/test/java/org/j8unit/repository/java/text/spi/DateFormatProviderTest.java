package org.j8unit.repository.java.text.spi;

import java.text.spi.DateFormatProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateFormatProviderTest
implements org.j8unit.repository.java.text.spi.DateFormatProviderTests<DateFormatProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.spi.DateFormatProvider]

    @Override
    public DateFormatProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.spi.DateFormatProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.spi.DateFormatProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.spi.DateFormatProvider]

}
