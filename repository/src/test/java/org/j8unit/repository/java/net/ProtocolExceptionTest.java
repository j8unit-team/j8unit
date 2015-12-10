package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolExceptionTest
implements org.j8unit.repository.java.net.ProtocolExceptionTests<java.net.ProtocolException> {

    @Override
    public java.net.ProtocolException createNewSUT() {
        return new java.net.ProtocolException();
    }

}
