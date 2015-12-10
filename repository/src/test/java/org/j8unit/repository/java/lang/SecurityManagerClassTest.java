package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityManagerClassTest
implements org.j8unit.repository.java.lang.SecurityManagerClassTests<java.lang.SecurityManager> {

    @Override
    public Class<java.lang.SecurityManager> createNewSUT() {
        return java.lang.SecurityManager.class;
    }

}
