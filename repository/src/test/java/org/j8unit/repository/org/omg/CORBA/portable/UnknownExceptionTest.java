package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownExceptionTest
implements org.j8unit.repository.org.omg.CORBA.portable.UnknownExceptionTests<org.omg.CORBA.portable.UnknownException> {

    @Override
    public org.omg.CORBA.portable.UnknownException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.omg.CORBA.portable.UnknownException] available.");
    }

}
