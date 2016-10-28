package org.j8unit.repository.java.io;

import java.io.OptionalDataException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionalDataExceptionTest
implements org.j8unit.repository.java.io.OptionalDataExceptionTests<OptionalDataException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.OptionalDataException]

    @Override
    public OptionalDataException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.OptionalDataException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.OptionalDataException]

}
