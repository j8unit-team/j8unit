package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecurityManagerTest
implements org.j8unit.repository.java.lang.SecurityManagerTests<java.lang.SecurityManager> {

    @Override
    public java.lang.SecurityManager createNewSUT() {
        return new java.lang.SecurityManager();
    }

}
