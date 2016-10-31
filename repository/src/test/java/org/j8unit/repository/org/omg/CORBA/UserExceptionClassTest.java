package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.UserException;

@RunWith(J8Unit4.class)
public class UserExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests<UserException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UserException]

    @Override
    public Class<UserException> createNewSUT() {
        return UserException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UserException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UserException]

}
