package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownHostExceptionTest
implements org.j8unit.repository.java.net.UnknownHostExceptionTests<java.net.UnknownHostException> {

    @Override
    public java.net.UnknownHostException createNewSUT() {
        return new java.net.UnknownHostException();
    }

}
