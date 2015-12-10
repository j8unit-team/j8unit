package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyClassTest
implements org.j8unit.repository.java.security.KeyClassTests<java.security.Key> {

    @Override
    public Class<java.security.Key> createNewSUT() {
        return java.security.Key.class;
    }

}
