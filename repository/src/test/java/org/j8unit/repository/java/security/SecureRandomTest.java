package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecureRandomTest
implements org.j8unit.repository.java.security.SecureRandomTests<java.security.SecureRandom> {

    @Override
    public java.security.SecureRandom createNewSUT() {
        return new java.security.SecureRandom();
    }

}
