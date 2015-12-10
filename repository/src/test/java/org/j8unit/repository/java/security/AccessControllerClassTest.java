package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessControllerClassTest
implements org.j8unit.repository.java.security.AccessControllerClassTests<java.security.AccessController> {

    @Override
    public Class<java.security.AccessController> createNewSUT() {
        return java.security.AccessController.class;
    }

}
