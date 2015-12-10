package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UserExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests<org.omg.CORBA.UserException> {

    @Override
    public Class<org.omg.CORBA.UserException> createNewSUT() {
        return org.omg.CORBA.UserException.class;
    }

}
