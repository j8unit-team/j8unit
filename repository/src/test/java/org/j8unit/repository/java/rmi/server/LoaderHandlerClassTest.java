package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoaderHandlerClassTest
implements org.j8unit.repository.java.rmi.server.LoaderHandlerClassTests<java.rmi.server.LoaderHandler> {

    @Override
    public Class<java.rmi.server.LoaderHandler> createNewSUT() {
        return java.rmi.server.LoaderHandler.class;
    }

}
