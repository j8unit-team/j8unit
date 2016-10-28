package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.ServiceMode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceModeTest
implements org.j8unit.repository.javax.xml.ws.ServiceModeTests<ServiceMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.ServiceMode]

    @Override
    public ServiceMode createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.ServiceMode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.ServiceMode]

}
