package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.UserDataHandler;

@RunWith(J8Unit4.class)
public class UserDataHandlerClassTest
implements org.j8unit.repository.org.w3c.dom.UserDataHandlerClassTests<UserDataHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.UserDataHandler]

    @Override
    public Class<UserDataHandler> createNewSUT() {
        return UserDataHandler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.UserDataHandler]

}
