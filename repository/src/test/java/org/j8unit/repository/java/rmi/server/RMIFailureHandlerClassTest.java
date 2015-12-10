package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIFailureHandlerClassTest
implements org.j8unit.repository.java.rmi.server.RMIFailureHandlerClassTests<java.rmi.server.RMIFailureHandler> {

    @Override
    public Class<java.rmi.server.RMIFailureHandler> createNewSUT() {
        return java.rmi.server.RMIFailureHandler.class;
    }

}
