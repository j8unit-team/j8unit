package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoRouteToHostExceptionClassTest
implements org.j8unit.repository.java.net.NoRouteToHostExceptionClassTests<java.net.NoRouteToHostException> {

    @Override
    public Class<java.net.NoRouteToHostException> createNewSUT() {
        return java.net.NoRouteToHostException.class;
    }

}
