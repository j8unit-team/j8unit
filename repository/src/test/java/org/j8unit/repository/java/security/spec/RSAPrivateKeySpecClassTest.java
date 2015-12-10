package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateKeySpecClassTest
implements org.j8unit.repository.java.security.spec.RSAPrivateKeySpecClassTests<java.security.spec.RSAPrivateKeySpec> {

    @Override
    public Class<java.security.spec.RSAPrivateKeySpec> createNewSUT() {
        return java.security.spec.RSAPrivateKeySpec.class;
    }

}
