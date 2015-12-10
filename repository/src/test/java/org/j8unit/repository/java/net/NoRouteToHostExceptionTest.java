package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoRouteToHostExceptionTest
implements org.j8unit.repository.java.net.NoRouteToHostExceptionTests<java.net.NoRouteToHostException> {

    @Override
    public java.net.NoRouteToHostException createNewSUT() {
        return new java.net.NoRouteToHostException();
    }

}
