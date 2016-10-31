package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.Delegate;

@RunWith(J8Unit4.class)
public class DelegateTest
implements org.j8unit.repository.org.omg.CORBA.portable.DelegateTests<Delegate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.Delegate]

    @Override
    public Delegate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.Delegate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.Delegate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.Delegate]

}
