package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAKeyClassTests<java.security.interfaces.DSAKey> {

    @Override
    public Class<java.security.interfaces.DSAKey> createNewSUT() {
        return java.security.interfaces.DSAKey.class;
    }

}
