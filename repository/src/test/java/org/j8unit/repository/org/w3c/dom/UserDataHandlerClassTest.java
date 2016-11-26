package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.UserDataHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UserDataHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.UserDataHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class UserDataHandlerClassTest
implements UserDataHandlerClassTests<UserDataHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.UserDataHandler]

    @Override
    public Class<UserDataHandler> createNewSUT() {
        return UserDataHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.UserDataHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.UserDataHandler]

}
