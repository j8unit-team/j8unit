package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.Handler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Handler} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.handler.HandlerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class HandlerClassTest
implements HandlerClassTests<Handler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.Handler]

    @Override
    public Class<Handler> createNewSUT() {
        return Handler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.Handler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.Handler]

}
