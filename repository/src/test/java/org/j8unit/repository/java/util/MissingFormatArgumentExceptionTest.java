package org.j8unit.repository.java.util;

import java.util.MissingFormatArgumentException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MissingFormatArgumentExceptionTest
implements org.j8unit.repository.java.util.MissingFormatArgumentExceptionTests<MissingFormatArgumentException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.MissingFormatArgumentException]

    @Override
    public MissingFormatArgumentException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.MissingFormatArgumentException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.MissingFormatArgumentException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.MissingFormatArgumentException]

}
