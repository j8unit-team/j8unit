package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecureRandomClassTest
implements org.j8unit.repository.java.security.SecureRandomClassTests<java.security.SecureRandom> {

    @Override
    public Class<java.security.SecureRandom> createNewSUT() {
        return java.security.SecureRandom.class;
    }

}
