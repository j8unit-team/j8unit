package org.j8unit.repository.java.io;

import java.io.InvalidClassException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidClassExceptionTest
implements org.j8unit.repository.java.io.InvalidClassExceptionTests<InvalidClassException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.InvalidClassException]

    @Override
    public InvalidClassException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.InvalidClassException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.InvalidClassException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.InvalidClassException]

}
