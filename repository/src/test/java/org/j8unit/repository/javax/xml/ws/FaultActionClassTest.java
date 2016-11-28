package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.FaultAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FaultAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.FaultActionClassTests}).
 */
@RunWith(J8Unit4.class)
public class FaultActionClassTest
implements FaultActionClassTests<FaultAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.FaultAction]

    @Override
    public Class<FaultAction> createNewSUT() {
        return FaultAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.FaultAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.FaultAction]

}
