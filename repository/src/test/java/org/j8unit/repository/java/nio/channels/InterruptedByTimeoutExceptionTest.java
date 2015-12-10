package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InterruptedByTimeoutExceptionTest
implements org.j8unit.repository.java.nio.channels.InterruptedByTimeoutExceptionTests<java.nio.channels.InterruptedByTimeoutException> {

    @Override
    public java.nio.channels.InterruptedByTimeoutException createNewSUT() {
        return new java.nio.channels.InterruptedByTimeoutException();
    }

}
