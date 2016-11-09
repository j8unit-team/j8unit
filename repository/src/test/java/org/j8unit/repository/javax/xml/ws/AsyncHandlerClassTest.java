package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.AsyncHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AsyncHandler} (by simply reusing the
 * J8Unit test interface {@link AsyncHandlerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AsyncHandlerClassTest
implements AsyncHandlerClassTests<AsyncHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.AsyncHandler]

    @Override
    public Class<AsyncHandler> createNewSUT() {
        return AsyncHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.AsyncHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.AsyncHandler]

}
