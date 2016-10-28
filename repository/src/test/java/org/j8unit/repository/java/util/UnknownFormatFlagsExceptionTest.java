package org.j8unit.repository.java.util;

import java.util.UnknownFormatFlagsException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownFormatFlagsExceptionTest
implements org.j8unit.repository.java.util.UnknownFormatFlagsExceptionTests<UnknownFormatFlagsException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.UnknownFormatFlagsException]

    @Override
    public UnknownFormatFlagsException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.UnknownFormatFlagsException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.UnknownFormatFlagsException]

}
