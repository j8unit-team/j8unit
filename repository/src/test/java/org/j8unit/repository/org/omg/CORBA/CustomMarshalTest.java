package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.CustomMarshal;

@RunWith(J8Unit4.class)
public class CustomMarshalTest
implements org.j8unit.repository.org.omg.CORBA.CustomMarshalTests<CustomMarshal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CustomMarshal]

    @Override
    public CustomMarshal createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.CustomMarshal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CustomMarshal]

}
