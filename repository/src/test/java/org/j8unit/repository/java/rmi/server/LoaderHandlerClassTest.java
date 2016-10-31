package org.j8unit.repository.java.rmi.server;

import java.rmi.server.LoaderHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoaderHandlerClassTest
implements org.j8unit.repository.java.rmi.server.LoaderHandlerClassTests<LoaderHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.LoaderHandler]

    @Override
    public Class<LoaderHandler> createNewSUT() {
        return LoaderHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.LoaderHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.LoaderHandler]

}
