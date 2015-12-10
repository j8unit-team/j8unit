package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CancellationExceptionTest
implements org.j8unit.repository.java.util.concurrent.CancellationExceptionTests<java.util.concurrent.CancellationException> {

    @Override
    public java.util.concurrent.CancellationException createNewSUT() {
        return new java.util.concurrent.CancellationException();
    }

}
