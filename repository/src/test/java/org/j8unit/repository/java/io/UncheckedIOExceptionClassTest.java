package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UncheckedIOExceptionClassTest
implements org.j8unit.repository.java.io.UncheckedIOExceptionClassTests<java.io.UncheckedIOException> {

    @Override
    public Class<java.io.UncheckedIOException> createNewSUT() {
        return java.io.UncheckedIOException.class;
    }

}
