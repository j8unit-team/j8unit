package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CryptoPrimitiveClassTest
implements org.j8unit.repository.java.security.CryptoPrimitiveClassTests<java.security.CryptoPrimitive> {

    @Override
    public Class<java.security.CryptoPrimitive> createNewSUT() {
        return java.security.CryptoPrimitive.class;
    }

}
