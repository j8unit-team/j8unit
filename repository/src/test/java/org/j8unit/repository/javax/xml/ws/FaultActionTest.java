package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.FaultAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FaultActionTest
implements org.j8unit.repository.javax.xml.ws.FaultActionTests<FaultAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.FaultAction]

    @Override
    public FaultAction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.FaultAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.FaultAction]

}
