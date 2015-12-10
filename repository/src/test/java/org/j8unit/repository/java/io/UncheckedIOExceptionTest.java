package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UncheckedIOExceptionTest
implements org.j8unit.repository.java.io.UncheckedIOExceptionTests<java.io.UncheckedIOException> {

    @Override
    public java.io.UncheckedIOException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.io.UncheckedIOException] available.");
    }

}
