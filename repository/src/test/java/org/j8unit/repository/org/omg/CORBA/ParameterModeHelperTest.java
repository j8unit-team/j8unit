package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ParameterModeHelper;

@RunWith(J8Unit4.class)
public class ParameterModeHelperTest
implements org.j8unit.repository.org.omg.CORBA.ParameterModeHelperTests<ParameterModeHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ParameterModeHelper]

    @Override
    public ParameterModeHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ParameterModeHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.ParameterModeHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.ParameterModeHelper]

}
