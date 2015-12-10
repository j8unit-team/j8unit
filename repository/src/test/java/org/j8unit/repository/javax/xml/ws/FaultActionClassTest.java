package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FaultActionClassTest
implements org.j8unit.repository.javax.xml.ws.FaultActionClassTests<javax.xml.ws.FaultAction> {

    @Override
    public Class<javax.xml.ws.FaultAction> createNewSUT() {
        return javax.xml.ws.FaultAction.class;
    }

}
