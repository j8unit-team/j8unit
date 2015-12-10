package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerCloneExceptionClassTest
implements org.j8unit.repository.java.rmi.server.ServerCloneExceptionClassTests<java.rmi.server.ServerCloneException> {

    @Override
    public Class<java.rmi.server.ServerCloneException> createNewSUT() {
        return java.rmi.server.ServerCloneException.class;
    }

}
