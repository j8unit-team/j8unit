package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ServiceDetailHelper;

@RunWith(J8Unit4.class)
public class ServiceDetailHelperTest
implements org.j8unit.repository.org.omg.CORBA.ServiceDetailHelperTests<ServiceDetailHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ServiceDetailHelper]

    @Override
    public ServiceDetailHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ServiceDetailHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ServiceDetailHelper]

}
