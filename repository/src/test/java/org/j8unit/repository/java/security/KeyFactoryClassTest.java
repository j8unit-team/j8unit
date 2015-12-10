package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyFactoryClassTest
implements org.j8unit.repository.java.security.KeyFactoryClassTests<java.security.KeyFactory> {

    @Override
    public Class<java.security.KeyFactory> createNewSUT() {
        return java.security.KeyFactory.class;
    }

}
