package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyFactoryTest
implements org.j8unit.repository.java.security.KeyFactoryTests<java.security.KeyFactory> {

    @Override
    public java.security.KeyFactory createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.security.KeyFactory] available.");
    }

}
