package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_POLICY_TYPE;

@RunWith(J8Unit4.class)
public class BAD_POLICY_TYPETest
implements org.j8unit.repository.org.omg.CORBA.BAD_POLICY_TYPETests<BAD_POLICY_TYPE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.BAD_POLICY_TYPE]

    @Override
    public BAD_POLICY_TYPE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.BAD_POLICY_TYPE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.BAD_POLICY_TYPE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.BAD_POLICY_TYPE]

}
