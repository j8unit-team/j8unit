package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotYetConnectedExceptionTest
implements org.j8unit.repository.java.nio.channels.NotYetConnectedExceptionTests<java.nio.channels.NotYetConnectedException> {

    @Override
    public java.nio.channels.NotYetConnectedException createNewSUT() {
        return new java.nio.channels.NotYetConnectedException();
    }

}
