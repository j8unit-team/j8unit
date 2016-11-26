package org.j8unit.repository.java.rmi.server;

import java.rmi.server.LoaderHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LoaderHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.LoaderHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class LoaderHandlerClassTest
implements LoaderHandlerClassTests<LoaderHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.LoaderHandler]

    @Override
    public Class<LoaderHandler> createNewSUT() {
        return LoaderHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.LoaderHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.LoaderHandler]

}
