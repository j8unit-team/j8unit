package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.InputStream;

@RunWith(J8Unit4.class)
public class InputStreamTest
implements org.j8unit.repository.org.omg.CORBA.portable.InputStreamTests<InputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.InputStream]

    @Override
    public InputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.portable.InputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.InputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.InputStream]

}
