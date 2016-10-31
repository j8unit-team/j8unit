package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;

@RunWith(J8Unit4.class)
public class ObjectTest
implements org.j8unit.repository.org.omg.CORBA.ObjectTests<Object> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.Object]

    @Override
    public Object createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.Object], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.Object]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.Object]

}
