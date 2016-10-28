package org.j8unit.repository.java.util;

import java.util.UnknownFormatConversionException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownFormatConversionExceptionTest
implements org.j8unit.repository.java.util.UnknownFormatConversionExceptionTests<UnknownFormatConversionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.UnknownFormatConversionException]

    @Override
    public UnknownFormatConversionException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.UnknownFormatConversionException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.UnknownFormatConversionException]

}
