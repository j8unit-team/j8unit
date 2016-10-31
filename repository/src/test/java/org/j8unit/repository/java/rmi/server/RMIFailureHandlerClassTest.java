package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIFailureHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIFailureHandlerClassTest
implements org.j8unit.repository.java.rmi.server.RMIFailureHandlerClassTests<RMIFailureHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RMIFailureHandler]

    @Override
    public Class<RMIFailureHandler> createNewSUT() {
        return RMIFailureHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RMIFailureHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RMIFailureHandler]

}
