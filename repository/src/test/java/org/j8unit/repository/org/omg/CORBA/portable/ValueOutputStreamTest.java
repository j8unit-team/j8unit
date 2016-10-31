package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ValueOutputStream;

@RunWith(J8Unit4.class)
public class ValueOutputStreamTest
implements org.j8unit.repository.org.omg.CORBA.portable.ValueOutputStreamTests<ValueOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ValueOutputStream]

    @Override
    public ValueOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.ValueOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.ValueOutputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.ValueOutputStream]

}
