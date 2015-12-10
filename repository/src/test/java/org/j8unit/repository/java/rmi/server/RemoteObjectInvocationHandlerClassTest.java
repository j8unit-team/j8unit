package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteObjectInvocationHandlerClassTest
implements org.j8unit.repository.java.rmi.server.RemoteObjectInvocationHandlerClassTests<java.rmi.server.RemoteObjectInvocationHandler> {

    @Override
    public Class<java.rmi.server.RemoteObjectInvocationHandler> createNewSUT() {
        return java.rmi.server.RemoteObjectInvocationHandler.class;
    }

}
