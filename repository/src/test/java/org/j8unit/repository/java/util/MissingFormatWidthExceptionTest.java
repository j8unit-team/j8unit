package org.j8unit.repository.java.util;

import java.util.MissingFormatWidthException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MissingFormatWidthExceptionTest
implements org.j8unit.repository.java.util.MissingFormatWidthExceptionTests<MissingFormatWidthException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.MissingFormatWidthException]

    @Override
    public MissingFormatWidthException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.MissingFormatWidthException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.MissingFormatWidthException]

}
