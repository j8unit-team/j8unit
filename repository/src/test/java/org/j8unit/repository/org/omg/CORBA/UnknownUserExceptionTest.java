package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionTests<org.omg.CORBA.UnknownUserException> {

    @Override
    public org.omg.CORBA.UnknownUserException createNewSUT() {
        return new org.omg.CORBA.UnknownUserException();
    }

}