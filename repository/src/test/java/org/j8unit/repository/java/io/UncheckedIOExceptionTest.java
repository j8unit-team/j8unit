package org.j8unit.repository.java.io;

import java.io.UncheckedIOException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UncheckedIOExceptionTest
implements org.j8unit.repository.java.io.UncheckedIOExceptionTests<UncheckedIOException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.UncheckedIOException]

    @Override
    public UncheckedIOException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.UncheckedIOException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.UncheckedIOException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.UncheckedIOException]

}
