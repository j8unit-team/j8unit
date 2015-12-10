package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairTest
implements org.j8unit.repository.java.security.KeyPairTests<java.security.KeyPair> {

    @Override
    public java.security.KeyPair createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.security.KeyPair] available.");
    }

}
