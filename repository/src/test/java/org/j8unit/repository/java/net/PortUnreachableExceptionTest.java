package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortUnreachableExceptionTest
implements org.j8unit.repository.java.net.PortUnreachableExceptionTests<java.net.PortUnreachableException> {

    @Override
    public java.net.PortUnreachableException createNewSUT() {
        return new java.net.PortUnreachableException();
    }

}
