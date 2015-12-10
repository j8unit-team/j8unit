package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UserDataHandlerClassTest
implements org.j8unit.repository.org.w3c.dom.UserDataHandlerClassTests<org.w3c.dom.UserDataHandler> {

    @Override
    public Class<org.w3c.dom.UserDataHandler> createNewSUT() {
        return org.w3c.dom.UserDataHandler.class;
    }

}
