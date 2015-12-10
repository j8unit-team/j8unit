package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedByInterruptExceptionTest
implements org.j8unit.repository.java.nio.channels.ClosedByInterruptExceptionTests<java.nio.channels.ClosedByInterruptException> {

    @Override
    public java.nio.channels.ClosedByInterruptException createNewSUT() {
        return new java.nio.channels.ClosedByInterruptException();
    }

}
