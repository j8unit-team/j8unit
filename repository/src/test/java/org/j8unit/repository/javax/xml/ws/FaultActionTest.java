package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.FaultAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FaultAction} (by simply reusing the
 * J8Unit test interface {@link FaultActionTests}).
 */

@RunWith(J8Unit4.class)
public class FaultActionTest
implements FaultActionTests<FaultAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.FaultAction]

    @Override
    public FaultAction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.FaultAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.FaultAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.FaultAction]

}
