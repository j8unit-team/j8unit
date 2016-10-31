package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.ApplicationException;

@RunWith(J8Unit4.class)
public class ApplicationExceptionTest
implements org.j8unit.repository.org.omg.CORBA.portable.ApplicationExceptionTests<ApplicationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.ApplicationException]

    @Override
    public ApplicationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.omg.CORBA.portable.ApplicationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.ApplicationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.ApplicationException]

}
