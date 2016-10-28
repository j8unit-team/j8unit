package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.FaultAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FaultActionClassTest
implements org.j8unit.repository.javax.xml.ws.FaultActionClassTests<FaultAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.FaultAction]

    @Override
    public Class<FaultAction> createNewSUT() {
        return FaultAction.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.FaultAction]

}
