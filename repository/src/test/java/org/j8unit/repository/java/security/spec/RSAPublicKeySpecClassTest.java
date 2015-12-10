package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPublicKeySpecClassTest
implements org.j8unit.repository.java.security.spec.RSAPublicKeySpecClassTests<java.security.spec.RSAPublicKeySpec> {

    @Override
    public Class<java.security.spec.RSAPublicKeySpec> createNewSUT() {
        return java.security.spec.RSAPublicKeySpec.class;
    }

}
