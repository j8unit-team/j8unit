package org.j8unit.repository.java.util;

import java.util.IllegalFormatWidthException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalFormatWidthExceptionTest
implements org.j8unit.repository.java.util.IllegalFormatWidthExceptionTests<IllegalFormatWidthException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatWidthException]

    @Override
    public IllegalFormatWidthException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.IllegalFormatWidthException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatWidthException]

}
