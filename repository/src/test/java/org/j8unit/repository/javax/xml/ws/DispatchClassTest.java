package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Dispatch;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Dispatch} (by simply reusing the J8Unit
 * test interface {@link DispatchClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DispatchClassTest
implements DispatchClassTests<Dispatch> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Dispatch]

    @Override
    public Class<Dispatch> createNewSUT() {
        return Dispatch.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Dispatch]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Dispatch]

}
