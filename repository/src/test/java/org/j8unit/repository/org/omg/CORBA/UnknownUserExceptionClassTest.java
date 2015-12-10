package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionClassTests<org.omg.CORBA.UnknownUserException> {

    @Override
    public Class<org.omg.CORBA.UnknownUserException> createNewSUT() {
        return org.omg.CORBA.UnknownUserException.class;
    }

}
