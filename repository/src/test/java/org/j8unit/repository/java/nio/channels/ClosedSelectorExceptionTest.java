package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClosedSelectorExceptionTest
implements org.j8unit.repository.java.nio.channels.ClosedSelectorExceptionTests<java.nio.channels.ClosedSelectorException> {

    @Override
    public java.nio.channels.ClosedSelectorException createNewSUT() {
        return new java.nio.channels.ClosedSelectorException();
    }

}
