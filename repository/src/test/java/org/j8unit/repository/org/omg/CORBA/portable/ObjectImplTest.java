package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ObjectImpl;

@RunWith(J8Unit4.class)
public class ObjectImplTest
implements org.j8unit.repository.org.omg.CORBA.portable.ObjectImplTests<ObjectImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ObjectImpl]

    @Override
    public ObjectImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.ObjectImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ObjectImpl]

}
