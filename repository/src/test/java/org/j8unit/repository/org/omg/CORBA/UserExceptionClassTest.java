package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.UserException;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UserException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UserExceptionClassTest
implements UserExceptionClassTests<UserException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UserException]

    @Override
    public Class<UserException> createNewSUT() {
        return UserException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UserException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UserException]

}
