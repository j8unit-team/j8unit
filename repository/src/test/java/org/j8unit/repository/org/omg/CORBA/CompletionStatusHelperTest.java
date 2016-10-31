package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.CompletionStatusHelper;

@RunWith(J8Unit4.class)
public class CompletionStatusHelperTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusHelperTests<CompletionStatusHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CompletionStatusHelper]

    @Override
    public CompletionStatusHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.CompletionStatusHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.CompletionStatusHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.CompletionStatusHelper]

}
