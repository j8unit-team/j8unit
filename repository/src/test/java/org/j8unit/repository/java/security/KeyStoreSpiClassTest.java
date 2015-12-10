package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreSpiClassTest
implements org.j8unit.repository.java.security.KeyStoreSpiClassTests<java.security.KeyStoreSpi> {

    @Override
    public Class<java.security.KeyStoreSpi> createNewSUT() {
        return java.security.KeyStoreSpi.class;
    }

}
