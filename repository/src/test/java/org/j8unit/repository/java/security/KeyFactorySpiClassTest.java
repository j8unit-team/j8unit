package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyFactorySpiClassTest
implements org.j8unit.repository.java.security.KeyFactorySpiClassTests<java.security.KeyFactorySpi> {

    @Override
    public Class<java.security.KeyFactorySpi> createNewSUT() {
        return java.security.KeyFactorySpi.class;
    }

}
